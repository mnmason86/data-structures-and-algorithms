package datastructures.sorting;

@SuppressWarnings("ALL")
public class MergeSort {

  public static void mergeSort(int[] arr){
    int n = arr.length;

    if (n > 1){
      int mid = n/2;
      int[] left = new int[mid];
      int[] right = new int[n-mid];

      for (int i = 0; i < mid; i++) {
        left[i] = arr[i];
      }
      for (int i = mid; i < n; i++){
        right[i - mid] = arr[i];
      }
      mergeSort(left);
      mergeSort(right);
      merge(left, right, arr);
    }
  }
  public static void merge(int[] left, int[] right, int[] arr){
    int i, j, k;
    i = j = k = 0;

    while(i < left.length && j < right.length){
      if (left[ i ] <= right [ j ]){
        arr[ k++ ] = left [ i ++];
      } else {
        arr [ k++ ] = right [ j ++];
      }
    }
    while (i < left.length){
      arr[ k + 1 ] = left [ i + 1 ];
    }
    while (j < right.length){
      arr [ k + 1 ] = right[ j + 1 ];
    }
  }
}
