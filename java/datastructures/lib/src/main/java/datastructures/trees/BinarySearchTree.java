package datastructures.trees;
import datastructures.linkedlist.Queue;

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

//  public BinaryTree makeFizzBuzzTree(){
//    String fbRoot = this.fizzBuzz((Integer)root.getValue());
//    TNode<Integer> input = this.root;
//    TNode<String> output = new TNode<>(fbRoot);
//    this.fizzBuzzTraversal(input, output);
//    return new BinaryTree(output);
//  }
//  public void fizzBuzzTraversal(TNode<Integer> input, TNode<String> output){
//    for(TNode<Integer> child : input.getChildren()){
//      TNode<String> fbNode = new TNode<>(this.fizzBuzz(child.getValue()));
//      output.addChild(fbNode);
//      this.fizzBuzzTraversal(child, fbNode);
//    }
//  }
//
//  public String fizzBuzz(Integer value){
//    if(value % 15 == 0){
//      return "FizzBuzz";
//    }
//    else if(value % 3 == 0){
//      return "Fizz";
//    }
//    else if(value % 5 == 0){
//      return "Buzz";
//    } else {
//      return value.toString();
//    }
//  }
}
