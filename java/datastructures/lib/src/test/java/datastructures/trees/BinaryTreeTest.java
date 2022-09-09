package datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTest {

  BinaryTree<Integer> sut = new BinaryTree<Integer>();
  @Test
  public void instantiateEmptyTest(){
    assertNotNull(sut);
  }
//  @Test
//  public void instantiateWithRootTest() {
//    sut.root = new TNode<T>(9);
//    assertTrue(sut.root.value == 9);
//  }

}
