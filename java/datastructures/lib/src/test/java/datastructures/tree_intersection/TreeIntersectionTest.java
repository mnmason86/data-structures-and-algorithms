package datastructures.tree_intersection;

import datastructures.trees.BinaryTree;
import datastructures.trees.TNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionTest {

  @Test
  public void intersectionTest(){
    BinaryTree<Integer> tree1 = new BinaryTree<>();
    tree1.setRoot(new TNode<>(10));
    tree1.getRoot().setLeft(new TNode<>(5));
    tree1.getRoot().setRight(new TNode<>(8));
    tree1.getRoot().getLeft().setLeft(new TNode<>(2));
    tree1.getRoot().getLeft().setRight(new TNode<>(7));
    tree1.getRoot().getRight().setLeft(new TNode<>(12));
    tree1.getRoot().getRight().setRight(new TNode<>(15));

    BinaryTree<Integer> tree2 = new BinaryTree<>();
    tree2.setRoot(new TNode<>(15));
    tree2.getRoot().setLeft(new TNode<>(4));
    tree2.getRoot().setRight(new TNode<>(7));
    tree2.getRoot().getLeft().setLeft(new TNode<>(1));
    tree2.getRoot().getLeft().setRight(new TNode<>(12));
    tree2.getRoot().getRight().setLeft(new TNode<>(11));
    tree2.getRoot().getRight().setRight(new TNode<>(8));

    assertEquals("[15, 7, 12, 8]", TreeIntersection.treeIntersection(tree1, tree2).toString());
  }
}
