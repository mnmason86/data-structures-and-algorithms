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

    public void insertBefore(LL givenValue, LL newValue){

      Node<LL> newNode = new Node<>(newValue);
      Node<LL> current = head;

      while (current.next != null){
        if (current.next.value == givenValue) {
          newNode.next = current.next;
          current.next = newNode;
          listSize++;
          break;
        } else {
          current = current.next;
        }
      }
    }

    public void insertAfter(LL givenValue, LL newValue){
      Node<LL> newNode = new Node<>(newValue);
      Node<LL> current = head;

      while (current.next != null){
        if(current.value == givenValue){
          newNode.next = current.next;
          current.next = newNode;
          listSize++;
          break;
        }
        current = current.next;
      }
    }
    public void delete(LL givenValue){
      Node<LL> current = head;
      if (current.value == givenValue){
        current = null;
      }
      while (current.next != null){
        if(current.next.value == givenValue){
          current.next = current.next.next;
          delete((LL) current.next);
          listSize--;
          return;
        }
        current = current.next;
      }
    }

    public int kthFromEnd(int k){
      if(head == null || k < 0){
        throw new IllegalArgumentException("List is empty.");
      }
      if (k > this.getListSize()){
        throw new IllegalArgumentException("List isn't long enough");
      }
      Node<LL> current = head;
      int kthPosition = (this.getListSize() - k);
      System.out.println("kth position:" + kthPosition);
      for(int i = 1; i < kthPosition; i++) {
        current = current.next;
      }
      return (int)current.value;
    }

    public int getListSize(){
      return this.listSize;
    }

    public LinkedList<Integer> zipLists(LinkedList<Integer> listOne, LinkedList<Integer> listTwo){
      LinkedList<Integer> zippedList = new LinkedList<>();
      //Assign head nodes
        Node <Integer> currentOne = listOne.head;
        Node <Integer> currentTwo = listTwo.head;
         
      return zippedList;
    }
}
