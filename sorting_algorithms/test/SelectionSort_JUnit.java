import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SelectionSort_JUnit{
	
	@Test
	public void SelectionSort_sort_PositiveTest(){
		int[] array = new int[50];
		SelectionSort.fillArray(array);
		assertEquals(Arrays.sort(array), SelectionSort.selectionsort(array));
	}
	
	@Test
	public void SelectionSort_sort_NoElements(){
		int[] array = new int[0];
		assertEquals(array, SelectionSort.selectionsort(array));
	}
	
	@Test
	public void SelectionSort_sort_OneElement(){
		int[] array = new int[1];
		SelectionSort.fillArray(array);
		assertEquals(array, SelectionSort.selectionsort(array));
	}
	
}