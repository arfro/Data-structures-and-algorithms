public class MyQueueArray {

	int[] queue;
	int first = -1;
	int last = -1;
	
	//constructor
	public MyQueueArray(int size){
		if(size > Integer.MAX_VALUE) queue = new int[Integer.MAX_VALUE];
		else if(size < 0) queue = new int[0];
		else queue = new int[size];
	}
	
	//enqueue
	public boolean enqueue(int data){
		//is there space?
		if(this.isFull()) return false;
		if(this.isEmpty()){
			first = 0;
			last = 0;
			queue[first] = data;
		}
		else{
			last++;
			queue[last] = data;
		}
		return true;
	}
	
	//dequeue
	public int dequeue(){
		int firstElement = -1;
		if(this.isEmpty()) return -1;
		else{
			firstElement = queue[first];
			//for each element move it to index -1
			for(int i = 1; i < queue.length; i++){
				queue[i-1] = queue[i];
			}
			queue[queue.length-1] = 0;
			last--;
		}
		return firstElement;
	}
	
	//peek
	public int peek(){
		//return element that is next element to be dequeued
		//if the size is greater than 0
		if(this.isEmpty()) return -1;
		return queue[first];
	}
	
	//isEmpty
	public boolean isEmpty(){
		return (first == -1 || last == -1);
	}
	
	
	//isFull
	public boolean isFull(){
		return (last == (queue.length - 1));
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(int i : queue)
				if(i != 0)result.append(i);
		return result.toString();
	}		
	
}
