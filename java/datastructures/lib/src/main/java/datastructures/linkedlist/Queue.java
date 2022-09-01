package datastructures.linkedlist;


import datastructures.linkedlist.Node;

import java.util.EmptyStackException;

public class Queue<T> {
  Node<T> front = null;
  private Node<T> rear = null;
  public int queueSize = 0;

  public Queue() {

  }

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);
    if (queueSize == 0){
      front = newNode;
    } else {
      rear.next = newNode;
    }
    rear = newNode;
    queueSize++;
  }

  public T dequeue(){
    Node<T> temp = front;
    if (front == null){
      throw new EmptyStackException();
    }
    front = front.next;
    temp.next = null;
    queueSize--;
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
