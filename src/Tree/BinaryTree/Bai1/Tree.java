package Tree.BinaryTree.Bai1;

public class Tree {
    Node root;

    public void setRoot(String data){
        this.root = new Node(data);
    }

    public void addNode(Node parent, Node child){
        if(parent.left == null){
            parent.left = child;
        } else if(parent.right == null){
            parent.right = child;
        }
    }

    //Tim node trai nhat
    private Node findLeftMostNode(Node node){
        if (node == null) return null;
        if(node.left == null) return node;
        Node child = node.left;
        return findLeftMostNode(child);
    }
    //Them trai nhat
    public void addLeftMostNode(String data){
        //Lay node trai nhat hien tai
        Node node = findLeftMostNode(root);
        //Kiem tra cay co ton tai khong
        if(node != null){
            node.left = new Node(data);
        }
    }

    //Tim node phai nhat
    private Node findRightMostNode(Node node){
        if (node == null) return null;
        if (node.right == null) return node;
        return findRightMostNode(node.right);
    }
    //Them phai nhat
    public void addRightMostNode(String data){
        Node node = findRightMostNode(root);
//        System.out.println(node.data);
        if(node != null){
            node.right = new Node(data);
        }
    }

    //In cay
    public void printTree(Node node, int level){
        if(node == null){
            return;
        }
        for (int i = 0; i < level; i++)
        {
            System.out.print("   ");
        }
        System.out.println("- " + node.data);
        printTree(node.left, level + 1);
        printTree(node.right, level + 1);
    }

    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.data + " | ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        System.out.print(node.data + " | ");
        postOrder(node.right);
    }
}
