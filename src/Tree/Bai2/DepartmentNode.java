package Tree.Bai2;

import java.util.ArrayList;
import java.util.List;

public class DepartmentNode {
    String name;
    List<DepartmentNode> children;

    public DepartmentNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(DepartmentNode child) {
        children.add(child);
    }
}
