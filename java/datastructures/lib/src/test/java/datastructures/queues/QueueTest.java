package datastructures.queues;

import datastructures.linkedlist.Queue;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  Queue<Integer> sut = new Queue<>();

  @Test
  void enqueueTest(){

    sut.enqueue(2);
    assertEquals(1, sut.queueSize);
  }
  @Test
  void multiEnqueueTest(){
    sut.enqueue(8);
    sut.enqueue(2);
    sut.enqueue(9);
    assertEquals(3, sut.queueSize);
  }
  @Test
  void dequeueTest(){
    sut.enqueue(5);
    sut.enqueue(12);
    sut.enqueue(90);
    sut.dequeue();
    assertEquals(12, sut.peek());
  }
  @Test
  void multiDequeueTest() {
    sut.enqueue(5);
    sut.enqueue(12);
    sut.enqueue(90);
    sut.dequeue();
    sut.dequeue();
    sut.dequeue();
    assertThrows(EmptyStackException.class, sut::peek);
  }
  @Test
  void instantiateTest(){
    assertTrue(sut.isEmpty());
  }
}
