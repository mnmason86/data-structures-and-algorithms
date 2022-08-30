package datastructures.linkedlist;

public class Node<T> {
  public T value;
  public Node<T> next;

  public Node (T value) {
    this.value = value;
  }
  public Node(){

  }

  public T getValue() {
    return this.value;
  }
}
