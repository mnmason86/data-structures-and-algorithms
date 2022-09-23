package datastructures.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashmapTest {
  HashMap sut = new HashMap<>(5);

  @Test
    public void instantiate() {
    assertEquals(sut.size, 5);
  }
  @Test
  public void setTest(){
    sut.set("Mandy", "36");
    
  }
}
