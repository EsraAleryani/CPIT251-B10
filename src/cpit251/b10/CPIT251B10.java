
package cpit251.b10;
 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class CPIT251B10 {
static Scanner inputInt = new Scanner(System.in); 
static  Calories UserCalories;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //System.out.println("Hello again 251>>");
        //System.out.println("Hi, raghad is back");
        //System.out.println("welcome");
        //System.out.println("We can do it, Fighting!");
        //System.out.println("Hello, This is Rama!");
        //System.out.println("HIIIII");
        
        Scanner inputStr = new Scanner(System.in); 

        UserInfo A = new UserInfo();
        
        Employee [] employee = new Employee [4];
       ourEmp(employee);
        
        double calories = 0;
         UserCalories = new Calories() ;
        
        
       int userAnswer;
       
     //  do{                     
       System.out.println("<<Welcome to Teach Fit application>>");
       System.out.println("Please answer the following questions to help us provide you with better services");
       System.out.println("If you are enter Click 1, If you are not enter Click 2");
       userAnswer = inputStr.nextInt();
   //    }
      // while(userAnswer != 1 || userAnswer != 2);
       
          
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
            double c = UserCalories.calCalories();
            
      EmpMenu( employee );
            plan(employee,c);
            if (userAnswer == 2)
                {
                System.out.println("Witing for you next time(:");
                        }
    }
    }
    public static void ourEmp ( Employee [] employee){
        employee[0] = new Employee(1,"Ahmed Al-Ghamdi","Nutrition Specialist", 3.5, 599, " Specialized in Adult Internal Medicine","Male");
        employee [1] = new Employee(2,"Sarah Osama","Nutrition Specialist", 4.3, 650, " Specialized in Adult Dietitain","Female");
        employee[2] = new Employee(3,"Hala saad ","Coach", 5.0, 200, "Specialized in gain weight","Male");
        employee [3] = new Employee(4,"Maryam Gamil","Coach", 4.5, 399, "Specialized in loss weight","Female");
          
    }
    public static void EmpMenu(Employee [] employee ) {
        System.out.println("Employ information:  ");                                                                                           
        System.out.println("ID           Name                       Role              Rate     Fees                                    Career             Gender   ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0 ; i < employee.length ; i++){
            System.out.printf("%d %20s %29s %8.1f %10.1f %47s %11s",employee[i].empNum,employee[i].eName,employee[i].role,employee[i].rating,employee[i].fees,employee[i].CareerD,employee[i].gender);
            System.out.println();
        }
        
    }
    
    public static void plan(Employee [] employee , double c) throws FileNotFoundException, IOException{
        System.out.println("Please select the employee you want work with by his id: ");
        int choice= inputInt.nextInt();
        if(choice == 1){
           employee[1].generatePlan(employee[1],c);
        }
        else if(choice == 2){
             employee[2] .generatePlan(employee[2],c);
        }
        else if(choice == 3){
             employee[3] .generatePlan(employee[3],c);
        }
        else{
             employee[4] .generatePlan(employee[4],c);
        }
        
    }
    }
