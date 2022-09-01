# Data Structures

## Implementation Notes

## Code Challenges

### Code Challenge 05

#### Linked Lists

Location: `codechallenges/linkedlist/LinkedListChallenges`

Methods:
`insert()` - Adds a new node with the given value to the head of the list.

`includes()` - Indicates whether the given value exists as a Node's value somewhere within the list.

`toString()` - (Override) Returns a string representing all the values in the Linked List

### Code Challenge 06

`append()` - Adds a node with the given value to the end of the Linked List.

`insertBefore()` - Inserts a node with the given new value to a position immediately before a node with the given existing value.

`insertAfter`() - Inserts a node with the given new value to a position immediately after a node with the given existing value.

`delete()` - Deletes a node with a given value from the Linked List.

### Code Challenge 07

`kthFromEnd()` - Finds the value of a Node that is k positions from the end of the list, where k is a given integer.

<img src="kth.jpg" alt="kth from end" height="500"/>

### Code Challenge 08

`zipLists()` - Takes in two Linked Lists, and returns a single Linked List with
the given Lists zipped together by alternating their nodes.

<img src="zipList.jpg" alt="zipped lists" height="500"/>

### Code Challenge 10

#### Stacks

Methods:

`push()` - Adds a node to the top of the stack
`pop()` - Removes a node from the top of the stack, and returns its value
`peek()`- Returns the value of the top node
`isEmpty` - Returns true if the stack is empty

#### Queues

`enqueue()` - Adds a node to the rear of the queue
`dequeue()` - Removes a node from the front of the queue
`peek()` - Returns the value of the front node
`isEmpty()` - Returns true if the queue is empty

### Code Challenge 11

#### Pseudo Queue

Creates queue functionality (FIFO) using two stacks.

Methods:

`enqueue()` - Inserts a given value into the PseudoQueue using a FIFO approach. O(1) complexity
`dequeue()` - Extracts a value from the PseudoQueue using a FIFO approach. O(n)
complexity.

### Code Challenge 12

#### Animal Shelter (pseudo queue)

Methods:

`enqueue()` - Adds an animal of type "cat" or "dog" to the animal shelter queue
`dequeue()` - Accepts a preference of 'dog' or 'cat', and returns an animal of
the specified type

*CC12 collaboration: Stanley Wilder*

### Code Challenge 13

#### Validate Brackets

Method:

`validateBrackets()` - Accepts a string of characters, and returns true if the
string contains complete sets of opening and closing brackets, regardless of
other characters in the string.
Time Complexity - O(n)
Space Complexity - O(n)

Datastructures Attributions:

MisterCode - YouTube
[PseudoQueue Explanation](https://www.youtube.com/watch?v=AN0axYeLue0&t=214s)

Joshua Frazer
[GitHub repository](https://github.com/Frazmatic/data-structures-and-algorithms)
Formatting, syntax, and logic help and because I aspire to write code as cleanly and
as organized as this on my own!

Ben Mills
[GitHub repository](https://github.com/akkanben/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/linkedlist)
Formatting, syntax, and logic examples
