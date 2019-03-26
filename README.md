# 57_List_inChainOfNodes
Represent a list, implemented in a chain of nodes
### hw57-58
by Rachael Cheung

## Node Class
#### Fields:
```
private Object cargoReference;
private Node   referenceToNextNode;
```

#### Constructor(s):
```
 public Node( Object cargoReference)
 public Node( Object cargoReference, Node referenceToNextNode)
```

#### Methods:
``` 
// Returns a String representation of the instance 
public String toString()

// Returns a reference to the next node
public Node getReferenceToNextNode()

// sets the referenceToNextNode to the Node given in the parameter
public void setReferenceToNextNode( Node referenceToNextNode)

// cargoReference accessor for List_inChainOfNodes toString()
public Object getCargo(

```

## UserOfNode class:
- Creates an instance of Node
- tests methods in Node

## List_inChainOfNodes class:
#### Fields:
```
private Node headReference; //head Node of the Node chain
```

#### Methods:
``` 
// Returns the number of elements in this list
public int size()

// Returns a String representation of the instance 
public String toString()

// Appends value to the head of the list
public boolean addAsHead( Object val)

// Sets value at a given index of the list
public void set(int index, Object val)

// Returns the value of the list at a given index
public Object get(int index)

// Appends a value at a given index
public boolean add(int index, Object val)

// Removes a value at a given index
public boolean remove (int index)

// Helper function that returns Node at given index
// Used by set, get, add, and remove methods
private Node nodeAt(int index)
```

## UserOfList class:
- Creates an instance of List_inChainOfNodes
- tests methods in List_inChainOfNodes



