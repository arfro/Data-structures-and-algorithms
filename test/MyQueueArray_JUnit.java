import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyQueueArray_JUnit {
    @Test
    public void MyQueueArray_Constructor_PassNegativeValueToConstructor() {
      MyQueueArray queue = new MyQueueArray(-1);
      assertEquals(0, queue.getSize());
    }
    @Test
    public void MyQueueArray_enqueue_enqueueToEmptyArray() {
      MyQueueArray queue = new MyQueueArray(10);
      queue.enqueue(2);
      assertEquals(2, queue.peek());
    }
    @Test
    public void MyQueueArray_enqueue_enqueueToEmptyArrayThenDequeueThenEnqueueAgain() {
      MyQueueArray queue = new MyQueueArray(10);
      queue.enqueue(1);
      queue.dequeue();
      queue.enqueue(1);
      assertEquals(1, queue.peek());
    }
    @Test
    public void MyQueueArray_enqueue_enqueueToFullArray() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(1);
      queue.enqueue(1);
      queue.enqueue(1);
      assertFalse("Possibly overflowing queue", queue.enqueue(1));
    }
    @Test
    public void MyQueueArray_dequeue_dequeueEmptyArray() {
      MyQueueArray queue = new MyQueueArray(2);
      assertFalse("Possibly dequeueping from empty queue", queue.dequeue());
    }
    @Test
    public void MyQueueArray_peek_peekFull() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(1);
      queue.enqueue(1);
      assertEquals(1, queue.peek());
    }
    @Test
    public void MyQueueArray_peek_peekEmpty() {
      MyQueueArray queue = new MyQueueArray(2);
      assertEquals(-1,  queue.peek());
    }
    @Test
    public void MyQueueArray_isEmpty_empty() {
      MyQueueArray queue = new MyQueueArray(2);
      assertTrue("Should be empty",  queue.isEmpty());
    }
    @Test
    public void MyQueueArray_isEmpty_NotEmpty() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(7);
      assertFalse("Should not be empty", queue.isEmpty());
    }
    @Test
    public void MyQueueArray_isEmpty_enqueueThenDequeueThenEnqueueThenCheck() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(1);
      queue.dequeue();
      queue.enqueue(1);
      assertFalse("Should not be empty", queue.isEmpty());
    }
    @Test
    public void MyQueueArray_isEmpty_enqueueThenDequeueThenEnqueueThenDequeueThenCheck() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(3);
      queue.dequeue();
      queue.enqueue(2);
      queue.dequeue();
      assertTrue("Should be empty", queue.isEmpty());
    }
    @Test
    public void MyQueueArray_isFull_LenghtMinusOne() {
      MyQueueArray queue = new MyQueueArray(5);
      queue.enqueue(4);
      queue.enqueue(4);
      queue.enqueue(4);
      queue.enqueue(4);
      assertFalse("Should not be full", queue.isFull());
    }
    @Test
    public void MyQueueArray_isFull_Lenght() {
      MyQueueArray queue = new MyQueueArray(2);
      queue.enqueue(5);
      queue.enqueue(2);
      assertTrue("Should be full", queue.isFull());
    }


}
