package datastructures.graph;

import org.junit.jupiter.api.Test;

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
}
