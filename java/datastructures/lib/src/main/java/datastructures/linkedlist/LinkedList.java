package datastructures.linkedlist;

public class LinkedList<LL> {
  public Node<LL> head = null;
  public int listSize = 0;

  public void insert(LL value){
    Node<LL> newHead = new Node<>(value);

    newHead.next = head;
    head = newHead;
    listSize++;
  }
  public boolean includes (LL value) {
    Node<LL> current = head;
    while(current != null) {
      if (current.value.equals(value)) {
        return true;
      }
      current = current.next;
    }
      return false;
    }
  @Override
  public String toString()
    {
        String output = "";
        Node<LL> current = head;
        while(current != null) {
          output += "{ " + current.value + " } -> ";
          current = current.next;
        }
        return output + "NULL";
    }

    public void append(LL value){
      Node<LL> newTail = new Node<>(value);

      if (head == null){
        newTail.next = null;
        head = newTail;
      } else {
        Node<LL> current = head;
        while (current.next != null){
          current = current.next;
        }
        current.next = newTail;
        newTail.next = null;
      }
    }

    public void insertBefore(LL value, LL newValue){


    }

    public void insertAfter(LL value, LL newValue){


    }
}
