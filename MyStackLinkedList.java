import java.util.LinkedList;

public class MyStackLinkedList {

	private LinkedList<String> stack;
	private int top;
	
	public MyStackLinkedList(){
		stack = new LinkedList<>();
		top = -1;
	}
	
	
	public boolean push(String data){
		//if stack is full, abort and return -1
			top++;
			stack.add(data);
			return true;
	}


	public boolean pop(){
		//if not empty pop
		if(top >= 0){
			//top -- : first set top to null and then decrement
			top--;
			stack.pop();
			return true;
		}
		else return false;
		//else return false
	}


	public String peek(){
		if(top == -1) return "";
		return stack.peek();
	}
	
	
	public boolean isEmpty(){
		return (top == 0 || top == -1);
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		stack.stream().forEach(s -> result.append(s + " "));
		return result.toString();
	}

	public static void main(String[] as){
		MyStackLinkedList ll = new MyStackLinkedList();
		ll.push("a");
		ll.pop();
		ll.push("a");
		ll.push("a");
		ll.push("a");
		ll.push("a");
		System.out.print(ll.peek());
	}
	
}
