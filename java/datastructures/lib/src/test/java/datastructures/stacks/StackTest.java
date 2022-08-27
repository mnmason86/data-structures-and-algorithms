package datastructures.stacks;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  @Test
  void pushTest() {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);
    assertEquals(1, sut.stackSize);
  }
  @Test
  void multiPushTest(){
    Stack<Integer> sut = new Stack<>();
    sut.push(8);
    sut.push(2);
    sut.push(9);
    assertEquals(3, sut.stackSize);
  }
  @Test
  void popTest(){
    Stack<Integer> sut = new Stack<>();
    sut.push(7);
    sut.push(0);
    sut.pop();
    assertEquals(1, sut.stackSize);
  }
  @Test
  void popMultipleTest(){
    Stack<Integer> sut = new Stack<>();
    sut.push(8);
    sut.push(14);
    sut.push(4);
    sut.pop();
    sut.pop();
    sut.pop();
    assertTrue(sut.isEmpty());
  }
  @Test
  void peekTest(){
    Stack<Integer> sut = new Stack<>();
    sut.push(99);
    sut.push(65);
    assertEquals(65, (int) sut.peek());
  }
  @Test
  void instantiateTest(){
    Stack<String> sut = new Stack<>();
    assertEquals(0, sut.stackSize);
  }
  @Test
  void popEmptyTest(){
    Stack<Integer> sut = new Stack<>();
    assertThrows(EmptyStackException.class, sut::pop);
  }

  @Test
  void peekEmptyTest(){
    Stack<Integer> sut = new Stack<>();
    assertThrows(EmptyStackException.class, sut::peek);
  }
}
