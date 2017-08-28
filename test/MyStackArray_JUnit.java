import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyStackArray_JUnit {
    @Test
    public void MyStackArray_Constructor_PassNegativeValueToConstructor() {
      MyStackArray stack = new MyStackArray(-1);
      assertEquals(1, stack.getMaxSize());
    }
    @Test
    public void MyStackArray_push_pushToEmptyArray() {
      MyStackArray stack = new MyStackArray(10);
      stack.push("1");
      assertEquals("1", stack.peek());
    }
    @Test
    public void MyStackArray_push_pushToEmptyArrayThenPopThenPushAgain() {
      MyStackArray stack = new MyStackArray(10);
      stack.push("1");
      stack.pop();
      stack.push("1");
      assertEquals("1", stack.peek());
    }
    @Test
    public void MyStackArray_push_pushToFullArray() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("1");
      stack.push("1");
      stack.push("1");
      assertFalse("Possibly overflowing stack", stack.push("1"));
    }
    @Test
    public void MyStackArray_pop_popEmptyArray() {
      MyStackArray stack = new MyStackArray(2);
      assertFalse("Possibly popping from empty stack", stack.pop());
    }
    @Test
    public void MyStackArray_peek_peekFull() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("1");
      stack.push("1");
      assertEquals("1", stack.peek());
    }
    @Test
    public void MyStackArray_peek_peekEmpty() {
      MyStackArray stack = new MyStackArray(2);
      assertEquals("",  stack.peek());
    }
    @Test
    public void MyStackArray_isEmpty_empty() {
      MyStackArray stack = new MyStackArray(2);
      assertTrue("Should be empty",  stack.isEmpty());
    }
    @Test
    public void MyStackArray_isEmpty_NotEmpty() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("a");
      assertFalse("Should not be empty", stack.isEmpty());
    }
    @Test
    public void MyStackArray_isEmpty_pushThenPopThenPushThenCheck() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("a");
      stack.pop();
      stack.push("a");
      assertFalse("Should not be empty", stack.isEmpty());
    }
    @Test
    public void MyStackArray_isEmpty_pushThenPopThenPushThenPopThenCheck() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("a");
      stack.pop();
      stack.push("a");
      stack.pop();
      assertTrue("Should be empty", stack.isEmpty());
    }
    @Test
    public void MyStackArray_isFull_LenghtMinusOne() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("a");
      assertFalse("Should not be full", stack.isFull());
    }
    @Test
    public void MyStackArray_isFull_Lenght() {
      MyStackArray stack = new MyStackArray(2);
      stack.push("a");
      stack.push("a");
      assertTrue("Should be full", stack.isFull());
    }


}
