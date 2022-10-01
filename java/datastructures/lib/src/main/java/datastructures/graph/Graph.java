package datastructures.graph;

import datastructures.hashmap.HashMap;
import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

import java.util.ArrayList;

import java.util.List;


public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>{

    private final HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyList;
    private int numberOfVertices = 0;

  public Graph(int numberOfVertices) {
    adjacencyList = new HashMap<>(numberOfVertices);
  }

  public Vertex<T> addVertex(T value){
    Vertex<T> vertex = new Vertex<>(value);
    if (adjacencyList.get(vertex) == null){
      adjacencyList.set(vertex, null);
      numberOfVertices++;
    }
    return vertex;
  };

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight){
    Edge<T> edge = new Edge<>(destination,weight);
    if(adjacencyList.get(start) == null){
      LinkedList<Edge<T>> newList = new LinkedList<>();
      newList.append(edge);
      adjacencyList.set(start, newList);
    } else {
      LinkedList<Edge<T>> oldList = adjacencyList.get(start);
      oldList.append(edge);
      adjacencyList.set(start, oldList);
    }
  };

  public List<Vertex<T>> getVertices(){
    List<Vertex<T>> list = new ArrayList<>(adjacencyList.keys());
    return list;
  };

  public List<Edge<T>> getNeighbors(Vertex<T> vertex){
    List<Edge<T>> list = new ArrayList<>();
    LinkedList<Edge<T>> edgeList = adjacencyList.get(vertex);
    if(edgeList != null){
      Node<Edge<T>> current;
      current = edgeList.head;
      while (current != null){
        list.add(current.value);
        current = current.next;
      }
    }
    return list;
  };

  public int size(){
    return numberOfVertices;
  };

  @Override
    public int compareTo(Graph<T> o){
      throw new UnsupportedOperationException("Graph does not support compareTo()");
  }
}
