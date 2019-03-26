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
		headReference = new Node(val, headReference);
        return true;
     }
	 
	 
	 public void set(int index, Object val){
		 Node tempNext = nodeAt(index+1);	
		 Node newNode = new Node(val, tempNext);
		 if (index != 0)
			nodeAt(index-1).setReferenceToNextNode(newNode);
		 else 
			 headReference = newNode;
	 }
	 
	 public Object get(int index){
		 return nodeAt(index).getCargo();
	 }
	 
	 public boolean add(int index, Object val){
		 Node tempNext = nodeAt(index);	
		 Node newNode = new Node(val, tempNext);
		 if (index != 0)
			nodeAt(index-1).setReferenceToNextNode(newNode);
		 return true;
	 }
	 
	 public boolean remove (int index){
		 Node tempNode = nodeAt(index+1);
		 Node thisNode = nodeAt(index-1);
		 thisNode.setReferenceToNextNode(tempNode);
		 return true;
	 }
	 
	 //helper function that returns Node at given index
	 private Node nodeAt(int index){
		 Node current = headReference;
		 int nodeIndex = 0;
		 while (current != null){
			 if (nodeIndex == index)
				 return current;
			 current = current.getReferenceToNextNode();
			 nodeIndex++;
		 }
		 return current;
	 }
	 
}