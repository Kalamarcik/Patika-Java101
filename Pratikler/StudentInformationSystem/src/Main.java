
public class Main {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Semra Hoca", "05222", "TRH");
        Teacher t2 = new Teacher("Mahmut hoca", "00500", "FZK");
        Teacher t3 = new Teacher("Kulyutmaz Necmi", "11113", "BIO");

        Course history = new Course("History", "101", "TRH", 0.2, 0.8);
        Course physics = new Course("Physics", "102", "FZK", 0.3, 0.7);
        Course biology = new Course("Biology", "101", "BIO", 0.1, 0.9);


        history.addTeacher(t1);
        physics.addTeacher(t2);
        biology.addTeacher(t3);

        Student s1 = new Student("İnek Saban", "123", "4", history, physics, biology);
        s1.addBulkExamGrade(100, 78, 50);
        s1.addBulkOralGrade(50, 30w, 100);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "444", "4", history, physics, biology);
        s2.addBulkExamGrade(50, 30, 70);
        s2.addBulkOralGrade(60, 70, 80);
        s2.isPass();
    }
}