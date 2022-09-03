package datastructures.trees;

import datastructures.linkedlist.Node;

public class BinarySearchTree<T> extends BinaryTree {
  public BinarySearchTree(){
    super();
  }
  public void add (int value){
    TNode<Integer> newNode = new TNode<Integer>(value);
    TNode<Integer> current;
    if(root == null){
      root = newNode;
    } else {
      current = root;
      while(current != null){
        if(newNode.value.compareTo(current.value) < 0){
          if(current.left == null){
            current.left = newNode;
            return;
          }
          current = current.left;
        }
        else {
          if(current.right == null){
            current.right = newNode;
            return;
          }
          current = current.right;
        }
      }
    }
  }

  public boolean contains(int value) {
    TNode<Integer> current = root;
    while (current != null) {
      if (current.value == value) {
        return true;
      } else if (value < current.value) {
        current = current.left;
      } else {
        current = current.right;
      }
    }
    return false;
  }
}
