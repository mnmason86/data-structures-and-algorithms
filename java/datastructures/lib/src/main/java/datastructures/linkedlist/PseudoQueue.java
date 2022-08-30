package datastructures.linkedlist;

public class PseudoQueue<T> {
  Stack<T> stackOne;
  Stack<T> stackTwo;

  public PseudoQueue(){
    this.stackOne = new Stack<>();
    this.stackTwo = new Stack<>();
  }

  public void enqueue(T value){
    stackOne.push(value);
  }

  public T dequeue(){
    if (stackTwo.isEmpty()){
      while(!stackOne.isEmpty()){
        stackTwo.push(stackOne.pop());
      }
    }
    return stackTwo.pop();
  }
}
