package datastructures.trees;

public class TNode<T> {
  public T value;
  public TNode<T> left = null;
  public TNode<T> right = null;

  public TNode(){
    //default constructor
  }

  public TNode(T value){

    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
