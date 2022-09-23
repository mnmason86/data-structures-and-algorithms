package datastructures.hashmap;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;


import java.util.ArrayList;

import java.util.List;

public class HashMap<K, V> {

  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList; // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap(int size) {
    if(size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1");
    }
    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
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
    size++;
  }

  public V get(K key){
    
  }

  public List<K> getKeys(){
    // TODO: implement me
    return null;
  }

  public boolean contains(){
    // TODO: implement me
    return false;
  }

  public int hash(K key){
    return Math.abs(key.hashCode()) % size;
  }
}
