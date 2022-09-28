package datastructures.trees;

public class TNode<T> {
  public T value;
  public TNode<T> left = null;
  public TNode<T> right = null;

  public TNode(){
    //default constructor
  }

  public TNode<T> getLeft() {
    return left;
  }

  public void setLeft(TNode<T> left) {
    this.left = left;
  }

  public TNode<T> getRight() {
    return right;
  }

  public void setRight(TNode<T> right) {
    this.right = right;
  }

  public TNode(T value){

    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
