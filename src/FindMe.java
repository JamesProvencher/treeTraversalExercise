// James Provencher 01/09/2020
// Class that has method to recursively search for the FindMe node
public class FindMe {
   public Node traverse(Node current) {
       if (current != null) {
           if (current.getName().equals("FindMe")) {
               System.out.println(current.getName());
               return current;
           }

           System.out.println(current.getName());
           if(current.getChildren() != null) {
               for (int i = 0; i < current.getChildren().size(); i++) {
                   Node result = traverse(current.getChildren().get(i));
                   if(result != null) {
                       return result;
                   }
               }
           }
       }
       return null;
   }
}
