package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KAryTreeTest {


  @Test
  public void fizzBuzzTest(){
    KAryNode<Integer> a = new KAryNode<>(5);
    KAryNode<Integer> b = new KAryNode<>(21);
    KAryNode<Integer> c = new KAryNode<>(4);
    KAryNode<Integer> d = new KAryNode<>(0);
    KAryNode<Integer> e = new KAryNode<>(45);
    KAryNode<Integer> f = new KAryNode<>(96);

    KAryTree input = new KAryTree<>(a);

    a.addChild(b);
    a.addChild(c);
    a.addChild(d);
    c.addChild(e);
    d.addChild(f);

    KAryTree sut = input.makeFizzBuzzTree();

    ArrayList<KAryNode<String>> fbList = sut.getList();
    ArrayList<String> fbStrings = new ArrayList<>();

    for (KAryNode<String> node : fbList){
      fbStrings.add(node.getValue());
    }
   assertEquals("[Buzz, Fizz, 4, FizzBuzz, FizzBuzz, Fizz]", fbStrings.toString());
  }
}
