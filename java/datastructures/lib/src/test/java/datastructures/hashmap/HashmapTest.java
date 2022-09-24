package datastructures.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashmapTest {

  @Test
    public void instantiate() {
    HashMap<Integer, Integer> sut = new HashMap<>(20);
    assertEquals(sut.size, 20);
  }
  @Test
  public void setTest(){
    HashMap<Integer, Integer> sut = new HashMap<>(5);
    sut.set(0,2);
    assertEquals(sut.get(0), 2);
  }

  @Test
  public void multiSetTest(){
    HashMap<Integer, Integer> sut = new HashMap<>(10);
    sut.set(4,5);
    sut.set(6,7);

    assertEquals(sut.get(4), 5);
    assertEquals(sut.get(6),7);
  }

  @Test
  public void overWriteValue(){
    HashMap<Integer, Integer> sut = new HashMap<>(10);
    sut.set(0,1);
    sut.set(0,2);
    assertEquals(sut.get(0), 2);
  }

  @Test
  public void nullKey(){
    HashMap<Integer, Integer> sut = new HashMap<>(10);
    sut.set(1,2);
    sut.set(3,4);
    assertEquals(sut.get(5), null);
  }

  @Test
  public void keyList(){
    HashMap<Integer, Integer> sut = new HashMap<>(10);
    sut.set(1,2);
    sut.set(3,4);
    sut.set(5,6);
    sut.set(7,8);
    sut.set(9,10);
    assertEquals(sut.keys().size(), 5);
    assertTrue(sut.keys().toString().equals("[1, 3, 5, 7, 9]") );
  }
 @Test
  public void containsTest(){
   HashMap<Integer, Integer> sut = new HashMap<>(10);
   sut.set(1,2);
   sut.set(3,4);
   sut.set(5,6);
   assertTrue(sut.contains(5));
 }
}
