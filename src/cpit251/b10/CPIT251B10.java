
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
        Scanner inputInt = new Scanner(System.in); 
        Scanner inputStr = new Scanner(System.in); 

        UserInfo A = new UserInfo();
        
        Employee [] employee = new Employee [4];
        ourEmp(employee);
        
        double calories = 0;
        Calories UserCalories = new Calories() ;
        
        
       int userAnswer;
       do{                     
       System.out.println("<<Welcome to Teach Fit application>>");
       System.out.println("Please answer the following questions to help us provide you with better services");
       System.out.println("If you are enter Click 1, If you are not enter Click 2");
       userAnswer = inputStr.nextInt();
       }
       while(userAnswer != 1 || userAnswer != 2);
       
            
        if (userAnswer ==1) {
  
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
                System.out.println("Express your activity from 0 to 3");
                int Active = inputInt.nextInt();
                 
            A = new UserInfo(name , Age , Gender , Weight , Height , Active);
            System.out.println("");
   
            UserCalories = new Calories (name, Age, Gender, Height, Weight, Active, calories);
            System.out.printf("Your daily calorie needs are: %.0f calories", UserCalories.calCalories());
            
            if (userAnswer == 2)
                {
                System.out.println("Witing for you next time(:");
                        }
    }
    }
    public static void ourEmp ( Employee [] employee){
        employee[0] = new Employee(1,"Ahmed Al-Ghamdi","Nutrition Specialist", 3.5, 599, "Nutritionist Specialized in Pediatric Dietian and Nutrition, Adult Internal Medicine","Male");
        employee [1] = new Employee(2,"Sarah Osama","Nutrition Specialist", 4.3, 650, "Nutritionist Specialized in Pediatric Dietian and Nutrition, Adult Dietitain","Fmale");
        employee[2] = new Employee(3,"Hala saad ","Coach", 5.0, 200, "Specialized in gain weight","Male");
        employee [3] = new Employee(4,"Maryam Gamil","Coach", 4.5, 399, "Specialized in loss weight","Fmale");
          
    }
    }
