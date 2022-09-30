package datastructures.trees;

import datastructures.linkedlist.Queue;

import java.util.ArrayList;


public class BinaryTree<T> {
  public TNode<T> root = null;

  public BinaryTree() {
    //default constructor
  }

  public TNode<T> getRoot() {
    return root;
  }

  public void setRoot(TNode<T> root) {
    this.root = root;
  }

  public BinaryTree(TNode<T> root) {
    this.root = root;
  }

  public ArrayList<T> preOrderTraversal() {
    ArrayList<T> arrayList = new ArrayList<>();
    preOrder(arrayList, root);
    return arrayList;
  }

  public void preOrder(ArrayList<T> list, TNode<T> tRoot) {
    list.add(tRoot.value);
    if (tRoot.left != null) {
      preOrder(list, tRoot.left);
    }
    if (tRoot.right != null) {
      preOrder(list, tRoot.right);
    }
  }

  public ArrayList<T> inOrderTraversal() {
    ArrayList<T> arrayList = new ArrayList<>();
    inOrder(arrayList, root);
    return arrayList;
  }

  public void inOrder(ArrayList<T> list, TNode<T> tRoot) {
    if (tRoot.left != null) {
      inOrder(list, tRoot.left);
    }
    list.add(tRoot.value);
    if (tRoot.right != null) {
      inOrder(list, tRoot.right);
    }
  }

  public ArrayList<T> postOrderTraversal() {
    ArrayList<T> arrayList = new ArrayList<>();
    postOrder(arrayList, root);
    return arrayList;
  }

  public void postOrder(ArrayList<T> list, TNode<T> tRoot) {
    if (tRoot.left != null) {
      postOrder(list, tRoot.left);
    }
    if (tRoot.right != null) {
      postOrder(list, tRoot.right);
    }
    list.add(tRoot.value);
  }

  public static int findMaxValue(TNode tRoot) {
    if (tRoot == null) {
      System.out.println(Integer.MIN_VALUE);
      return Integer.MIN_VALUE;
    }
    int max = (int) tRoot.value;
    int leftMax = findMaxValue(tRoot.left);
    int rightMax = findMaxValue(tRoot.right);

    if (leftMax > max) {
      max = leftMax;
    }
    if (rightMax > max) {
      max = rightMax;
    }
    return max;
  }


  public ArrayList breadthFirst(TNode<T> tRoot) {
    ArrayList<T> list = new ArrayList<>();
    Queue<TNode<T>> breadth = new Queue<>();
    breadth.enqueue(tRoot);

    while (!breadth.isEmpty()) {
      TNode<T> front = breadth.dequeue();
      list.add(front.value);

      if (front.left != null) {
        breadth.enqueue(front.left);
      }
      if (front.right != null) {
        breadth.enqueue(front.right);
      }
    }
    return list;
  }
}

