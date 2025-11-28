package Tree.Bai1;

public class Main {
    public static void main(String[] args) {
        StudentTree tree = new StudentTree("A"); // A là gốc

        StudentNode B = new StudentNode("B");
        StudentNode C = new StudentNode("C");
        StudentNode D = new StudentNode("D");

        tree.root.addChild(B);
        tree.root.addChild(C);
        tree.root.addChild(D);

        StudentNode E = new StudentNode("E");
        StudentNode F = new StudentNode("F");
        B.addChild(E);
        B.addChild(F);

        StudentNode G = new StudentNode("G");
        C.addChild(G);

        StudentNode H = new StudentNode("H");
        StudentNode I = new StudentNode("I");
        D.addChild(H);
        D.addChild(I);

        System.out.println("Duyệt Preorder (Cha -> Con):");
        tree.traversePreorder(tree.root);
        System.out.println("\n");

        System.out.println("Duyệt Postorder (Con -> Cha):");
        tree.traversePostorder(tree.root);
    }
}
