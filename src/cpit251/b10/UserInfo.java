
package cpit251.b10;

/**
 *
 * @author xesra
 */
public class UserInfo {
 
       private String userName;
    private int userAge;
    private String userGender;
    private int userWeight;
    private int userHeight;
    private int userActive;

    public UserInfo(String userName, int userAge, String userGender, int userWeight, int userHeight, int userActive) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.userActive = userActive;
         System.out.println("hi");
    }

 
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

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    public int getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    public int getUserActive() {
        return userActive;
    }

    public void setUserActive(int userActive) {
        this.userActive = userActive;
    }
    
}
