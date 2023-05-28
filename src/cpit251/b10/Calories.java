/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251.b10;


public class Calories {
    
    String Name;
    int age;
    String gender;
    double height;
    double Weight;
    int active;
    double calories;
    double bmr;

    
    public Calories(String Name, int age, String gender, double height, double Weight, int active, double calories) {
        this.Name = Name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.Weight = Weight;
        this.active = active;
        this.calories = calories;
    }
    
    public Calories() {
        
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public double calCalories(){

        if (gender.equals("M")) { // if male

            bmr = 88.4 + (13.4 * Weight) + (4.8 * this.height) - (5.68 * age);

        } else { // if female

            bmr = 447.6 + (9.25 * Weight) + (3.10 * height) - (4.33 * age);

        }

        // calculate calorie based on activity
        switch (this.active) {
            case 0:
                calories = bmr * 1.2;
                break;
            case 1:
                calories = bmr * 1.375;
                break;
            case 2:
                calories = bmr * 1.55;
                break;
            case 3:
                calories = bmr * 1.725;
                break;
            case 4:
                calories = bmr * 1.9;
                break;
        }

        return calories;
    }

}
