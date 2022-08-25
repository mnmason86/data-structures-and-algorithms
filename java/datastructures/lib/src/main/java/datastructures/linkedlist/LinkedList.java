package datastructures.linkedlist;

public class LinkedList<LL> {
  public Node head = null;
  public int listSize = 0;

  public void insert(int value){
    Node newHead = new Node (value);
    newHead.next = head;
    head = newHead;
    listSize++;
  }
  public boolean includes (int value) {
    Node current = head;
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
        Node current = head;
        while(current != null) {
          output += "{ " + current.value + " } -> ";
          current = current.next;
        }
        return output + "NULL";
    }

    public void append(int value){
      Node newTail = new Node(value);

      if (head == null){
        newTail.next = null;
        head = newTail;
      } else {
        Node current = head;
        while (current.next != null){
          current = current.next;
        }
        current.next = newTail;
        newTail.next = null;
      }
    }

    public void insertBefore(int givenValue, int newValue){

      Node newNode = new Node(newValue);
      Node current = head;

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

    public void insertAfter(int givenValue, int newValue){
      Node newNode = new Node(newValue);
      Node current = head;

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
    public void delete(int givenValue){
      Node current = head;
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
      Node current = head;
      int kthPosition = (this.getListSize() - k);
      System.out.println("kth position:" + kthPosition);
      for(int i = 1; i < kthPosition; i++) {
        current = current.next;
      }
      return current.value;
    }

    public int getListSize(){
      return this.listSize;
    }

    public static LinkedList zipLists(LinkedList listOne, LinkedList listTwo){

      //Assign head nodes
        Node currentOne = listOne.head;
        Node currentTwo = listTwo.head;
        // Zipped List to return
        LinkedList zippedList = new LinkedList();
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
