public class MyBinarySearchTree {

	Node root;
	
	public MyBinarySearchTree(){
		root = null;
	}
	
	// insert
	public boolean insert(int data){
		Node nodeToAdd = new Node(data);
		
		if(root == null){
			root = nodeToAdd;
			System.out.print("Adding " + nodeToAdd.getData() + " as root\n");
			return true;
		}
		else return traverseAndAdd(root, nodeToAdd);		
	}
	
	//traverse - preOrder
	private void traversePreOrder(Node node){
		if(node == null){
			System.out.println("");
			return;
		}
		else{
			System.out.println(node.getData());
			if(node.getLeft() != null) traversePreOrder(node.getLeft());
			if (node.getRight() != null) traversePreOrder(node.getRight());
		}
	}
	
	//traverse - in order // left root right
	private void traverseInOrder(Node node){
		if(node == null){
			System.out.println("");
			return;
		}
		else{
			if(node.getLeft() != null){
				traverseInOrder(node.getLeft());
			}
			System.out.println(node.getData());
			if (node.getRight() != null){
				traverseInOrder(node.getRight());
			}
		}
	}
	
	//traverse - post order // left right root
		private void traversePostOrder(Node node){
			if(node == null){
				System.out.println("");
				return;
			}
			else{
				if(node.getLeft() != null){
					traverseInOrder(node.getLeft());
				}
				if (node.getRight() != null){
					traverseInOrder(node.getRight());
				}
				System.out.println(node.getData());
			}
		}
	
	
	//traverseAndAdd
	private boolean traverseAndAdd(Node node, Node nodeToAdd){
		if(nodeToAdd.getData() < node.getData()){
				if(node.getLeft() == null){
					node.setLeft(nodeToAdd);
					nodeToAdd.setParent(node);
					System.out.print(nodeToAdd.getData() + " - parent is: " + nodeToAdd.getParent() + "\n");
					return true;
				}
				else traverseAndAdd(node.getLeft(), nodeToAdd);		
			}
		else if(nodeToAdd.getData() > node.getData()){
				if(node.getRight() == null){
					node.setRight(nodeToAdd);
					nodeToAdd.setParent(node);
					System.out.print(nodeToAdd.getData() + " - parent is: " + nodeToAdd.getParent() + "\n");
					return true;
				}
				else traverseAndAdd(node.getRight(), nodeToAdd);
			}
		return false;
	}
	
	//search
	private Node search(int value){
		return search(root, value);
	}
	
	
	//search - overloaded
	private Node search(Node node, int searchValue){
			if(node != null){
				if(node.getData() == searchValue) return node;
				if(node.getData() > searchValue){
					return search(node.getLeft(), searchValue);
				}
				if(node.getData() < searchValue){
					return search(node.getRight(), searchValue);
				}
			}
			return new Node(-1);
		}
	
	public boolean isRoot(Node node){
		return node == root;
	}

}

class Node{
	
	Node parent;
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
	public String toString(){
		return Integer.toString(data);
	}
	
	public int getData(){
		return data;
	}
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public Node getParent(){
		if(parent == null) return new Node(-1);
		return parent;
	}
	
	public void setLeft(Node node){
		this.left = node;
	}
	
	public void setRight(Node node){
		this.right = node;
	}
	
	public void setParent(Node node){
		this.parent = node;
	}
}
