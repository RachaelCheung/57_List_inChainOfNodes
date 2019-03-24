/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
    public int size() {
        Node current = headReference; 
        int count = 0; 
        while (current != null){ 
            count++; 
            current = current.getReferenceToNextNode(); 
        } 
        return count; 
    } 
    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		Node current = headReference; 
        String output = "["; 
        while (current != null){ 
            output+= current.getCargo() + ",";
            current = current.getReferenceToNextNode(); 
        } 
		output += "]";
        return output; 
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		Node tempHead = headReference;
		headReference = new Node(val, tempHead);
        return true;
     }
}