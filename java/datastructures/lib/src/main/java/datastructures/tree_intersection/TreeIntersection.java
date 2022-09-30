package datastructures.tree_intersection;

import datastructures.hashmap.HashMap;
import datastructures.trees.BinaryTree;

import java.util.ArrayList;


public class TreeIntersection {
  public static ArrayList treeIntersection(BinaryTree<Integer> tree1,
                                           BinaryTree<Integer> tree2) {
    ArrayList<Integer> result = new ArrayList<>();
    HashMap<Integer, Integer> treeMap = new HashMap<>(30);
    //map items from tree1 into treeMap
    ArrayList tree1List = tree1.breadthFirst(tree1.root);
    for (int i = 0; i < tree1List.size(); i++) {
      Integer item = (Integer) tree1List.get(i);
      treeMap.set(item, item);
    }
    ArrayList tree2List = tree2.breadthFirst(tree2.root);
    for (int j = 0; j < tree2List.size(); j++) {
      Integer item = (Integer) tree2List.get(j);
      if (treeMap.contains(item)) {
        result.add(item);
      } else {
        treeMap.set(item, item);
      }
    }
    System.out.println(result);
    return result;
  }
}
