package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }
    @Test void toStringTest(){
    LinkedList<Integer> LL = new LinkedList<Integer>();
      LL.insert(4);
      LL.insert(9);
      LL.insert(0);
      LL.insert(12);

      String stringTest = LL.toString();

      assertTrue(stringTest.contains("{ 9 } -> { 4 }"));
    }

    @Test void insertTest(){
    //ADD
    LinkedList<Integer> LL = new LinkedList<Integer>();
    //ACT
    LL.insert(2);
    //ASSERT
    Assert.assertTrue(LL.head.value == 2);
    }
    @Test void includes(){
    LinkedList<Integer> LL = new LinkedList<>();
    LL.insert(4);
    LL.insert(9);
    LL.insert(0);
    LL.insert(12);

    boolean includesResult = LL.includes(9);
    assertTrue(includesResult);

    boolean includesResult2 = LL.includes(8);
    assertFalse(includesResult2);
   }
}
