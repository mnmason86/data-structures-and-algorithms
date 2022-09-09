package datastructures.trees;

import java.util.ArrayList;

public class KAryNode<T> {

  public T value;
  public ArrayList<KAryNode<T>> children;

  public KAryNode(T value){
    this.value = value;
    this.children = new ArrayList<>();
  }
  public KAryNode(){
    children = new ArrayList<>();
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public ArrayList<KAryNode<T>> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<KAryNode<T>> children) {
    this.children = children;
  }

  public void addChild(KAryNode<T> child){
    children.add(child);
  }
}
