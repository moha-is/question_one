/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;


public class Employee {
    String Name;
    String Position;
    double BasicSalary;
    double Experience;
    String EduLevel;
    double Bonus;
    
    double SalaryCalc() {
        double sal = BasicSalary + (BasicSalary * 0.05 * Experience);
        if(this.EduLevel == "Bachelor"){
            sal += 500;
        } else if (this.EduLevel == "diploma"){
            sal += 250;
        }   
        
        return sal + (this.Bonus * BasicSalary);
    }
    
    public static void main(String[] args) {
        // i made this for test
        FullTimeEmployee Emp1 = new FullTimeEmployee("Muhannad", "dev", 10000, 1, "Bachelor", 0.03);
        PartTimeEmployee Emp2 = new PartTimeEmployee("Mazen", "programer", 7000, 5, "diploma", 0.015);
        
        System.out.println("##### Employee 1 #####");
        System.out.println("Name: " + Emp1.Name + "\n" + "Position: " + Emp1.Position +
                "\n" + "Basic Salary: " + Emp1.BasicSalary + "\n" + "Experience: "
                + Emp1.Experience + "\n" + "Educational level: " + Emp1.EduLevel + "\n" + "Bonus: " + Emp1.Bonus);
        System.out.println("Total Salary: " + Emp1.SalaryCalc() + "\n");
        
        
        System.out.println("##### Employee 2 #####");
        System.out.println("Name: " + Emp2.Name + "\n" + "Position: " + Emp2.Position +
                "\n" + "Basic Salary: " + Emp2.BasicSalary + "\n" + "Experience: "
                + Emp2.Experience + "\n" + "Educational level: " + Emp2.EduLevel + "\n" + "Bonus: " + Emp2.Bonus);
        System.out.println("Total Salary: " + Emp2.SalaryCalc());
    }
    
}


class FullTimeEmployee extends Employee {
    FullTimeEmployee(String Name, String Position, double BasicSalary,
            double Experience, String EduLevel, double Bonus) { 
        this.Name = Name;
        this.Position = Position;
        this.BasicSalary = BasicSalary;
        this.Experience = Experience;
        this.EduLevel = EduLevel;
        this.Bonus = Bonus;
    }
} 


class PartTimeEmployee extends Employee {
    PartTimeEmployee(String Name, String Position, double BasicSalary,
            double Experience, String EduLevel, double Bonus) { 
        this.Name = Name;
        this.Position = Position;
        this.BasicSalary = BasicSalary;
        this.Experience = Experience;
        this.EduLevel = EduLevel;
        this.Bonus = Bonus;
    }
} 