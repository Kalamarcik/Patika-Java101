
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if(this.salary>1000){
            double tax=this.salary*0.03;
            return tax;
        }
        return 0;
    }

    int bonus(){
        if(this.workHours>40){
            int bonus=(this.workHours-40)*30;
            return bonus;
        }
        return 0;
    }


    double raiseSalary(){
        int currentYear=2021;
        int yearsOfService=currentYear-this.hireYear;
        double raise;
        if (yearsOfService < 10) {
            raise = this.salary * 0.05;
        } else if (yearsOfService < 20) {
            raise = this.salary * 0.1;
        } else {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    public String toString(){
        double totalSalary=this.salary-tax()+bonus();
        double netSalary=this.salary-tax()+bonus()+raiseSalary();


        String result =
                "\n Name: " + name +
                "\n Salary: " + salary +
                "\n Work hours: " + workHours +
                "\n Hire year: " + hireYear +
                "\n Tax: " + tax() +
                "\n Bonus: " + bonus() +
                "\n Salary raise: " + raiseSalary() +
                "\n Salary with tax and bonuses: " + totalSalary +
                "\n Total salary: " + netSalary;

        System.out.println(result);
        return result;

    }
}
