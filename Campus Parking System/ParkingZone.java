public class ParkingZone {
    private static int zoneCounter = 1;
    private String zoneId;
    private Vehicle[] vehicles;
    private int vehicleCount;
    private final int MAX_VEHICLES = 5;
    
    public ParkingZone() {
        this.zoneId = generateZoneId();
        this.vehicles = new Vehicle[MAX_VEHICLES];
        this.vehicleCount = 0;
    }
    
    private String generateZoneId() {
        String id = "A" + zoneCounter;
        zoneCounter++;
        return id;
    }
    
    public String getZoneId() {
        return zoneId;
    }
    
    public boolean addVehicle(Vehicle vehicle) {
        if (vehicle == null || vehicle.getLicensePlate() == null) {
            return false; 
        }
        
        if (vehicleCount >= MAX_VEHICLES) {
            System.out.println("Error Zone: " + zoneId + " is full. Cannot add more vehicles.");
            return false;
        }
        
        vehicles[vehicleCount++] = vehicle;
        return true;
    }
    
    public Vehicle[] getVehicles() {
        return vehicles;
    }
    
    public int getVehicleCount() {
        return vehicleCount;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zone ID: ").append(zoneId).append("\n");
        sb.append("Vehicles: ").append(vehicleCount).append("/").append(MAX_VEHICLES).append("\n");
        
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i] != null && vehicles[i].getLicensePlate() != null) {
                sb.append("  - ").append(vehicles[i]).append("\n");
            }
        }
        
        return sb.toString();
    }
}
