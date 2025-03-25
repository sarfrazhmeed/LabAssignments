class Classroom {
    String className;
    String classCode;
    Teacher teacher;
    Student[] students;
    int studentCount;

    Classroom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5];
        this.studentCount = 0;
    }

    void addStudent(Student s) {
        if (studentCount < 5) {
            students[studentCount++] = s;
        } else {
            System.out.println("Class is full. Cannot add more students.");
        }
    }

    @Override
    public String toString() {
        String result = "Class: " + className + " (" + classCode + "), Teacher: " + teacher.name + "\nStudents:\n";
        for (int i = 0; i < studentCount; i++) {
            result += students[i].toString() + "\n";
        }
        return result;
    }
}
