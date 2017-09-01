import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BubbleSort_JUnit {
    @Test
    public void BubbleSort_test() {
    	int[] array = new int[] {1, 5, 9, 15, 0, 6, 4, 13, 3};
    	int[] expectedArray = new int[] {0, 1, 3, 4, 5, 6, 9, 13, 15};
		array = bubbleSort(array);
		assertArrayEquals(expectedArray, array);
    }
    
    @Test
    public void BubbleSort_test_empty() {
    	int[] array = new int[] {};
    	int[] expectedArray = new int[] {};
		array = bubbleSort(array);
		assertArrayEquals(expectedArray, array);
    }
    
    @Test
    public void BubbleSort_test_OneElement()) {
    	int[] array = new int[] {4};
    	int[] expectedArray = new int[] {4};
		array = bubbleSort(array);
		assertArrayEquals(expectedArray, array);
    }
 
}
