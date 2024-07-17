public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examGrade;
    int oralGrade;

    double oralRate;
    double examRate;

    Course(String name, String code, String prefix, double oralRate, double examRate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examGrade = 0;
        this.oralGrade = 0;
        this.oralRate = oralRate;
        this.examRate = examRate;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("The teacher and the course sections do not match.");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }

}
