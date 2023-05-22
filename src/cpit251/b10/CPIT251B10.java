
package cpit251.b10;
 
import java.util.*;
public class CPIT251B10 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello again 251>>");
        //System.out.println("Hi, raghad is back");
        //System.out.println("welcome");
        //System.out.println("We can do it, Fighting!");
        //System.out.println("Hello, This is Rama!");
        //System.out.println("HIIIII");
        Scanner input = new Scanner(System.in); 
        
        UserInfo A = new UserInfo();
        Employee employee = new Employee();
        ArrayList<Employee> employeeList = new ArrayList<> ();
        Calories calories = null;
        Calories UserCalories = new Calories() ;
        employee = new Employee("Ahmed Al-Ghamdi","Nutrition Specialist", 3.5, 599, "Nutritionist Specialized in Pediatric Dietian and Nutrition, Adult Internal Medicine","Male");
        employeeList.add(employee);
        employee = new Employee("Sarah Osama","Nutrition Specialist", 4.3, 650, "Nutritionist Specialized in Pediatric Dietian and Nutrition, Adult Dietitain","Fmale");
        employeeList.add(employee);
        employee = new Employee("Maryam Azhari","Nutrition Specialist", 5 , 300, "Nutritionist Specialized in  Adult Dietitian and Nutrition , Pediatric Dietian ","Fmale");
        employeeList.add(employee);
        int userAnswer;
        do{                     
       System.out.println("<<Welcome to Teach Fit application>>");
       System.out.println("Please answer the following questions to help us provide you with better services");
       System.out.println("If you are enter Click 1, If you are not enter Click 2");
       userAnswer = input.nextInt();
       }
        while(userAnswer != 1 || userAnswer != 2);
            
        if (userAnswer ==1) {
  
                System.out.println("What is your name?");
                String name = input.nextLine();        
                System.out.println("How old are you?");
                int Age = input.nextInt();           
                System.out.println("Your gender?");
                String Gender = input.nextLine();         
                System.out.println("How much do you weigh?");
                int Weight = input.nextInt();               
                System.out.println("How much your height?");
                double Height = input.nextInt();
                System.out.println("Express your activity from 0 to 3");
                int Active = input.nextInt();
                 
            A = new UserInfo(name , Age , Gender , Weight , Height , Active);
            System.out.println("");
            
            
            UserCalories = new Calories (name, Age, Gender, Height, Weight, Active, calories);
            System.out.printf("Your daily calorie needs are: %.0f calories", UserCalories.calories);
            
            if (userAnswer == 2)
                {
                System.out.println("Witing for you next time(:");
                        }
    }
    }
    }
