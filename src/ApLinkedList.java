public class ApLinkedList {
    private ApNode head;

    /**
     * @param name
     * @param rooms
     * Adds the renter with above info into Sinly Linked List
     */
    public void addRenter(String name, int rooms){
        var node = new ApNode(name, rooms);
        if(head == null){
            head = node;
            return;
        }
        var current = head;
        while(current.getNext() != null)
            current = current.getNext();
        current.setNext(node);

        System.out.println("Booking an Aprtment processed successfully.");
    }

    /**
     * @param name
     */
    public void cancelRenter(String name){
        if(head == null || existsRenter(name) == null) return;
        if(head.equalsName(name))
            head = head.getNext();
        else{
            var current = head;
            while(!current.getNext().equalsName(name))
                current = current.getNext();
            current.setNext(current.getNext().getNext());
        }
        System.out.println("Renter named " + name + " has been removed successfully");
    }

    /**
     * @param name
     * @return true whether Renter exists or not
     */
    public ApNode existsRenter(String name) {
        var current = head;
        while(current != null){
            if(current.equalsName(name)) 
                return current;
            
            current = current.getNext();
        }
        return null;
    }

    /**
     * Displays the records from the list
     */
    public void display(){
        var current = head;

        System.out.println(
            "All Apartments Bookings: \n" + 
            "Renter \t\t\t Rooms");
        while(current != null){
            System.out.println(current.getName() + "\t\t\t " + current.getRooms());
            current = current.getNext();
        }
    }
}
