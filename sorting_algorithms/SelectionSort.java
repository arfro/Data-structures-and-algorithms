import java.util.Random;

public class SelectionSort {
	

		public static int[] fillArray(int[] arr){
			Random rand = new Random();
		    for(int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(1000000-1);
		    return arr;
		}
		
		public static void printArray(int[] arr){
			for(int i : arr) System.out.println(i);			
		}
		
		public static int[] selectionSort(int[] arr){
			if(arr.length < 2) return arr;
			
			int maxValue = arr[0];
			int maxIndex = 0;
			int temp = 0;
			
			for(int h = 0; h < arr.length; h++){				
				for(int i = 0; i < arr.length-h; i++){
					if(arr[i] > maxValue){
						maxValue = arr[i];
						maxIndex = i;
					}
				}
				temp = arr[arr.length-1-h];
				arr[arr.length-1-h] = maxValue;
				arr[maxIndex] = temp;
				maxValue = arr[0];
				maxIndex = 0;
			}
			
			return arr;
		}
	
}
