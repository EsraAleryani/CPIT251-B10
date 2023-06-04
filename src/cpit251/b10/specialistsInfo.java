package cpit251.b10;


public class specialistsInfo {
    
    private String name;
    private String gender;
    private int Age;
    private int price;
    private String specialization;
      public specialistsInfo(String name, String gender, int Age, int price, String specialization) {
        this.name = name;
        this.gender = gender;
        this.Age = Age;
        this.price = price;
        this.specialization = specialization;
    }

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

  
    

}
