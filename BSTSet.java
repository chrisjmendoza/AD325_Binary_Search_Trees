/**
 * Created by Chris Mendoza
 * on 1/18/2016.
 */
public class BSTSet implements StringSet_Check {

    Node overallRoot;
    private int nodeCount;

    /**
     * Default constructor
     */
    public BSTSet(String letter) {
        overallRoot.value = letter;
        nodeCount++;
    }

    /**
     * Adds the specified element to this set if it is
     * not already present. More formally, adds the
     * specified element s to this set if the set contains
     * no element s2 such that s.equals(s2). If this
     * set already contains the element, the call leaves
     * the set unchanged and returns false. This ensures
     * that the set never contains duplicate elements.
     *
     * @param s element to be added to this set
     * @return true if this set did not already contain
     * the specified element
     * @throws NullPointerException if the specified
     *                              element is null
     */
    @Override
    public boolean add(String s) {
        if(overallRoot.value == null) { // if the starting node is null or empty, add the value to the root
            overallRoot.value = s;
            return true;
        } else {
            // search the tree for the letter
            if(!this.traverse(overallRoot, s)) {
                // if not found, add the letter according to its weight
                this.addTraverse(overallRoot, s);
                nodeCount++;
                return true; // return true to indicate that the letter was successfully added
            } else {
                return false;
            }
        }
    }

    /**
     * Traverses the tree to look for the string being added
     * @param current the current Node to check
     * @param letter the letter to add to the tree
     * @return true if the element exists in the tree
     */
    private boolean traverse(Node current, String letter) {
        // check the current node against the letter, return true if same
        if(current.value.compareToIgnoreCase(letter) == 0) {
            return true;
        } else {
            // if not, check the left branches
            traverse(current.left, letter);
            // check the right branches
            traverse(current.right, letter);
        }
        // if not found, return false
        return false;
    }

    /**
     * Traverses the tree to add a value.
     * @param current The current Node the traversal is checking
     * @param letter The passed String value
     */
    private void addTraverse(Node current, String letter) {
        // check the current node value against the letter to add
        // if it is less (smaller) than the current value, look to the left
        if(current.value.compareToIgnoreCase(letter) < 0) {
            // check if the left branch is null, if so, add new Node
                if(current.left == null) {
                    current.left = new Node(letter);
                    // increment the node counter
                    nodeCount++;
                } else {
                    // if it is not null, move down the node to check the value
                    addTraverse(current.left, letter);
                }
            } else {
            // same as above but for the right node
                if(current.right == null) {
                    current.right = new Node(letter);
                    nodeCount++;
                } else {
                    addTraverse(current.right, letter);
                }
            }
        }

    /**
     * Removes all of the elements from this set. The set
     * will be empty after this call returns.
     */
    @Override
    public void clear() {
        overallRoot.value = null;
        overallRoot.left = overallRoot.right = null;
    }

    /**
     * Returns true if this set contains the
     * specified element. More formally, returns true
     * if and only if this set contains an element e
     * such that s.equals(e).
     *
     * @param s element whose presence in this set is
     *          to be tested
     * @return true if this set contains the specified
     * element
     * @throws NullPointerException if the specified
     *                              element is null
     */
    @Override
    public boolean contains(String s) throws NullPointerException {
        return this.traverse(overallRoot, s);
    }

    /**
     * Returns true if this set contains no elements.
     *
     * @return true if this set contains no elements
     */
    @Override
    public boolean isEmpty() {
        return nodeCount <= 0;
    }

    /**
     * Removes the specified element from this set if
     * it is present. More formally, this removes an
     * element e such that s.equals(e), if this set
     * contains such an element. Returns true if this
     * set contained the element (or equivalently, if
     * this set changed as a result of the call).
     * (This set will not contain the element once the
     * call returns.)
     *
     * @param s the String to be removed from this set,
     *          if present
     * @return true if this set contained the specified
     * element
     * @throws NullPointerException if the specified
     *                              element is null
     */
    @Override
    public boolean remove(String s) throws NullPointerException {
        if(this.traverse(overallRoot, s)) {


            nodeCount--;
            return true;
        } else {
            return false;
        }

    }

    /**
     * Returns the number of elements in this set (its
     * cardinality).
     *
     * @return the number of elements in this set (its
     * cardinality)
     */
    @Override
    public int size() {
        return nodeCount;
    }



    /**
     * Returns a String containing all of the elements
     * in this set ordered using an in-order traversal
     * of the underlying tree. The values are separated
     * by spaces, ' '. Ideally, there should not be a
     * final space separator in the returned string.
     *
     * @return A string representation of the elements of
     * the set ordered by an in-order traversal of the
     * underlying tree.
     */
    @Override
    public String toStringInOrder() {
        return null;
    }

    /**
     * Returns a String containing all of the elements
     * in this set ordered using a pre-order traversal
     * of the underlying tree. The values are separated
     * by spaces, ' '. Ideally, there should not be a
     * final space separator in the returned string.
     *
     * @return A string representation of the elements of
     * the set ordered by a pre-order traversal of the
     * underlying tree.
     */
    @Override
    public String toStringPreOrder() {
        return null;
    }

    /**
     * Returns a String containing all of the elements
     * in this set ordered using a post-order traversal
     * of the underlying tree. The values are separated
     * by spaces, ' '. Ideally, there should not be a
     * final space separator in the returned string.
     *
     * @return A string representation of the elements of
     * the set ordered by a post-order traversal of the
     * underlying tree.
     */
    @Override
    public String toStringPostOrder() {
        return null;
    }
}
