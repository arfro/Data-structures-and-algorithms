import java.util.Random;

public class BubbleSort {

		public static int[] fillArray(int[] arr){
			Random rand = new Random();
		    for(int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(1000000-1);
		    return arr;
		}
		
		public static void printArray(int[] arr){
			for(int i : arr) System.out.println(i);			
		}
		
		public static int[] bubbleSort(int[] arr){
			if(arr.length < 2) return arr;
			int temp = 0;
			
			for(int i=0; i < arr.length - 1; i++){ // make sure to go arr.length-1 times - this serves as a 'counter' for inner for
				for(int j=0; j<arr.length - 1 - i; j++){ // for each iteration the last element will be sorted
					if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				}
			}
			return arr;
		}
	
}
