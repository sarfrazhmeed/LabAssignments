class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    boolean equals(Student s) {
        return this.rollNumber == s.rollNumber;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Roll No: " + rollNumber;
    }
}
