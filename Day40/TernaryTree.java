public class TernaryTree
{
    private Node root;

    /**
     * Creates a TernaryTree with the given data and child trees.
     * 
     * @param data the data the root holds
     * @param leftChild the left subtree
     * @param middleChild the middle subtree
     * @param rightChild the right subtree
     */
    public TernaryTree(int data)
    {
        root = new Node();
        root.data = data;
    }

    /**
     * A class that looks for the largest element of the tree
     * 
     * @return the biggest number in the tree
     */
    public int largestElement()
    {
        return root.largestElement(root);
    }
    

    /**
     * Sets the left subtree of the TernaryTree.
     * 
     * If there was a previous left subtree, it is replaced.
     * 
     * @param subtree the new left subtree
     */
    public void setLeftSubtree(TernaryTree subtree)
    {
        root.leftChild = subtree.root;
    }

    /**
     * Sets the middle subtree of the TernaryTree.
     * 
     * If there was a previous middle subtree, it is replaced.
     * 
     * @param subtree the new middle subtree
     */
    public void setMiddleSubtree(TernaryTree subtree)
    {
        root.middleChild = subtree.root;
    }

    /**
     * Sets the right subtree of the TernaryTree.
     * 
     * If there was a previous right subtree, it is replaced.
     * 
     * @param subtree the new right subtree
     */
    public void setRightSubtree(TernaryTree subtree)
    {
        root.rightChild = subtree.root;
    }

    /**
     * Performs preorder traversal with the Visitor interface.
     * 
     * Calls the private, recursive preorder traversal.
     * 
     * @param v the visitor
     */
    public void preorder(Visitor v)
    {
        preorder(root, v);
    }

    /**
     * Private recursive preorder().
     * 
     * @param n the node to visit
     * @param v the visitor
     */
    private static void preorder(Node n, Visitor v)
    {
        if (n == null)
        {
            return;
        }
        v.visit(n.data);
        preorder(n.leftChild, v);
        preorder(n.middleChild, v);
        preorder(n.rightChild, v);
    }
    
    /**
     * Inner class Node, only available within TernaryTree.
     * 
     * Each Node may have 0, 1, 2, or 3 children, named
     * leftChild, middleChild, and rightChild.
     * 
     * For simplicity of use, each Node's data is an int.
     */
    class Node
    {
        public int data;
        public Node leftChild;
        public Node middleChild;
        public Node rightChild;

        /**
         * A class that looks for the largest element in the left, right and middle branches of a tree
         * 
         * @param root the branch to visit in the tree
         * @return the largest element of the tree
         */
        public int largestElement(Node root)
        {
            int leftSide;
            int rightSide;
            int middleSide;
            int value = root.data;

            if (root.rightChild != null) 
            {
                rightSide = largestElement(root.rightChild);
                value = Math.max(value, rightSide);
            }
            if (root.leftChild != null) 
            {
                leftSide = largestElement(root.leftChild);
                value = Math.max(value, leftSide);
            }
            if (root.middleChild != null) 
            {
                middleSide = largestElement(root.middleChild);
                value = Math.max(value, middleSide);
            }
            return value;
        } 
    }
}