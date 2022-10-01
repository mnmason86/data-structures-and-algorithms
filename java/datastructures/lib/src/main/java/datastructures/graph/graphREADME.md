# Graph

## Challenge Description

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

`getVertices()`: Takes no arguments. When called on a graph, returns all
nodes in the graph as a collection. An empty collection is returned if the graph
is empty.

`getNeighbors()`: Takes in a graph node as an argument, returns a collection of
edges connected to the given node (weight may be included if applicable). An
empty collection is returned if the graph is empty

`size()`: Takes no arguments. When called on a graph, returns the total number of
nodes in the graph.

### Complexity

`addVertex()`
**Time**: O(n) - Each item in the adjacencyList will potentially be visited to
determine whether the given value is already contained in the list.
**Space**: O(1) - A single new node is created with the given value

`addEdge()`
**Time**:O(n) - Calling `get`, `append`, and `set` to add an edge between the
given nodes each
have a potential
time
complexity of O(n) - > O(3n) which reduces to O(n)
**Space**: O(1) - Only one new edge will be created for each call to `addEdge`.

`getVertices()`
**Time**: O(n) - Each item in the graph will be visited
to get the keys contained in it.
**Space**: O(n) - A new List of variable size will be created which contains all keys from the graph.

`getNeighbors()`
**Time**:O(n) - Each item in the graph will be visited to determine its
neighboring nodes.

**Space**: O(n) - A new List of variable size will be created which contains all
of a node's neighboring nodes.

### Implementation

To utilize `addVertex`, call on an instantiated Graph, and pass in the value of
the vertex to be added.
*example:* `someGraph.addVertex(value)`

To utilize `addEdge`, call on an instantiated Graph, pass in the two nodes which
are to be linked by the edge (start,destination), and an integer for the edge's
weight.
*example:* `someGraph.addEdge(startNode, destinationNode, weight)`

To utilize `getVertices`,`getNeighbors`, or `size`, call on an instantiated Graph. No
arguments are
required.
*example:* `someGraph.getVertices()` / `someGraph.getNeighbors()` / `someGraph.size()`



### Attribution
Ben Mills - [GitHub Repo](https://github.com/akkanben/data-structures-and-algorithms)



