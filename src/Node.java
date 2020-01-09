import java.util.List;

public class Node {
    public String name;
    public List<Node> children = null;

    public Node (String name, List<Node> children) {
        this.name = name;
        this.children = children;
    }

    public Node (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
