public class ParkingSystem {
    private static ParkingSystem instance;
    private String campusName;
    private Supervisor supervisor;
    private ParkingZone[] zones;
    private int zoneCount;
    private PermitHolder[] permitHolders;
    private int permitHolderCount;
    private final int MAX_ZONES = 10;
    private final int MAX_PERMIT_HOLDERS = 100; 
    
    
    private ParkingSystem(String campusName, Supervisor supervisor) {
        this.campusName = campusName;
        this.supervisor = supervisor;
        this.zones = new ParkingZone[MAX_ZONES];
        this.zoneCount = 0;
        this.permitHolders = new PermitHolder[MAX_PERMIT_HOLDERS];
        this.permitHolderCount = 0;
    }
    
    
    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (instance == null) {
            if (supervisor == null) {
                System.out.println("Error: Supervisor must be assigned for the system to function.");
                return null;
            }
            instance = new ParkingSystem(campusName, supervisor);
            return instance;
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
            return instance;
        }
    }
    
    public boolean addZone(ParkingZone zone) {
        if (zone == null) {
            return false;
        }
        
        if (zoneCount >= MAX_ZONES) {
            System.out.println("Error: Maximum number of zones reached.");
            return false;
        }
        
        zones[zoneCount++] = zone;
        return true;
    }
    
    public boolean addPermitHolder(PermitHolder permitHolder) {
        if (permitHolder == null) {
            return false;
        }
        
        if (permitHolderCount >= MAX_PERMIT_HOLDERS) {
            System.out.println("Error: Maximum number of permit holders reached.");
            return false;
        }
        
        permitHolders[permitHolderCount++] = permitHolder;
        return true;
    }
    
    public PermitHolder findPermitHolderById(String permitId) {
        for (int i = 0; i < permitHolderCount; i++) {
            if (permitHolders[i] != null && permitHolders[i].getPermitId().equals(permitId)) {
                return permitHolders[i];
            }
        }
        return null;
    }
    
    public String getCampusName() {
        return campusName;
    }
    
    public Supervisor getSupervisor() {
        return supervisor;
    }
    
    public ParkingZone[] getZones() {
        return zones;
    }
    
    public int getZoneCount() {
        return zoneCount;
    }
    
    public PermitHolder[] getPermitHolders() {
        return permitHolders;
    }
    
    public int getPermitHolderCount() {
        return permitHolderCount;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus Parking Management System\n");
        sb.append("Campus: ").append(campusName).append("\n");
        sb.append(supervisor).append("\n\n");
        
        sb.append("Parking Zones (").append(zoneCount).append("):\n");
        for (int i = 0; i < zoneCount; i++) {
            sb.append("-------------------\n");
            sb.append(zones[i]).append("\n");
        }
        
        sb.append("Permit Holders (").append(permitHolderCount).append("):\n");
        for (int i = 0; i < permitHolderCount; i++) {
            sb.append("  - ").append(permitHolders[i]).append("\n");
        }
        
        return sb.toString();
    }
}
