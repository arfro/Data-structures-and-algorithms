import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MyBinarySearchTree_JUnit {

    @Test
    public void MyBinarySearchTree_insert_insertAndValidateParents() {
      MyBinarySearchTree tree = new MyBinarySearchTree();
      tree.insert(20);
      tree.insert(32);
      tree.insert(10);
      tree.insert(15);
      tree.insert(16);
      assertEquals(15, tree.search(10));
      
    }
    
    @Test
    public void MyBinarySearchTree_insert_InsertNegative(){
    	MyBinarySearchTree tree = new MyBinarySearchTree();
    	tree.insert(20);
        tree.insert(-12);
        tree.insert(16);
        assertEquals(20, tree.search(-12).getParent());
    }
    
    @Test
    public void MyBinarySearchTree_insert_InsertOnlyOne(){
    	MyBinarySearchTree tree = new MyBinarySearchTree();
    	tree.insert(20);
        assertEquals(null, tree.search(-12).getParent());
        assertTrue(tree.isRoot(20));
    }
    
    @Test
    public void MyBinarySearchTree_search_noSuchElement() {
      
    }
    
   
    
    @Test 
    public void MyBinarySearchTree_traversePostOrder(){
    	
    }
    
    @Test
    public void MyBinarySearchTree_traversePreOrder(){
    	
    }
  

}
