# Graph

## Challenge Description
&
### Feature

New Implementation - Implement your own Graph. The graph should be represented as
an adjaceny list, and should include the following methods:
`addVertex()`
`addEdge()`
`getNodes()`
`getNeighbors()`
`size()`

### Methods

`addVertex()`: Takes in a value as an argument, adds a new node with the given
value to the graph, and returns the added node.

`addEdge()`: Takes in two nodes to be connected by the edge, adds a new edge
between the two nodes which are already present in the graph. (Assigns a weight
to the edge - optional)

`getNodes()`: Takes no arguments. When called on a graph, returns all of the
nodes in the graph as a collection. An empty collection is returned if the graph
is empty.

`getNeighbors()`: Takes in a graph node as an argument, returns a collection of
edges connected to the given node (weight may be included if applicable). An
empty collection is returned if the graph is empty

`size()`: Takes no arguments. When called on a graph, returns the total number of
nodes in the graph.

