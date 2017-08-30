import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyQueueLinkedList_JUnit {
    @Test
    public void MyQueueLinkedList_Constructor_PassNegativeValueToConstructor() {
      MyQueueLinkedList queue = new MyQueueLinkedList(-1);
      assertEquals(0, queue.getSize());
    }
    @Test
    public void MyQueueLinkedList_enqueue_enqueueToEmptyArray() {
      MyQueueLinkedList queue = new MyQueueLinkedList(10);
      queue.enqueue(2);
      assertEquals(2, queue.peek());
    }
    @Test
    public void MyQueueLinkedList_enqueue_enqueueToEmptyArrayThenDequeueThenEnqueueAgain() {
      MyQueueLinkedList queue = new MyQueueLinkedList(10);
      queue.enqueue(1);
      queue.dequeue();
      queue.enqueue(3);
      assertEquals(1, queue.peek());
    }

    @Test
    public void MyQueueLinkedList_dequeue_dequeueEmptyArray() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      assertEquals("", queue.dequeue());
    }
   
    @Test
    public void MyQueueLinkedList_peek_peekEmpty() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      assertEquals(null,  queue.peek());
    }
    @Test
    public void MyQueueLinkedList_isEmpty_empty() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      assertTrue("Should be empty",  queue.isEmpty());
    }
    @Test
    public void MyQueueLinkedList_isEmpty_NotEmpty() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      queue.enqueue(7);
      assertFalse("Should not be empty", queue.isEmpty());
    }
    @Test
    public void MyQueueLinkedList_isEmpty_enqueueThenDequeueThenEnqueueThenCheck() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      queue.enqueue(1);
      queue.dequeue();
      queue.enqueue(1);
      assertFalse("Should not be empty", queue.isEmpty());
    }
    @Test
    public void MyQueueLinkedList_isEmpty_enqueueThenDequeueThenEnqueueThenDequeueThenCheck() {
      MyQueueLinkedList queue = new MyQueueLinkedList(2);
      queue.enqueue(3);
      queue.dequeue();
      queue.enqueue(2);
      queue.dequeue();
      assertTrue("Should be empty", queue.isEmpty());
    }
 
}
