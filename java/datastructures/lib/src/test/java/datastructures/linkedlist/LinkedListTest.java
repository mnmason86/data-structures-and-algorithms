package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
//  @Test void testAMethod()
//    {
//      LinkedList sut = new LinkedList();
//      System.out.println(sut);
//      assertTrue(true);
//    }
    @Test void toStringTest(){
    LinkedList<Integer> LL = new LinkedList<Integer>();
      LL.insert(4);
      LL.insert(9);
      LL.insert(0);
      LL.insert(12);

      String stringTest = LL.toString();

      assertTrue(stringTest.contains("{ 9 } -> { 4 }"));
    }
//
//    @Test void insertTest(){
//    //ADD
//    LinkedList<Integer> LL = new LinkedList<Integer>();
//    //ACT
//    LL.insert(2);
//    //ASSERT
//    Assert.assertTrue(LL.head.value == 2);
//    }
//    @Test void includesTest(){
//    LinkedList<Integer> LL = new LinkedList<>();
//    LL.insert(4);
//    LL.insert(9);
//    LL.insert(0);
//    LL.insert(12);
//
//    boolean includesResult = LL.includes(9);
//    assertTrue(includesResult);
//
//    boolean includesResult2 = LL.includes(8);
//    assertFalse(includesResult2);
//   }
//
//   @Test void appendTest(){
//    LinkedList<Integer> LL = new LinkedList<>();
//    LL.insert(4);
//     LL.insert(9);
//     LL.insert(0);
//     LL.insert(12);
//
//     LL.append(2);
//
//     assertTrue(LL.includes(2));
//   }
//
//   @Test void insertBeforeTest() {
//    LinkedList<Integer> LL = new LinkedList<>();
//     LL.insert(4);
//     LL.insert(9);
//     LL.insert(0);
//     LL.insert(12);
//
//     LL.insertBefore(4,5);
//
//     String stringTest = LL.toString();
//     assertTrue(stringTest.contains("{ 5 } -> { 4 }"));
//
//   }
//
//   @Test void insertAfterTest() {
//    LinkedList<Integer> LL = new LinkedList<>();
//     LL.insert(4);
//     LL.insert(9);
//     LL.insert(0);
//     LL.insert(12);
//
//     LL.insertAfter(12, 8);
//
//     String stringTest = LL.toString();
//     assertTrue(stringTest.contains("{ 12 } -> { 8 }"));
//   }
//
//   @Test void deleteTest() {
//     LinkedList<Integer> LL = new LinkedList<>();
//     LL.insert(4);
//     LL.insert(9);
//     LL.insert(0);
//     LL.insert(12);
//
//     LL.delete(0);
//
//     assertFalse(LL.includes(0));
//   }

   @Test void kthFromEndTest(){
     LinkedList<Integer> sut = new LinkedList<>();
     sut.insert(4);
     sut.insert(9);
     sut.insert(0);
     sut.insert(12);
     sut.insert(7);
     sut.insert(1);

     assertEquals(4, sut.kthFromEnd(0));
     assertEquals(9, sut.kthFromEnd(1));
     assertEquals(0, sut.kthFromEnd(2));
     assertEquals(12, sut.kthFromEnd(3));
     assertEquals(7, sut.kthFromEnd(4));
     assertEquals(1, sut.kthFromEnd(5));
   }
}
