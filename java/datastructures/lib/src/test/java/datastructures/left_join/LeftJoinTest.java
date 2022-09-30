package datastructures.left_join;

import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeftJoinTest {

  @Test
  public void leftJoinTest(){
    HashMap map1 = new HashMap<>(5);
    map1.set("diligent", "employed");
    map1.set("fond", "enamored");
    map1.set("guide", "usher");
    map1.set("outfit", "garb");
    map1.set("wrath", "anger");

    HashMap map2 = new HashMap<>(5);
    map2.set("diligent", "idle");
    map2.set("fond", "averse");
    map2.set("guide", "follow");
    map2.set("flow", "jam");
    map2.set("wrath", "delight");

    List<String> result = new ArrayList<>();
    result.add("diligent: employed, idle");
    result.add("wrath: anger, delight");
    result.add("guide: usher, follow");
    result.add("fond: enamored, averse");
    result.add("outfit: garb, null");

    assertEquals(result, LeftJoin.leftJoin(map1, map2));
  }
}
