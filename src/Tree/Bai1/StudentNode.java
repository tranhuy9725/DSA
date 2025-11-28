package Tree.Bai1;

import java.util.ArrayList;
import java.util.List;

public class StudentNode {
    String name;
    List<StudentNode> children;

    public StudentNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(StudentNode child) {
        children.add(child);
    }
}
