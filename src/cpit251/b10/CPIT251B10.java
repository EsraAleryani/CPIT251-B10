
package cpit251.b10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class CPIT251B10 {

    static Scanner inputInt = new Scanner(System.in);
    static Calories UserCalories;
    static Employee[] employee = new Employee[4];

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //System.out.println("Hello again 251>>");
        //System.out.println("Hi, raghad is back");
        //System.out.println("welcome");
        //System.out.println("We can do it, Fighting!");
        //System.out.println("Hello, This is Rama!");
        //System.out.println("HIIIII");

        Scanner inputStr = new Scanner(System.in);
        Employee object = new Employee(employee);
        UserInfo A = new UserInfo();

        
        
        
        
        
        object.ourEmp(employee);
                
        double calories = 0;
        UserCalories = new Calories();

        int userAnswer;

        do {
            System.out.println("<<Welcome to Teach Fit application>>");
            System.out.println("Please answer the following questions to help us provide you with better services");
            System.out.print("If you are enter Click 1 \nIf you are not enter Click 2 \nIf exit click any  other key \nSelection: ");
            userAnswer = inputStr.nextInt();

            if (userAnswer == 1) {
                

                
                System.out.println("What is your name?");
                String name = inputStr.next();
                System.out.println("How old are you?");
                int Age = inputInt.nextInt();
                System.out.println("Your gender Female(F), Male(M)?");
                String Gender = inputStr.next();
                System.out.println("How much do you weigh?");
                double Weight = inputInt.nextInt();
                System.out.println("How much your height?");
                double Height = inputInt.nextDouble();
                System.out.println("Express your activity from 0 to 4");
                int Active = inputInt.nextInt();              

                A = new UserInfo(name, Age, Gender, Weight, Height, Active);
                System.out.println("");

                UserCalories = new Calories(name, Age, Gender, Height, Weight, Active, calories);
                System.out.printf("Your daily calorie needs are: %.0f ", UserCalories.calCalories());
                double c = UserCalories.calCalories();

                EmpMenu(employee);
                plan(employee, c);

                int servicenum = 0;
       
            } else if (userAnswer == 2) {
                System.out.println("Witing for you next time(:");
            }
        } while (userAnswer == 1 || userAnswer == 2);
    }
     
    
   
    

    public static void EmpMenu(Employee[] employee) {
        System.out.println("\n Employ information:  ");
        System.out.println("ID           Name                       Role              Rate     Fees                                    Career             Gender   ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < employee.length; i++) {
            System.out.printf("%d %20s %29s %8.1f %10.1f %47s %11s", employee[i].empNum, employee[i].eName, employee[i].role, employee[i].rating, employee[i].fees, employee[i].CareerD, employee[i].gender);
            System.out.println();
        }

    }

    public static void plan(Employee[] employee, double c) throws FileNotFoundException, IOException {
        System.out.println("Please select the employee you want work with by his id: ");
        int choice = inputInt.nextInt();
        while(true){
        if (choice == 1) {
            employee[0].generatePlan(employee[0], c);
            payment(employee[0].fees , employee[0].eName);
            break;
        } else if (choice == 2) {
            employee[1].generatePlan(employee[1], c);
            payment(employee[1].fees , employee[1].eName);
            break;
        } else if (choice == 3) {
            employee[2].generatePlan(employee[2], c);
            payment(employee[2].fees , employee[2].eName);
            break;
        } else if (choice == 4) {
            employee[3].generatePlan(employee[3], c);
            payment(employee[3].fees , employee[3].eName);
            break;
        }
        else{
            System.out.println("We don't have this choice, please ENTER agian from Existing employee ");
            choice = inputInt.nextInt();
        }

    }
    } public static void payment (double fees, String ename) {
        Payment payment = new Payment (ename , fees);
        payment.displayPayment(ename, fees);
    }
}
   

