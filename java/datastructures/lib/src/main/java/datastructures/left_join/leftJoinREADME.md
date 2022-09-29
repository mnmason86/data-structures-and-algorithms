# HashMap Left Join

## Code Challenge 33

### Challenge Description

Write a method that named `leftJoin` LEFT JOINS two hashmaps into a single
data structure.

### Method Description

`leftJoin`: Accepts two hashmaps as arguments, returns all keys and values from
the "left"/first hashmap, joined with values from the right hashmap with matching
keys.

*example:*
**map1**
key: "sad" / value: "low"

**map2**
key: "sad" / value: "happy"

**resulting left join**
["sad: low, happy"]

### Complexity

**Time**: O(m+n) -> reduces to O(n) - Each value in each map will potentially be
visited to add keys to the result array.

**Space**: O(n) - A new array list of unknown size will be created

### Implementation

To utilize `leftJoin()`, pass in two instantiated hashmaps as arguments.
*example*: `leftJoin(map1, map2)`

### Attribution

emd5 "Liz" [GitHub Repo](https://github.com/emd5/data-structures-and-algorithms-java)
