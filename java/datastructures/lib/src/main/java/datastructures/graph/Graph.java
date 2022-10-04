package datastructures.graph;

import datastructures.hashmap.HashMap;
import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import datastructures.linkedlist.Queue;

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

  public static int businessTrip(Graph<String> graph, String[] cities){
    int totalCost = 0;
    Vertex<String> start = new Vertex<>(cities[0]);
    List<Vertex<String>> airportNames = graph.getVertices();
    for(Vertex<String> airport : airportNames){
      if(airport.value.equals(cities[0])){
        start = airport;
        break;
      }
    }
    for (int i = 1; i < cities.length; i++){
      boolean doesConnect = false;
      for (Edge<String> edge : graph.getNeighbors(start)) {
        if (edge.destination.value.equals(cities[i])) {
          totalCost += edge.weight;
          start = edge.destination;
          doesConnect = true;
          break;
        }
      }
      if(!doesConnect){
        return 0;
      }
    }
      return totalCost;
  }

  @Override
    public int compareTo(Graph<T> o){
      throw new UnsupportedOperationException("Graph does not support compareTo()");
  }
}
