package datastructures.left_join;

import datastructures.hashmap.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {
  public static List<String> leftJoin(HashMap map1, HashMap map2){

    List<String> result = new ArrayList<>();
    for(Object key : map1.keys()){
      if(map1.contains(key)){
        result.add(key + ": " + map1.get(key) + ", " + map2.get(key));
      } else {
        result.add(key + ": " + map1.get(key) + ", " + null);
      }
    }
    return result;
  }
}
