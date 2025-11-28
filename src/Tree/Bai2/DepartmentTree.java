package Tree.Bai2;


import Tree.Bai1.StudentNode;

public class DepartmentTree {
    DepartmentNode root;


    public DepartmentTree(String DepartmentName) {
        root = new DepartmentNode(DepartmentName);
    }

    public void preorder(DepartmentNode node) {
        if (node == null) return;
        System.out.println(node.name + " ");
        for (DepartmentNode child : node.children) {
            preorder(child);
        }
    }

    public void postorder(DepartmentNode node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        for (DepartmentNode child : node.children) {
            postorder(child);
        }
    }

    public int countDepartments(DepartmentNode node) {
        if (node == null) return 0;

        int total = 1;
        for (DepartmentNode child : node.children) {
            total += countDepartments(child);
        }
        return total;
    }
}
