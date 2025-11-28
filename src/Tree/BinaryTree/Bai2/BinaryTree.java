package Tree.BinaryTree.Bai2;

import java.util.List;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void addNode(Node parent, Node child) {
        if (parent == null || child == null) return;

        if (parent.left == null) {
            parent.left = child;
        } else if (parent.right == null) {
            parent.right = child;
        } else {
            System.out.println("Cảnh báo: Node " + parent.data + " đã đủ 2 con. Không thể thêm " + child.data);
        }
    }

    public void addLeft(Node parent, Node child) {
        if (parent != null) parent.left = child;
    }

    public void addRight(Node parent, Node child) {
        if (parent != null) parent.right = child;
    }


    void printPreOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    int findMax(Node node) {
        if (node == null) return Integer.MIN_VALUE;

        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res) res = lres;
        if (rres > res) res = rres;
        return res;
    }

    int findMin(Node node) {
        if (node == null) return Integer.MAX_VALUE;

        int res = node.data;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res) res = lres;
        if (rres < res) res = rres;
        return res;
    }

    int height(Node node) {
        if (node == null) return 0;
        int lHeight = height(node.left);
        int rHeight = height(node.right);

        return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
    }

    int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    boolean hasPath(Node root, int x, List<Integer> path) {
        if (root == null) return false;

        path.add(root.data);

        if (root.data == x) return true;

        if (hasPath(root.left, x, path) || hasPath(root.right, x, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }


    int getDiameter(Node node) {
        if (node == null) return 0;

        int lHeight = height(node.left);
        int rHeight = height(node.right);

        int lDiameter = getDiameter(node.left);
        int rDiameter = getDiameter(node.right);


        return Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter));
    }
}
