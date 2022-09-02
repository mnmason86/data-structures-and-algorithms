package datastructures.trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree<T> {
  public TNode<T> root = null;

  public BinaryTree(){
    //default constructor
  }

  public BinaryTree(TNode<T> root) {
    this.root = root;
  }

  public ArrayList<T> preOrder(TNode<T> root){
    ArrayList<T> preOrderArray = new ArrayList<>();
    preOrderArray.add(root.value);
    if (root.left != null){
      preOrder(root.left);
    }
    if (root.right != null){
      preOrder(root.right);
    }
    return preOrderArray;
  }

  public ArrayList<T> inOrder(TNode<T> root){
    ArrayList<T> inOrderArray = new ArrayList<>();
    if (root.left != null){
      inOrder(root.left);
    }
    inOrderArray.add(root.value);
    if (root.right != null){
      inOrder(root.right);
    }
    return inOrderArray;
  }

  public ArrayList<T> postOrder(TNode<T> root){
    ArrayList<T> postOrderArray = new ArrayList<>();
    if(root.left != null){
      postOrder(root.left);
    }
    if(root.right != null){
      postOrder(root.right);
    }
    postOrderArray.add(root.value);
    return postOrderArray;
  }
}
