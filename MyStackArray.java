public class MyStackArray {

	private String[] stack;
	private int top;
	private int maxSize = 3;
	
	public MyStackArray(){
		stack = new String[maxSize];
		top = -1;
	}
	
	//push
	public boolean push(String data){
		//test cases: overflow, top == maxsize-1, 
		//if stack is full, abort and return -1
		if(top == maxSize-1) return false;
		//esle push onto stack
		else{
			stack[++top] = data;
		}
		return true;
	}
	
	//pop
	public boolean pop(){
		//test cases:
		//if not empty pop
		if(top > 0){
			//top -- : first set top to null and then decrement
			stack[top--] = null;
			return true;
		}
		else return false;
		//else return false
	}
	
	//peek
	public String peek(){
		if(top == -1) return "";
		return stack[top];
	}
	
	//isEmpty
	public boolean isEmpty(){
		// test cases: 1. top after pops, 2. top after new MySA object
		return (top == 0 || top == -1);
	}
	
	//isFull
	public boolean isFull(){
		return top == stack.length-1;
	}
	
	//toString
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(int i=0; i < stack.length; i++){
			if(stack[i] == null) continue;
			if(i == stack.length-1) result.append(stack[i]);
			else result.append(stack[i] + " ");
		}
		return result.toString();
	}
	
}
