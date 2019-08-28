package app;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTS BTS = new BinaryTS();

        // 1 - Starting Array  {3,7,8,9,10,5}
        int[] data = {3, 7, 8, 9, 10, 5};

        // Inserting Array data in Binary Tree
        for (int i = 0; i < data.length; i++) {
            BTS.insertNode(data[i]);
        }

        // 2 - Inserting an Int K in the tree
        int k = 2;
        BTS.insertNode(k);

        // 3 - PreOrder Printing
        System.out.println("********** PRE ORDER **********");
        BTS.preOrder();
        // 4 - PostOrder Printing
        System.out.println("********** POST ORDER **********");
        BTS.postOrder();
        // 5 -InOrder Printing
        System.out.println("********** IN ORDER **********");
        BTS.inOrder();
        // 6 - Finding K
        System.out.println("********** FINDING K NODE **********");
        BTS.isNode(k);
        // 7 - Print Minor
        System.out.println("********** RETURN MINOR NODE **********");
        int minor = 1;
        BTS.insertNode(minor);
        System.out.println("Smaller Node Value: "); BTS.returnMinor();
        // 8 - Print Number of Nodes
        System.out.println("********** NUMBER OF NODES **********");
        BTS.numberOfNodes();
        // 9 - Print Avarage 
        System.out.println("********** AVARAGE OF NODES **********");
        BTS.returnAvg();
        // 10 - Print Number of Nodes
        System.out.println("********** HEIGHT OF A TREE **********");
        BTS.returnHeight();
        // 11 - Return Number of NULL's
        System.out.println("********** NUMBER OF NULL'S **********");
        BTS.returnNull();
        // 12 - Print Multiple of Two
        System.out.println("********** MULTIPLES OF TWO **********");
        int i = 2;
        BTS.returnMultiple(i);
        // 13 - Print Sum of Elements
        System.out.println("********** SUM OF ELEMENTS **********");
        BTS.returnSum();
    }
}