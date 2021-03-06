/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
		
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
						  
		// test "get" method
		System.out.println(list.get(0) + "... expecting S");
		System.out.println(list.get(3) + "...expecting y");
		
		//test add method
		list.set(0,"new");
		list.set(2,"new2");
		list.set(3,"new3");
		
		System.out.println(list + "...expecting [new,t,new2,new3]");
		
		list.add(0,"start");
		list.add(3,"add");
		list.add(5,"end");
		
		System.out.println(list + "... expecting [new,t,new2,add,new3,end,]");
		
		list.remove(5);
		list.remove(2);
		list.remove(0);
		System.out.println(list + "... expecting [t,add,new3,]");
    }
}
