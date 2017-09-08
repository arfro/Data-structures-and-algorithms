import java.util.Random;

public class InsertionSort {


		public static int[] fillArray(int[] arr){
			Random rand = new Random();
		    for(int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(100-1);
		    return arr;
		}
		
		public static void printArray(int[] arr){
			for(int i : arr) System.out.println(i);			
		}
		
		public static int[] insertionSort(int[] arr){
			if(arr.length < 2) return arr;
			
			//check [0] with [1], if [1] less than [0] swap them
			// check [1] with [2], if [2] less than [1] swap them, if [2] less than [0] swap them etc.
			
			for(int i = 1; i < arr.length; i++){
				for(int j = i, k = i-1; k >=0; j--, k--){
					//need j variable because otherwise we would have to change i in this loop and this would disrupt the count of the first loop
					if(arr[j] < arr[k]){
						int temp = arr[k];
						arr[k] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			return arr;
		}
	
}
