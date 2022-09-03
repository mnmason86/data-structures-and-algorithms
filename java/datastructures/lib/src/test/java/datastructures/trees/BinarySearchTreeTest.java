package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

  BinarySearchTree<Integer> sut = new BinarySearchTree<>();
  @Test
  public void addLeftTest(){
    sut.add(10);
    sut.add(9);
    sut.add(11);

    assertEquals(sut.root.left.value, 9);
    assertEquals(sut.root.right.value, 11);
  }

  @Test
  public void preOrderTest(){
    sut.add(15);
    sut.add(10);
    sut.add(19);
    sut.add(6);
    sut.add(11);
    sut.add(16);
    sut.add(22);

    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(15,10,6,11,19,16,22));
    assertEquals(result, sut.preOrderTraversal());
  }
  @Test
  public void inOrderTest(){
    sut.add(15);
    sut.add(10);
    sut.add(19);
    sut.add(6);
    sut.add(11);
    sut.add(16);
    sut.add(22);

    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(6,10,11,15,16,19,22));
    assertEquals(result, sut.inOrderTraversal());
  }

  @Test
  public void postOrderTest(){
    sut.add(15);
    sut.add(10);
    sut.add(19);
    sut.add(6);
    sut.add(11);
    sut.add(16);
    sut.add(22);

    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(6,11,10,16,22,19,15));
    assertEquals(result, sut.postOrderTraversal());
  }

  @Test
  public void containsTest(){
    sut.add(6);
    assertTrue(sut.contains(6));
    assertFalse(sut.contains(5));
  }
}
