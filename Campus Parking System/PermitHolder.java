public class PermitHolder extends Person {
    private static int permitCounter = 1;
    private String permitId;
    
    public PermitHolder(String name) {
        super(name);
        this.permitId = generatePermitId();
    }
    
    private String generatePermitId() {
        String id = String.format("P%03d", permitCounter);
        permitCounter++;
        return id;
    }
    
    public String getPermitId() {
        return permitId;
    }
    
    @Override
    public String toString() {
        return "Permit Holder: " + super.toString() + " (Permit ID: " + permitId + ")";
    }
    
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PermitHolder other = (PermitHolder) obj;
        return permitId.equals(other.permitId);
    }
}
