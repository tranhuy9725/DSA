package Tree.GeneralTree;

public class Tree {
    Node root;

    public void setRoot(String data) {
        this.root = new  Node(data);
    }

    public void addNode(Node parent, Node child) {
        if (parent.left == null) {
            parent.left = child;
        }else{
            Node current = parent.left;
            while (current.right != null) {
                current = current.right;
            }
            current.right = child;
        }
    }

    public void preorder(Node node) {
        if(node == null) return;
        System.out.print(node.data + " | ");
        preorder(node.left);
        preorder(node.right);
    }


}
