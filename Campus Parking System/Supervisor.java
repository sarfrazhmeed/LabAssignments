public class Supervisor extends Person {
    private int yearsOfExperience;
    
    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public String toString() {
        return "Supervisor: " + super.toString() + ", Experience: " + yearsOfExperience + " years";
    }
}
