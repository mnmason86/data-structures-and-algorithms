package datastructures.stacks;

public class Node<T> {
  public T value;
  public datastructures.queues.Node<T> next = null;

  public Node (T value){
    this.value = value;
  }

  public Node(){

  }
}
