a. What does the assertArrayEquals method do?

 it takes 3 arguments a string and 2 arrays where it sends a message if the return is true and checks if array 1 and array 2 are the same or equal.

b. What will happen if the arrays a1 and a2 are not equal in 
testSingleDimensionalArrayEquality?

If the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality, the JUnit test will fail, and an AssertionError will be throw an error.

c. How does the assertArrayEquals method handle multi-dimensional arrays
as seen in testMultiDimensionalArrayEquality?

It checks if the parent arrays have the same length and if the corresponding sub-arrays are equal.