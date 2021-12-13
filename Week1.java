

import java.util.Scanner;

class Employee{
    String name;
    int id;
    int noOfHours;
    int salary;


    public void getInfo(String n, int i, int s, int h){
        name = n;
        salary = s;
        id = i;
        noOfHours = h;
    }

    public void AddSal(){
        if(salary < 500){
            salary += 10;
        }
    }

    public void AddWork(){
        if(noOfHours > 6 ){
            salary += 5;
        }
    }



}

public class Week1 {


    public static void main(String[] args) {
        String name;
        int id;
    	int noOfHours;
    	int salary;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Employees : ");

        int n = sc.nextInt();

        Employee[] employee = new Employee[n];

        for(int i = 0; i< n; i++){
            System.out.println("Enter the name of Employee " + (i+1));
            name = sc.next();

            System.out.println("Enter the id of Employee " + (i+1) );
            id = sc.nextInt();

            System.out.println("Enter the no of hours of Employee " + (i+1)  );
            noOfHours = sc.nextInt();

            System.out.println("Enter the salary of the Employee " + (i+1)  );
            salary = sc.nextInt();

            employee[i] = new Employee();
            employee[i].getInfo(name,id,salary,noOfHours);
            employee[i].AddSal();
            employee[i].AddWork();
        }

 
        for(int i = 0; i< n; i++){
        System.out.println("Final Salary of employee" + (i+1) + "= " + employee[i].salary);
        }


    }
}
