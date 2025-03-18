public class Lab {
    private String name;
    private Employee labStaff;
    private SystemUnit[] pclist;
    private boolean multiMedia;

    // Constructor
    public Lab(String name, Employee labStaff, SystemUnit[] pclist, boolean multiMedia) {
        this.name = name;
        this.labStaff = labStaff;
        this.pclist = pclist;
        this.multiMedia = multiMedia;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLabStaff() {
        return labStaff;
    }

    public void setLabStaff(Employee labStaff) {
        this.labStaff = labStaff;
    }

    public SystemUnit[] getPcList() {
        return pclist;
    }

    public void setPcList(SystemUnit[] pclist) {
        this.pclist = pclist;
    }

    public boolean hasMultiMedia() {
        return multiMedia;
    }

    public void setMultiMedia(boolean multiMedia) {
        this.multiMedia = multiMedia;
    }

    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("\nLab Name: ").append(name);
        st.append("\nLab Staff: ").append(labStaff);
        st.append("\nHas MultiMedia: ").append(multiMedia);
        st.append("\nComputers:\n");
        for (SystemUnit pc : pclist) {
            st.append(pc).append("\n");
        }
        return st.toString();
    }
}
