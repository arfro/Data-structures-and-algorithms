import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class InsertionSort_JUnit{
	
	@Test
	public void InsertionSort_sort_PositiveTest(){
		int[] array = new int[50];
		InsertionSort.fillArray(array);
		assertEquals(Arrays.sort(array), InsertionSort.insertionSort(array));
	}
	
	@Test
	public void InsertionSort_sort_NoElements(){
		int[] array = new int[0];
		assertEquals(array, InsertionSort.insertionSort(array));
	}
	
	@Test
	public void InsertionSort_sort_OneElement(){
		int[] array = new int[1];
		InsertionSort.fillArray(array);
		assertEquals(array, InsertionSort.insertionSort(array));
	}
	
}