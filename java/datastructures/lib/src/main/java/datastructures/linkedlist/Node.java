package datastructures.linkedlist;

public class Node <LL>{
  public LL value;
  public Node<LL> next = null;

  public Node (LL value) {

    this.value = value;
  }

  public LL getValue() {
    return value;
  }

  public void setValue(LL value) {
    this.value = value;
  }

  public Node<LL> getNext() {
    return next;
  }

  public void setNext(Node<LL> next) {
    this.next = next;
  }
}
