package cpit251.b10;



public class UserInfo {

    private String userName;
    private int userAge;
    private String userGender;
    private double userWeight;
    private double userHeight;
    private int userActive;

    public UserInfo(String userName, int userAge, String userGender, double userWeight, double userHeight, int userActive) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.userActive = userActive;
        
        
        
        
        
        
    }

    public UserInfo() {
    }

    ;
 
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    
    
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public int getUserActive() {
        return userActive;
    }

    public void setUserActive(int userActive) {
        this.userActive = userActive;
    }

}
