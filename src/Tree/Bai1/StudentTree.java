package Tree.Bai1;

public class StudentTree {
    StudentNode root;

    public StudentTree(String rootName) {
        root = new StudentNode(rootName);
    }

    public void traversePreorder(StudentNode node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        for (StudentNode child : node.children) {
            traversePreorder(child);
        }
    }

    public void traversePostorder(StudentNode node) {
        if (node == null) return;
        for (StudentNode child : node.children) {
            traversePostorder(child);
        }
        System.out.print(node.name + " ");
    }
}
