package app;

/**
 * BinaryTS
 */
public class BinaryTS {

    Node root;

    public BinaryTS(){
        this.root = null;
    }

    public void insertNode(int value){
        root = insertRecursive(root, value);
    }

    public Node insertRecursive(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRecursive(root.left, value);
        }
        else{
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

    // Return Left and Right Nodes
    public Node left(Node node){
        if (node.left == null) {
            return null;
        }
        return node.left;
    }
    public Node right(Node node){
        if (node.right == null) {
            return null;
        }
        return node.right;
    }

    // Print Order Methods
    public void inOrder(){
        inOrderRecursive(root);
    }
    public void inOrderRecursive(Node root){
        if (root != null) { 
            inOrderRecursive(root.left); 
            System.out.println(root.value); 
            inOrderRecursive(root.right); 
        } 
    }

    public void postOrder(){
        postOrderRecursive(root);
    }
    private void postOrderRecursive(Node root) {
        if (root != null) { 
            postOrderRecursive(root.left); 
            postOrderRecursive(root.right); 
            System.out.println(root.value); 
        } 
    }

    public void preOrder(){
        preOrderRecursive(root);
    }
    public void preOrderRecursive(Node root){
        if (root != null) {
            System.out.println(root.value);
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    // Find K Node
    public void isNode(int k){
       isNodeRecursive(root, k);
            
    }
	public void isNodeRecursive(Node root, int k) {
        if ((k < root.value) && (root.left != null)) {
            isNodeRecursive(root.left, k);
        }
        else if((k > root.value) && (root.right != null)){
            isNodeRecursive(root.right, k);
        }
        else if (k == root.value) {
            System.out.println("Found It!");
        }
        else{
            System.out.println("There is no such Node!");
        }
    }
    
    // Return Smaller Node Value
    public void returnMinor(){
        returnMinorRecusive(root);
    }
    private void returnMinorRecusive(Node root) {
        if(root.left != null){
            returnMinorRecusive(root.left);
        }
        else{
            System.out.println(root.value);
        }
    }

    // Number of Nodes
    public void numberOfNodes(){
        System.out.println(numberOfNodesRecursive(root, 0));
    }
    private int numberOfNodesRecursive(Node root, int i) {
        if(root != null){
            i++;
            i = numberOfNodesRecursive(root.left, i);
            i = numberOfNodesRecursive(root.right, i);
            return i;
        }
        return i;
    }

    // Return Tree Height
	public void returnHeight() {
        System.out.println(returnHeightRecursive(root));
    }
    public int returnHeightRecursive(Node root){
        if (root != null) {
            int left = 0;
            int right = 0;
            left = returnHeightRecursive(root.left);
            right = returnHeightRecursive(root.right);

            int height = Math.max(left, right);
            return height + 1;
        }
        return 0;
    }
    // Return Sum
    public void returnSum(){
        System.out.println(returnSumRecursive(root));
    }
    private double returnSumRecursive(Node root) {
        if(root != null){
            return root.value + returnSumRecursive(root.left) + returnSumRecursive(root.right); 
        }
        return 0;
    }
    // Return Avarage
	public void returnAvg() {
        System.out.println(returnSumRecursive(root)/numberOfNodesRecursive(root, 0));
	}

    // Return Number of Nulls
	public void returnNull() {
        System.out.println(returnNullRecusive(root, 0));
	}
    private int returnNullRecusive(Node root, int i) {
        if(root != null){
            if(root.left == null){
                i ++;
            }
            if(root.right == null){
                i ++;
            }

            i = returnNullRecusive(root.left, i);
            i = returnNullRecusive(root.right, i);
            return i;
        }
        return i;
    }

    // Return Multiple
	public void returnMultiple(int i) {
        returnMultipleRecursive(root, i);
	}
    private void returnMultipleRecursive(Node root, int i) {
        if (root != null) { 
            returnMultipleRecursive(root.left, i); 
            if(root.value % i == 0){
                System.out.println(root.value); 
            }
            returnMultipleRecursive(root.right, i); 
        } 
    }
    
}