
# Basic Theory References

### Theory List

- [Binary Search Theory](#binary-search-theory)

### Binary Search Theory

1. **Precondition: Sorted Array**
   - Binary search works only on sorted arrays (either ascending or descending order). It takes advantage of the order to eliminate half of the search space at each step.
   - The array must be sorted to ensure that each comparison helps in narrowing down the search space.

2. **Initialize Search Boundaries**
   - Start with two pointers: `low` (starting index) and `high` (ending index) to represent the range of the array you're searching in.
   - Initially, `low` is set to 0, and `high` is set to the last index of the array.

3. **Find the Middle Element**
   - In each iteration, calculate the middle index:  
     mid = (low + high) / 2
   - The middle element (`array[mid]`) is then compared with the target value you're searching for.

4. **Compare and Narrow the Search**
   - If the middle element is equal to the target, the search is complete, and the index of the middle element is returned.
   - If the middle element is less than the target, the search continues in the right half by updating `low = mid + 1`.
   - If the middle element is greater than the target, the search continues in the left half by updating `high = mid - 1`.

5. **Repeat or Terminate**
   - The process repeats until `low` exceeds `high` or the target is found. If `low` exceeds `high`, it means the target is not in the array.
   - The search space is halved with each comparison, making binary search highly efficient.


