package datastructures;

public class LinkedList<T> {
  public Node<T> head = null;
  public int listSize = 0;

  public void insert(T value){
    Node<T> newHead = new Node<T> (value);
    newHead.next = head;
    head = newHead;
    listSize++;
  }
  public boolean includes (T value) {
    Node<T> current = head;
    while(current != null) {
      if (current.value == value) {
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
        Node<T> current = head;
        while(current != null) {
          output += "{ " + current.value + " } -> ";
          current = current.next;
        }
        return output + "NULL";
    }

    public void append(T value){
      Node<T> newTail = new Node<T>(value);

      if (head == null){
        newTail.next = null;
        head = newTail;
      } else {
        Node<T> current = head;
        while (current.next != null){
          current = current.next;
        }
        current.next = newTail;
        newTail.next = null;
      }
    }

    public void insertBefore(T givenValue, T newValue){

      Node<T> newNode = new Node<T>(newValue);
      Node<T> current = head;

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

    public void insertAfter(T givenValue, T newValue){
      Node<T> newNode = new Node<T>(newValue);
      Node<T> current = head;

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
    public void delete(T givenValue){
      Node<T> current = head;
      if (current.value == givenValue){
        current = null;
      }
      while (current.next != null){
        if(current.next.value == givenValue){
          current.next = current.next.next;
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
      Node<T> current = head;
      int kthPosition = (this.getListSize() - k);
      System.out.println("kth position:" + kthPosition);
      for(int i = 1; i < kthPosition; i++) {
        current = current.next;
      }
      return (int) current.value;
    }

    public int getListSize(){
      return this.listSize;
    }

    public LinkedList<T> zipLists(LinkedList listOne, LinkedList listTwo){

      //Assign head nodes
        Node<T> currentOne = listOne.head;
        Node<T> currentTwo = listTwo.head;
        // Zipped List to return
        LinkedList<T> zippedList = new LinkedList();
        //Zipping logic
        while(currentOne != null || currentTwo != null){
          if (currentOne != null){
            zippedList.append(currentOne.getValue());
            currentOne = currentOne.next;
          }
          if(currentTwo != null){
            zippedList.append(currentTwo.getValue());
            currentTwo = currentTwo.next;
          }
        }
      return zippedList;
    }
}
