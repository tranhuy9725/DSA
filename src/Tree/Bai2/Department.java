package Tree.Bai2;

import Tree.Bai1.StudentNode;
import Tree.Bai1.StudentTree;

public class Department {
    public static void main(String[] args) {
        DepartmentTree tree = new DepartmentTree("A"); // A là gốc

        DepartmentNode B = new DepartmentNode("B");
        DepartmentNode C = new DepartmentNode("C");
        DepartmentNode D = new DepartmentNode("D");

        tree.root.addChild(B);
        tree.root.addChild(C);
        tree.root.addChild(D);

        DepartmentNode E = new DepartmentNode("E");
        DepartmentNode F = new DepartmentNode("F");
        B.addChild(E);
        B.addChild(F);

        DepartmentNode G = new DepartmentNode("G");
        C.addChild(G);

        DepartmentNode H = new DepartmentNode("H");
        DepartmentNode I = new DepartmentNode("I");
        D.addChild(H);
        D.addChild(I);

        tree.preorder(tree.root);
        int total = tree.countDepartments(tree.root);
        System.out.println("Tổng số Department: " + total);
    }
}
