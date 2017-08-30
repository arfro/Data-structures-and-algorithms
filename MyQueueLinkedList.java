public class MyQueueLinkedList {

	Node head;
	
	public MyQueueLinkedList(){
		this.head = null;
	}
	
	public boolean enqueue(Node node){
		if(head == null){
			head = node;
			return true;
		}
		Node temp = head;
		while( temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
		return true;
	}
	
	public Node dequeue(){
		if(this.isEmpty()) return new Node("");
		Node temp = head;
		head = head.next;
		return head;
	}
	
	public boolean isEmpty(){
		if(head == null) return true;
		else return false;
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		Node temp = head;
		while( temp != null){
			result.append(temp.data + " ");
			temp = temp.next;
		}
		return result.toString();
	}
	
	public Node peek(){
		return head;
	}
		
	
	public static void main(String[] at){
		MyQueueLinkedList queue = new MyQueueLinkedList();
		System.out.print(queue.isEmpty());
		queue.enqueue(new Node("ab"));
		queue.enqueue(new Node("cde"));
		queue.dequeue();
		System.out.println(queue);
	}
}

class Node{
	
	Node next;
	String data;
	
	public Node(String data){
		this.data = data;
	}
	
	public String toString(){
		return data;
	}
}
