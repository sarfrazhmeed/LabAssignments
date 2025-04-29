public class Owner extends Person {
    private static int ownerCounter = 1;
    private String ownerId;
    
    public Owner(String name) {
        super(name);
        this.ownerId = generateOwnerId();
    }
    
    
    public Owner(Owner other) {
        super(other.getName());
        this.ownerId = other.ownerId;
    }
    
    private String generateOwnerId() {
        String id = String.format("O%03d", ownerCounter);
        ownerCounter++;
        return id;
    }
    
    public String getOwnerId() {
        return ownerId;
    }
    
    @Override
    public String toString() {
        return "Owner: " + super.toString() + " (ID: " + ownerId + ")";
    }
}
