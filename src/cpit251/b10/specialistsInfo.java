/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251.b10;

/**
 *
 * @author xesra
 */
public class specialistsInfo {
     private String name;
    private String gender;
    private int Age;
    private int price;
    private String specialization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public specialistsInfo(String name, String gender, int Age, int price, String specialization) {
        this.name = name;
        this.gender = gender;
        this.Age = Age;
        this.price = price;
        this.specialization = specialization;
    }

}
