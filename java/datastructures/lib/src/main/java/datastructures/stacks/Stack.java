package datastructures.stacks;

import java.util.EmptyStackException;

  public class Stack<T> {
    private Node<T> top = null;
    public int stackSize = 0;

    public int getStackSize(){
      return stackSize;
    }


    public void push (T value){
      Node<T> newNode = new Node<>(value);
      newNode.next = top;
      top = newNode;
      stackSize++;
    }

    public T pop(){
      Node<T> temp = top;
      if (top == null){
        throw new EmptyStackException();
      }
      top = top.next;
      stackSize--;
      return temp.value;
    }

    public T peek(){
      if (top == null){
        throw new EmptyStackException();
      }
      return top.value;
    }

    public boolean isEmpty(){
      return stackSize == 0;
    }

}

