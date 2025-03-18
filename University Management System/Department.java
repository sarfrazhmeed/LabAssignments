public class Department {
    private String name;
    private Employee hod;
    private Lab[] labs;
    private Employee[] professors;

    public Department(String name, Employee hod, Lab[] labs, Employee[] professors) {
        this.name = name;
        this.hod = hod;
        this.labs = labs;
        this.professors = professors;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getHod() {
        return hod;
    }

    public void setHod(Employee hod) {
        this.hod = hod;
    }

    public Lab[] getLabs() {
        return labs;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public Employee[] getProfessors() {
        return professors;
    }

    public void setProfessors(Employee[] professors) {
        this.professors = professors;
    }

    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("\nDepartment: ").append(name);
        st.append("\nHead of Department: ").append(hod);
        st.append("\nProfessors:\n");
        for (Employee prof : professors) {
            st.append(prof).append("\n");
        }
        st.append("\nLabs:\n");
        for (Lab lab : labs) {
            st.append(lab).append("\n");
        }
        return st.toString();
    }
}
