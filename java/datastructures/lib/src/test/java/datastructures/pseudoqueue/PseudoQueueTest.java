package datastructures.pseudoqueue;

import datastructures.linkedlist.PseudoQueue;

import datastructures.linkedlist.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {

  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  @Test
  public void pseudoEnqueueTest(){
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(5);
    assertNotNull(sut);
  }

  @Test
  public void pseudoDequeueTest(){
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(4);
    sut.enqueue(3);
    sut.enqueue(2);
    sut.enqueue(1);

    assertEquals(4, sut.dequeue());
  }
}
