import java.util.List;

// James Provencher 01/09/2020

public class Traversal {
    public static void main(String[] args) {
        //Creation of tree
        Node e1=new Node("E1");
        Node d1=new Node("D1",List.of(e1));
        Node a1=new Node("A1",List.of(d1));

        Node findMe=new Node("FindMe");
        Node b1=new Node("B1", List.of(findMe));
        Node c1=new Node("C1");
        Node b2=new Node("B2",List.of(c1));
        Node a2=new Node("A2", List.of(b1, b2));

        Node start = new Node("Start", List.of(a1, a2));

        FindMe search = new FindMe();
        search.traverse(start);
    }
}
