package datastructures.graph;

import org.junit.jupiter.api.Test;

import static datastructures.graph.Graph.businessTrip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {
  @Test
  public void addVertexTest() {
    Graph<String> sut = new Graph<>(1);

    sut.addVertex("Mandy");
    String test1 = sut.getVertices().get(0).value;

    assertEquals(test1, "Mandy");

    assert(sut.size() == 1);
  }

  @Test
  public void addEdgeTest() {
    Graph<Integer> sut = new Graph<>(5);

    Vertex<Integer> vtx1 = sut.addVertex(5);
    Vertex<Integer> vtx2 = sut.addVertex(10);

    sut.addEdge(vtx1, vtx2, 1);

    assertTrue(sut.getNeighbors(vtx1).get(0).destination.value == 10);

    assert(sut.size() == 2);
  }

  @Test
  public void getVerticesTest(){
    Graph<Integer> sut = new Graph<>(1);

    Vertex<Integer> vtx1 = sut.addVertex(100);
    Vertex<Integer> vtx2 = sut.addVertex(110);
    Vertex<Integer> vtx3 = sut.addVertex(120);
    Vertex<Integer> vtx4 = sut.addVertex(130);
    Vertex<Integer> vtx5 = sut.addVertex(140);

    assert(sut.getVertices().get(0).value == 100);
    assert(sut.getVertices().get(1).value == 110);
    assert(sut.getVertices().get(2).value == 120);
    assert(sut.getVertices().get(3).value == 130);
    assert(sut.getVertices().get(4).value == 140);

    assert(sut.size() == 5);
  }

  @Test
  public void getNeighborsTest(){
    Graph<Integer> sut = new Graph<>(1);
    Vertex<Integer> vtx1 = sut.addVertex(100);
    Vertex<Integer> vtx2 = sut.addVertex(110);
    Vertex<Integer> vtx3 = sut.addVertex(120);

    sut.addEdge(vtx1, vtx2, 1);
    sut.addEdge(vtx2, vtx1,1);
    sut.addEdge(vtx1, vtx3, 2);
    sut.addEdge(vtx3, vtx1, 2);
    sut.addEdge(vtx2, vtx3, 3);
    sut.addEdge(vtx3, vtx2, 3);

    assert(sut.getNeighbors(vtx1).get(0).destination.value == 110);
    assert(sut.getNeighbors(vtx1).get(1).destination.value == 120);
    assert(sut.getNeighbors(vtx2).get(0).destination.value == 100);
    assert(sut.getNeighbors(vtx2).get(1).destination.value == 120);
    assert(sut.getNeighbors(vtx3).get(0).destination.value == 100);
    assert(sut.getNeighbors(vtx3).get(1).destination.value == 110);

    assert(sut.getNeighbors(vtx1).get(0).weight == 1);
    assert(sut.getNeighbors(vtx2).get(1).weight == 3);
    assert(sut.getNeighbors(vtx3).get(0).weight == 2);

    assert(sut.size() == 3);
  }

  @Test
  public void businessTripTest(){
    Graph<String> sut = new Graph<>(6);
    Vertex<String> vtx1 = sut.addVertex("Nashville");
    Vertex<String> vtx2 = sut.addVertex("Atlanta");
    Vertex<String> vtx3 = sut.addVertex("Dallas");
    Vertex<String> vtx4 = sut.addVertex("St. Louis");
    Vertex<String> vtx5 = sut.addVertex("Seattle");
    Vertex<String> vtx6 = sut.addVertex("Tucson");

    sut.addEdge(vtx1, vtx2, 85);
    sut.addEdge(vtx1, vtx3, 110);
    sut.addEdge(vtx2, vtx1, 85);
    sut.addEdge(vtx2, vtx4, 96);
    sut.addEdge(vtx2, vtx6, 133);
    sut.addEdge(vtx3, vtx1, 110);
    sut.addEdge(vtx3, vtx5, 112);
    sut.addEdge(vtx3, vtx6, 103);
    sut.addEdge(vtx4, vtx2, 96);
    sut.addEdge(vtx4, vtx6, 129);
    sut.addEdge(vtx5, vtx3, 112);
    sut.addEdge(vtx6, vtx2, 133);
    sut.addEdge(vtx6, vtx3, 103);
    sut.addEdge(vtx6, vtx4, 129);

    String[] cities = {"Nashville", "Atlanta"};
    String[] cities2 = {"St. Louis", "Tucson", "Dallas"};
    String[] cities3 = {"Seattle", "St. Louis", "Nashville"};

    assertTrue(businessTrip(sut, cities) == 85);
    assertTrue(businessTrip(sut, cities2) == 232);
    assertTrue(businessTrip(sut, cities3) == 0);
  }
}
