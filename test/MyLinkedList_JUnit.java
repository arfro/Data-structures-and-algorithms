import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyLinkedList_JUnit {
    @Test
    public void positive_addTwoElements() {
      MyLinkedList list = new MyLinkedList();
      list.insertToEnd(new Node("last"));
      list.insertToFront(new Node("first"));
      assertEquals("first last", list);
    }
	
	 @Test
    public void positive_revertFiveElements() {
      MyLinkedList list = new MyLinkedList();
      list.insertToFront(new Node("1"));
      list.insertToFront(new Node("2"));
      list.insertToFront(new Node("3"));
      list.insertToFront(new Node("6"));
      list.insertToFront(new Node("8"));
	  list.revert();
      assertEquals("8 6 3 2 1", list);
    }

}
