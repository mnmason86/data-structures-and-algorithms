package datastructures.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>{

    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyList;
    private int numberOfVertices = 0;

  public Graph(int numberOfVertices) {
    this.numberOfVertices = numberOfVertices;
  }

  public Vertex<T> addVertex(T value){};

  public void addEdge(Vertex<T> start, Vertex<T> destination){};

  public LinkedList<Vertex<T>> getVertices(){};

  public LinkedList<Edge<T>> getNeighbors(){};

  public int size(){};

  @Override
    public int compareTo(Graph<T> o){
      return 0;
  }
}
