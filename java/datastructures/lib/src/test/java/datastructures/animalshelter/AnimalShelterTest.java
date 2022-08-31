package datastructures.animalshelter;

import datastructures.linkedlist.AnimalShelter;
import datastructures.linkedlist.PseudoQueue;
import datastructures.linkedlist.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {

  Stack<String> stack1 = new Stack<>();
  Stack<String> stack2 = new Stack<>();

  @Test
  public void enqueueTest(){
    AnimalShelter<String> sut= new AnimalShelter<>();
    sut.enqueue("dog");
    assertTrue(sut != null);
  }
  @Test
  public void dequeueTest(){
    AnimalShelter<Integer> sut = new AnimalShelter<>();
    sut.enqueue("cat");
    sut.enqueue("cat");
    sut.enqueue("cat");
    sut.enqueue("cat");

    assertEquals(null, sut.dequeue("dog"));
  }
  @Test
  public void dequeueTest2(){
    AnimalShelter<Integer> sut = new AnimalShelter<>();
    sut.enqueue("cat");
    sut.enqueue("dog");
    sut.enqueue("dog");
    sut.enqueue("cat");

    assertEquals("cat", sut.dequeue("cat"));
  }
}
