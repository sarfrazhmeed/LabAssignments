public class Campus {
    private String universityName;
    private Department[] departments;

    public Campus(String universityName, Department[] departments) {
        this.universityName = universityName;
        this.departments = departments;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("\nUniversity Name: ").append(universityName);
        st.append("\nDepartments:\n");
        for (Department dept : departments) {
            st.append(dept).append("\n");
        }
        return st.toString();
    }
}
