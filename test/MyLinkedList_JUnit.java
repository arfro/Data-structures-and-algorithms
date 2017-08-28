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

}
