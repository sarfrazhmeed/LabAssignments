class Teacher extends Person {
    String subject;
    int teacherID;

    Teacher(String name, int age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    boolean equals(Teacher t) {
        return this.teacherID == t.teacherID;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + ", Subject: " + subject + ", ID: " + teacherID;
    }
}
