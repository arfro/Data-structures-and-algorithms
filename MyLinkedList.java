public class MyLinkedList {

		private Node head;
		
		public MyLinkedList(){
			head = null;
		}
	
	//insert first
		public void insertToFront(Node newNode){
			if(head == null){
				head = newNode;
				head.next = null;
			}
			else{
				newNode.next = head;
				head = newNode;
			}
		}
		
	//insert last
		public void insertToEnd(Node newNode){
			if(head == null){
				head = newNode;
				head.next = null;
			}
			else{
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = newNode;
				newNode.next = null;
			}
		}
	
	//delete
		public void deleteNode(Node node){
			Node temp = head;
			while(temp.next != node){
				temp = temp.next;
			}
			Node helper = temp.next;
			temp.next = null;
			temp.next = helper.next;
		}
		
	//print
		public void print(){
			Node temp = head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	//toString
		public String toString(){
			StringBuilder result = new StringBuilder();
			Node temp = head;
			while(temp != null){
				result.append(temp.data);
				if(temp.next != null) result.append(" ");
				temp = temp.next;
			}
			
			return result.toString();
			
		}
		
		public static void main(String[] arg){
			MyLinkedList list = new MyLinkedList();
			list.insertToFront(new Node("1"));
			list.insertToFront(new Node("0"));
			list.insertToEnd(new Node("2"));
			list.insertToFront(new Node("-1"));
			System.out.println(list);
		}
	
}

class Node{
	
	String data;
	Node next;
	
	public Node(String data){
		this.data = data;
	}
	
}
