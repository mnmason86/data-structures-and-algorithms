package datastructures.trees;


import java.util.ArrayList;

public class KAryTree<T> {
  public KAryNode<T> root = null;

  public KAryTree(){
    //default constructor
  }

  public KAryTree(KAryNode<T> root){
    this.root = root;
  }

  public KAryNode<T> getRoot() {
    return root;
  }

  public void setRoot(KAryNode<T> root) {
    this.root = root;
  }

  public ArrayList<KAryNode<String>> getList(){
    return this.listNodes((KAryNode<String>) this.root, new ArrayList<>());
  }

  private ArrayList<KAryNode<String>> listNodes(KAryNode<String> node, ArrayList<KAryNode<String>> list){
    list.add(node);
    for(KAryNode<String> child : node.getChildren()){
      listNodes(child, list);
    }
    return list;
  }

  public KAryTree<String> makeFizzBuzzTree(){
    String fbRoot = this.fizzBuzz((Integer)root.getValue());
    KAryNode<Integer> input = (KAryNode<Integer>) this.root;
    KAryNode<String> output = new KAryNode<>(fbRoot);
    this.fizzBuzzTraversal(input, output);
    return new KAryTree<>(output);
  }
  public void fizzBuzzTraversal(KAryNode<Integer> input, KAryNode<String> output){
    for(KAryNode<Integer> child : input.getChildren()){
      KAryNode<String> fbNode = new KAryNode<>(this.fizzBuzz(child.getValue()));
      output.addChild(fbNode);
      this.fizzBuzzTraversal(child, fbNode);
    }
  }

  public String fizzBuzz(Integer value){
    String fbResult = "";
    if(value % 15 == 0){
      fbResult = "FizzBuzz";
    }
    else if(value % 3 == 0){
      fbResult = "Fizz";
    }
    else if(value % 5 == 0){
      fbResult = "Buzz";
    } else {
      fbResult = value.toString();
    }
    return fbResult;
  }
  }

