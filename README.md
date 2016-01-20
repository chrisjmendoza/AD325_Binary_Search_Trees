# AD325_Binary_Search_Trees
Assignment 2 for AD325 - Binary Search Trees
Assignment: Binary Search Trees

Back

Objectives

Gain familiarity with implementing binary search trees.
The goal of this assignment is insure that everyone has a good grasp on the binary search tree data structure. It is one of the very commonly used data structures.

Overview

The binary search tree is one of the classic data structures. The name indicates virtually everything about it's structure. It is a tree, that is, it is a hierarchical arrangement of nodes, connected by edges. There is a single node called the root which provides access to all of the nodes of the tree. As a binary tree, each node has exactly two subtrees, often named "left" and "right". However, either or both of these subtrees could be empty. In the case that both subtrees are empty, that node is called a leaf. Finally, a binary search tree is structured to implement binary search, that is, the values stored in the tree have some ordering principle; specifically, all of the values in one of the subtrees of any node are less than the value of that node, typically, the left subtree; similarly, all of the values in the right subtree are greater than the value of the given node.

A binary search tree can be used in a number of different abstract data types. For this homework assignment, we will use the binary search tree to implement the set ADT. To allow you to focus on the tree structure and operations, in this exercise, we will not work with a generic set. Instead, this exercise will involve working with a set of String values. This avoids the need to cast the values within the set to Comparable, since java.lang.String explicitly implements java.lang.Comparable.

Minus Version

Download the interface StringSet_Minus.java. This is more or less a subset of the operations given in java.util.Set. Create an implementation of StringSet_Minus in the public class BSTSet.

Here are a few implementation notes:

The  methods of the interface are described in the JavaDoc comments included in the source code file you download.
Note: As described in the JavaDoc comments, this set will not accept null values.
There are three "versions" of toString, one for each of the common traversal patterns: in-order, pre-order, post-order.
The BSTSet class shall have a single constructor which creates an empty set, that is, an empty tree.
Your implementation should work to minimize the Big-O for the methods. That is, assuming a "reasonably bushy" underlying tree structure, the clear and isEmpty methods shall be O(k); the add and contains methods shall be O(log N); the toString methods shall be O(N).
Testing

Test your implementation.

You could use JUnit to create test cases.
You could create an application that instantiates a StringSet, populates it, and checks the return values from the methods.
Of course, the toString methods can be very helpful to check that the tree structure is as expected.
It is wisest to compare all three traversal orders: in-order, pre-order, and post-order.
Document the expected results of the tests. You can (should) determine the expected results before you write the implementation.
Check your actual results against the expected results.
The Node class

The Node class shall be a top-level class, rather than an inner (nested) class. Declare the node class package private, so it can be included within BSTSet.java. This is the unmarked access level, the one without a modifier keyword. Also, the fields in the class can be package private.

Here is an example of what it might look like, minus comments:

class Node {
   String value;
   Node left, right;
   public Node(String s) {
      value = s;
      left = right = null;
   }
}

Check Version

Download the interface StringSet_Check.java. Implement this interface in the BSTSet class. That is, update the Minus version of the class to handle the additional operations.

Here are a few additional implementation notes:

This is a subinterface of StringSet_Minus. There is no need to list both interfaces after implements. Implementing StringSet_Check entails implementing StringSet_Minus.
This subinterface adds two methods: remove and size.
The size method shall be O(k).
The remove method shall be the same as contains, O(log N).
Make sure you update your tests appropriately.
Plus Version

Download the interface StringSet_Plus.java. Implement this interface in the BSTSet class. That is, update the Check version of the class to handle the additional operations.

Here are a few additional implementation notes:

This is a subinterface of StringSet_Check.
This subinterface adds three methods: iteratorInOrder, iteratorPreOrder, and iteratorPostOrder.
Each of these methods returns a StringIterator.
These three methods: iteratorInOrder, iteratorPreOrder, and iteratorPostOrder shall be O(k).
For any of the StringIterator object returned by these methods, the hasNext and next methods shall be O(k). The remove method shall be O(log N).
Make sure you update your tests appropriately.
Report

Also, create a plain text, ASCII file named readme.txt. In readme.txt, address the following questions:

How did you go about approaching this assignment.
What works? What doesn't work?
How did you test your implementation? Include testing results.
What problems did you encounter as you worked on this assignment?
What did you learn from this work? How will you approach the next programming assignment differently?
Submission

Submit the following files:

BSTSet.java
Do not submit this source code file in an archive.
readme.txt
Do not submit this report file in an archive.
Testing file (optional. You may use the main method in BSTSet to test.)
You may submit a .jar file for your testing code.
Grading Rubric

Functionality: 9 point (check)
6/ minus version
   3/ implementation
   3/ testing
9/ check version
   3/ additional methods and updated testing
11/ plus version
   2/ additional methods and updated testing

Style: 2 points

Documentation: 4 points
2/ comments
2/ report

Back
