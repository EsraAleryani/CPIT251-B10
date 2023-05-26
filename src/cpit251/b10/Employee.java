
package cpit251.b10;


public class Employee {
    String eName;
    String role;
    double rating;
    double fees;
    String CareerD;
    String gender;
    int empNum;
    

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
    
    
    
}

