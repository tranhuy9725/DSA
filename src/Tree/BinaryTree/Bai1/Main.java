package Tree.BinaryTree.Bai1;

public class Main {
    public static void main(String[] args) {
        //Tao cay
        Tree tree = new Tree();
        tree.setRoot("Node 1");

        Node root = tree.root;

        Node n2 = new Node("Node 2");
        Node n3 = new Node("Node 3");
        Node n4 = new Node("Node 4");
        Node n5 = new Node("Node 5");
        Node n6 = new Node("Node 6");
        Node n7 = new Node("Node 7");
        Node n8 = new Node("Node 8");
        Node n9 = new Node("Node 9");
        Node n10 = new Node("Node 10");
        Node n11 = new Node("Node 11");
        Node n12 = new Node("Node 12");
        Node n13 = new Node("Node 13");
        Node n14 = new Node("Node 14");
        //Them node
        tree.addNode(root, n2);
        tree.addNode(root, n3);

        tree.addNode(n2, n4);
        tree.addNode(n2, n5);
        tree.addNode(n3, n6);
        tree.addNode(n3, n7);

        tree.addNode(n4, n8);
        tree.addNode(n5, n9);
        tree.addNode(n6, n10);
        tree.addNode(n6, n11);
        tree.addNode(n7, n14);

        tree.addNode(n8, n12);
        tree.addNode(n10, n13);


        //In cay
        tree.printTree(tree.root, 0);

        //Them trai nhat
        tree.addLeftMostNode("Node 15");
        System.out.println();
        //In cay
        tree.printTree(root, 0);
//        Them phai nhat
        tree.addRightMostNode("Node 16");
        System.out.println();
        tree.printTree(root, 0);
//        Preorder
        System.out.println();
        System.out.println("-- PreOrder --");
        tree.preOrder(root);
        //postorder
        System.out.println();
        System.out.println("-- PostOrder --");
        tree.postOrder(root);
    }
}
