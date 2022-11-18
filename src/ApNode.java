public class ApNode {
    private String name;
    private int rooms;
    private ApNode next;

    public ApNode(String name, int rooms) {
        setName(name);
        setRooms(rooms);
    }

    public boolean equalsName(String name){
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public ApNode getNext() {
        return next;
    }

    public void setNext(ApNode next) {
        this.next = next;
    }    
}
