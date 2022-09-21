package datastructures.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingTest {

  int[] sut1 = {8,4,23,42,16,15};
  int[] sut2 = {5,12,7,5,5,7};
  int[] sut3 = {20,18,12,8,5,-2};
  int[] sut4 = {2,3,5,7,13,11};

  @Test
  void insertSortTest(){

    assertEquals("[4, 8, 15, 16, 23, 42]",
      Arrays.toString(InsertionSort.insertionSort(sut1)));
    assertEquals("[5, 5, 5, 7, 7, 12]",
      Arrays.toString(InsertionSort.insertionSort(sut2)));
    assertEquals("[-2, 5, 8, 12, 18, 20]",
      Arrays.toString(InsertionSort.insertionSort(sut3)));
    assertEquals("[2, 3, 5, 7, 11, 13]",
      Arrays.toString(InsertionSort.insertionSort(sut4)));
  }
}
