
package cpit251.b10;
import java.util.Scanner; 
public class CPIT251B10 {

    /**
     * @param args the command line arguments
     */
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
                A.setUserName(name);
                System.out.println("How old are you?");
                int Age = input.nextInt();
                A.setUserAge(Age);
                System.out.println("Your gender?");
                String Gender = input.nextLine();
                A.setUserGender(Gender);
                System.out.println("How much do you weigh?");
                int Weight = input.nextInt();
                A.setUserWeight(Weight);
                System.out.println("How much your height?");
                int Height = input.nextInt();
                A.setUserHeight(Height);
                System.out.println("Express your activity from 0 to 3");
                int Active = input.nextInt();
                A.setUserActive(Active);
                System.out.println("");
            
            if (userAnswer == 2)
                {
                System.out.println("Witing for you next time(:");
                        }
    }
    }
    }
