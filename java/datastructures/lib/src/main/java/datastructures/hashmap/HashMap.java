package datastructures.hashmap;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HashMap<K,V> {
  ArrayList<LinkedList<HashMapPair<K,V>>> bucketArrayList; // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;
  public HashMap(int size) {
    if(size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1");
    }
    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    for(int i = 0; i < this.size; i++){
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  public void set(K key, V value){
    int index = hash(key);
    HashMapPair<K,V> newEntry = new HashMapPair<>(key,value);
    if(bucketArrayList.get(index) != null){
      LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K,V>> current;
      current = list.head;
      while(current != null && !current.value.getKey().equals(key)){
        current = current.next;
      }
      if(current != null && !current.value.equals(value)){
        current.value.setValue(value);
        return;
      }
    }
    LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);
    list.append(newEntry);
    bucketArrayList.set(index, list);
//    size++;
  }

  public V get(K key) {
    int index = hash(key);
    if (bucketArrayList.get(index) != null) {
      LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K,V>> current;
      current = list.head;
      while (current != null && !current.value.getKey().equals(key)) {
        current = current.next;
      }
      if (current != null) {
        return (V) current.value.getValue();
      }
    }
    return null;
  }

  public List<K> keys(){
    List<K> allKeys = new ArrayList<>();
    for(LinkedList<HashMapPair<K,V>> list : bucketArrayList){
      if(list != null){
        Node<HashMapPair<K,V>> current;
        current = list.head;
        while(current != null){
          allKeys.add((K) current.value.getKey());
          current = current.next;
        }
      }
    }
    System.out.println(allKeys);
    return allKeys;
  }

  public boolean contains(K key){
    int index = hash(key);
    if(bucketArrayList.get(index) != null){
      LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K,V>> current;
      current = list.head;
      while(current != null && !current.value.getKey().equals(key)){
        current = current.next;
      }
      return current != null;
    }
    return false;
  }

  public int hash(K key){

    return Math.abs(key.hashCode()) % size;
  }
  public static String repeatedWord(String text){
    if (text.equals("")){
      return "Please enter text to be evaluated";
    }
    String[] words = text.toLowerCase().split("\\W+");
    System.out.println(Arrays.toString(words));
    HashMap<String, Integer> textMap = new HashMap(words.length);
    for (String w : words) {
      if (textMap.contains(w)) {
        return w;
      } else {
        textMap.set(w,1);
      }
    }
    return null;
  }
}
