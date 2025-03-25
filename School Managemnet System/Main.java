public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Dr.Ismail Shahid", 50, 25);
        School school = new School("Grammar High School", "Defence phase-8", principal);

        Teacher teacher1 = new Teacher("Proff Shahid Bhatti", 40, "Computer Science", 191);
        Teacher teacher2 = new Teacher("Dr. Rimsha", 35, "Professional Practises", 168 );

        Classroom class1 = new Classroom("Class 6", "C6", teacher1);
        Classroom class2 = new Classroom("Grade 10", "C10", teacher2);

        Student student1 = new Student("Sarfraz ", 16, 111);
        Student student2 = new Student("Saad", 15, 121);
        Student student3 = new Student("Sian", 16, 131);

        class1.addStudent(student1);
        class1.addStudent(student2);
        class2.addStudent(student3);

        school.addClassroom(class1);
        school.addClassroom(class2);

        System.out.println(school.toString());
    }
}
