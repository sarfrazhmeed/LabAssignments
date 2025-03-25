class School {
    String name;
    String address;
    Principal principal;
    Classroom[] classrooms;
    int classCount;

    School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new Classroom[10];
        this.classCount = 0;
    }

    void addClassroom(Classroom c) {
        if (classCount < 10) {
            classrooms[classCount++] = c;
        } else {
            System.out.println("School cannot have more than 10 classes.");
        }
    }

    @Override
    public String toString() {
        String result = "School: " + name + ", Address: " + address + "\nPrincipal: " + principal.toString() + "\nClasses:\n";
        for (int i = 0; i < classCount; i++) {
            result += classrooms[i].toString() + "\n";
        }
        return result;
    }
}
