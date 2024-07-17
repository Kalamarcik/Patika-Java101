public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamGrade(int examGrade1, int examGrade2, int examGrade3) {
        if (examGrade1 >= 0 && examGrade1 <= 100) {
            this.c1.examGrade = examGrade1;
        }
        if (examGrade2 >= 0 && examGrade2 <= 100) {
            this.c2.examGrade = examGrade2;
        }

        if (examGrade1 >= 0 && examGrade1 <= 100) {
            this.c3.examGrade = examGrade3;
        }

    }

    void addBulkOralGrade(int oralGrade1, int oralGrade2, int oralGrade3) {
        if (oralGrade1 >= 0 && oralGrade1 <= 100) {
            this.c1.oralGrade = oralGrade1;
        }
        if (oralGrade2 >= 0 && oralGrade2 <= 100) {
            this.c2.oralGrade = oralGrade2;
        }

        if (oralGrade1 >= 0 && oralGrade1 <= 100) {
            this.c3.oralGrade = oralGrade3;
        }

    }


    void isPass() {
        System.out.println("========================");
        this.avarage = ((this.c1.examGrade * this.c1.examRate + this.c1.oralGrade * this.c1.oralRate) +
                (this.c2.examGrade * this.c2.examRate + this.c2.oralGrade * this.c2.oralRate) +
                (this.c3.examGrade * this.c3.examRate + this.c3.oralGrade * this.c3.oralRate)) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("You have successfully passed the class!");
            this.isPass = true;
        } else {
            System.out.println("You have failed the class.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(this.c1.name + " grade is:" + c1.examGrade);
        System.out.println(this.c2.name + " grade is:" + c2.examGrade);
        System.out.println(this.c3.name + " grade is:" + c3.examGrade);
        System.out.println("Your average is :" + this.avarage);

    }

}
