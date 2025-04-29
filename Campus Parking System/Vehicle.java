public class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;
    private static String[] existingLicensePlates = new String[100]; // Assuming max 100 vehicles
    private static int licensePlateCount = 0;
    
    public Vehicle(String licensePlate, String type, Owner owner) {
        
        if (isLicensePlateExists(licensePlate)) {
            System.out.println("Error: Vehicle with license plate " + licensePlate + " already exists!");
            return;
        }
        
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
        
        
        existingLicensePlates[licensePlateCount++] = licensePlate;
    }
    
    private boolean isLicensePlateExists(String licensePlate) {
        for (int i = 0; i < licensePlateCount; i++) {
            if (existingLicensePlates[i] != null && existingLicensePlates[i].equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }
    
    
    public Vehicle shallowCopy() {
        
        Vehicle copy = new Vehicle();
        copy.licensePlate = this.licensePlate + "-S"; 
        copy.type = this.type;
        copy.owner = this.owner; 
        existingLicensePlates[licensePlateCount++] = copy.licensePlate;
        return copy;
    }
    
    
    public Vehicle deepCopy() {
        
        Vehicle copy = new Vehicle();
        copy.licensePlate = this.licensePlate + "-D"; 
        copy.type = this.type;
        copy.owner = new Owner(this.owner); 
        existingLicensePlates[licensePlateCount++] = copy.licensePlate;
        return copy;
    }
    
    
    private Vehicle() {
        
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public String getType() {
        return type;
    }
    
    public Owner getOwner() {
        return owner;
    }
    
    @Override
    public String toString() {
        return "Vehicle: " + type + " (License: " + licensePlate + "), " + owner;
    }
}
