import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyStackLinkedList_JUnit {

    @Test
    public void MyStackLinkedList_push_pushToEmptyArray() {
      MyStackLinkedList stack = new MyStackLinkedList();
      stack.push("1");
      assertEquals("1", stack.peek());
    }
    @Test
    public void MyStackLinkedList_push_pushToEmptyArrayThenPopThenPushAgain() {
      MyStackLinkedList stack = new MyStackLinkedList();
      stack.push("1");
      stack.pop();
      stack.push("1");
      assertEquals("1", stack.peek());
    }

    @Test
    public void MyStackLinkedList_pop_popEmptyArray() {
      MyStackLinkedList stack = new MyStackLinkedList();
      assertFalse("Possibly popping from empty stack", stack.pop());
    }

    @Test
    public void MyStackLinkedList_peek_peekEmpty() {
      MyStackLinkedList stack = new MyStackLinkedList();
      assertEquals("",  stack.peek());
    }
    @Test
    public void MyStackLinkedList_isEmpty_empty() {
      MyStackLinkedList stack = new MyStackLinkedList();
      assertTrue("Should be empty",  stack.isEmpty());
    }
    @Test
    public void MyStackLinkedList_isEmpty_NotEmpty() {
      MyStackLinkedList stack = new MyStackLinkedList();
      stack.push("a");
      assertFalse("Should not be empty", stack.isEmpty());
    }
    @Test
    public void MyStackLinkedList_isEmpty_pushThenPopThenPushThenCheck() {
      MyStackLinkedList stack = new MyStackLinkedList();
      stack.push("a");
      stack.pop();
      stack.push("a");
      assertFalse("Should not be empty", stack.isEmpty());
    }
    @Test
    public void MyStackLinkedList_isEmpty_pushThenPopThenPushThenPopThenCheck() {
      MyStackLinkedList stack = new MyStackLinkedList();
      stack.push("a");
      stack.pop();
      stack.push("a");
      stack.pop();
      assertTrue("Should be empty", stack.isEmpty());
    }
  

}
