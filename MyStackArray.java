public class MyStackArray {

	private String[] stack;
	private int top;
	private int maxSize;
	
	public getMaxSize(){ return this.maxSize; }
	public getTop(){ return this.top; }
	
	public MyStackArray(int maxSize){
		if(maxSize <= 0) maxSize = 1;
		this.maxSize = maxSize;
		stack = new String[maxSize];
		top = -1;
	}
	
	
	public boolean push(String data){
		//if stack is full, abort and return -1
		if(top == maxSize-1) return false;
		//esle push onto stack
		else{
			stack[++top] = data;
		}
		return true;
	}


	public boolean pop(){
		//if not empty pop
		if(top > 0){
			//top -- : first set top to null and then decrement
			stack[top--] = null;
			return true;
		}
		else return false;
		//else return false
	}


	public String peek(){
		if(top == -1) return "";
		return stack[top];
	}
	
	
	public boolean isEmpty(){
		return (top == 0 || top == -1);
	}


	public boolean isFull(){
		return top == stack.length-1;
	}
	
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
