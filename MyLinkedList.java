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
		
	//search for value
		public Node searchForNodeWithValue(String val){
			Node temp = head;
			while(temp != null){
				if(temp.data.equals(val)) return temp;
				temp = temp.next;
			}
			return new Node("");
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
	
		public void revert(){
			//if list has only one element or is empty, return
			if(head==null||head.next==null) return;
			
			Node p1 = head;
			Node p2 = p1.next;
			//head will be the last element of the list after reverse and so should point to null
			head.next = null;
			
			while(p1 != null && p2 != null){
				//while not last element change p2.next to point to p1 instead of the current next
				Node temp = p2.next;
				p2.next = p1;
				p1 = p2;
				p2 = temp;
			}
			//p1 after the while loop will be set to the last element. make it head
			head = p1;
		}
 
	
}

class Node{
	
	String data;
	Node next;
	
	public Node(String data){
		this.data = data;
	}
	
	public String toString(){
		return data;
	}
	
}
