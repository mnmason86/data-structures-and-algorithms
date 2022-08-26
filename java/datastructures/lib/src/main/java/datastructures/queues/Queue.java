package datastructures.queues;

import java.util.EmptyStackException;

public class Queue<T> {
  private Node<T> front = null;
  private Node<T> rear = null;
  private int queueSize = 0;

  public Queue() {

  }

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);
    if (queueSize == 0){
      newNode = front;
      newNode = rear;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public T dequeue(){
    Node<T> temp = front;
    if (front == null){
      throw new EmptyStackException();
    }
    front = front.next;
    temp.next = null;
    return temp.value;
  }

  public T peek(){
    if (front == null){
      throw new EmptyStackException();
    }
    return front.value;
  }

  public boolean isEmpty() {
    return queueSize == 0;
  }

}
