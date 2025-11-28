package Tree.BinaryTree.Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        Node root = tree.root;

        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n14 = new Node(14);


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

        System.out.println("--- 1. Duyệt cây Pre-order ---");
        tree.printPreOrder(tree.root);

        System.out.println("\n\n--- 2. Tổng số node ---");
        System.out.println("Tổng node: " + tree.countNodes(tree.root));

        System.out.println("\n--- 3. Max và Min ---");
        System.out.println("Max: " + tree.findMax(tree.root));
        System.out.println("Min: " + tree.findMin(tree.root));

        System.out.println("\n--- 4. Chiều cao cây ---");
        System.out.println("Chiều cao: " + tree.height(tree.root));

        System.out.println("\n--- 5. Số node lá ---");
        System.out.println("Số leaf nodes: " + tree.countLeaves(tree.root));

        System.out.println("\n--- 6. Tìm đường đi đến node 13 ---");
        List<Integer> path = new ArrayList<>();
        if (tree.hasPath(tree.root, 13, path)) {
            System.out.println(path);
        }

        System.out.println("\n--- 7. Diameter của cây ---");
        System.out.println("Diameter: " + tree.getDiameter(tree.root));
    }
}
