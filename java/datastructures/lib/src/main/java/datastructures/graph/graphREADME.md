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

## Code Challenge 37

Business Trip

### Challenge Description

Given a business trip itinerary, and an Alaskan Airlines rout map, is the trip
possible with direct flights? If so, how much will the total trip cost be?

### Method

`businessTrip` - Accepts an instantiated Graph, and an array of city names as
arguments, and returns the value of the total cost of the trip *if* the trip is
possible with only direct flights between the given cities. Otherwise, a total
cost of '0' is returned.

### Complexity

**Time**: O(n^2) - Potentially, each edge in the graph will be evaluated against
each city in the list of given city names.

**Space**: O(n) - A new list of a variable size is created, which is dependent
upon the size of the input graph.

### Implementation

To utilize `businessTrip`, pass in an instantiated Graph, and an array of Strings
which are the names of cities contained in the graph. If there are direct
connections between the given cities, a value greater than zero will be returned
which reflects the total 'cost' of the trip between them.
*example*: `businessTrip(someGraph, ["Nashville", "Atlanta"])`

## Code Challenge 36

### Challenge Description

Implement a breadth-first traversal of a graph.

### Methods

`breadthFirst()` - Accepts a Graph node as an argument. Returns and displays a
collection of nodes in the order they were visited.

### Complexity

**Time**: O(n) - Each vertex in the graph is visited to determine its neighbors
and add each to the result list. This will give a complexity of O(vertices)
 + O(edges), which simplifies to O(n).

**Space**: O(n) - While several data structures are created in this
implementation, they will only ever be as large as the maximum breadth of the graph.
### Implementation

To utilize `breadthFirst`, pass in a node of an instantiated graph.
*example*: `breadthFirst(someGraphNode)`

### Attribution
Alex White - Starter code, code review
Ben Mills - [GitHub Repo](https://github.com/akkanben/data-structures-and-algorithms)



