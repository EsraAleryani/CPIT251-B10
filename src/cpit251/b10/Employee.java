
package cpit251.b10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    String eName;
    String role;
    double rating;
    double fees;
    String CareerD;
    String gender;
    int empNum;
    Employee [] array;
    static  Calories UserCalories;

    public Employee(int empNum, String eName, String role, double rating, double fees, String CareerD, String gender) {
        this.eName = eName;
        this.role = role;
        this.rating = rating;
        this.fees = fees;
        this.CareerD = CareerD;
        this.gender = gender;
        this.empNum = empNum;
    }

    public Employee() {
    }

    public Employee(Employee[] array) {
        this.array = array;
    }

    public Employee[] getArray() {
        return array;
    }

    public void setArray(Employee[] array) {
        this.array = array;
    }
    
    
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    
    
    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getCareerD() {
        return CareerD;
    }

    public void setCareerD(String CareerD) {
        this.CareerD = CareerD;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    public void generatePlan(Employee  employee,double UserCalories) throws FileNotFoundException, IOException{
        System.out.println("You select " + eName);
        System.out.println("This is your plan:");

      
        if(UserCalories >= 3000){
           
           File file = new File("loss.txt");
             Scanner in = new Scanner(file); 
            while(in.hasNextLine()){
                  System.out.println(in.nextLine());
              }
              in.close();
        }
        else if((UserCalories > 1500) && (UserCalories<3000)){
             File file = new File("maintain.txt");
              Scanner in = new Scanner(file);  
                while(in.hasNextLine()){
                  System.out.println(in.nextLine());
              }
                in.close();
        
    }
        else{
             File file = new File("gain.txt");
              Scanner in = new Scanner(file);
                while(in.hasNextLine()){
                  System.out.println(in.nextLine());
              }
                in.close();
        }
        
       
        
    }
     public void ourEmp(Employee[] employee) {
        employee[0] = new Employee(1, "Ahmed Al-Ghamdi", "Nutrition Specialist", 3.5, 599, " Specialized in Adult Internal Medicine", "Male");
        employee[1] = new Employee(2, "Sarah Osama", "Nutrition Specialist", 4.3, 650, " Specialized in Adult Dietitain", "Female");
        employee[2] = new Employee(3, "Hala saad ", "Coach", 5.0, 200, "Specialized in gain weight", "Male");
        employee[3] = new Employee(4, "Maryam Gamil", "Coach", 4.5, 399, "Specialized in loss weight", "Female");

    }
    
    
    
}

