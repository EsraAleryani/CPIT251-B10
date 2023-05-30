/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251.b10;

import java.util.Scanner;

/**
 *
 * @author aPpLe
 */
public class Payment {

    boolean hasMembership = false;
    String coachName;
    String neutritionName;
    String membershipType;
    int totalPrice;

    
    Scanner input = new Scanner(System.in);

    public Payment(String coachName, String neutritionName, String membershipType, int totalPrice) {
        this.coachName = coachName;
        this.neutritionName = neutritionName;
        this.membershipType = membershipType;
        this.totalPrice = totalPrice;
    }
    // If The user picked the Coach
    void Coach() {
        System.out.println("Please Select your Coach : ");

        System.out.print("\n 1] Hala saad with Price of 50 Riyals \n 2] Maryam Gamil with Price of 150  Riyals  \n 3] Zainab Alsaqqaf with Price of 250 Riyals \n Selection: ");
        int coachNum = input.nextInt();
        if (coachNum == 1) {
            this.totalPrice += 50;
            this.coachName = "Hala saad";
        } else if (coachNum == 2) {
            this.totalPrice += 150;
            this.coachName = "Maryam Gamil";
        } else {
            this.totalPrice += 250;
            this.coachName = "Zainab Alsaqqaf";
        }
        System.out.println("you have succefully subscriped to coach Name " + coachName + " and the total price is: " + totalPrice);
    }
    // If The user picked the Neutrition 
    void Neutrition() {
        System.out.println("Please Select your Neutrition : ");

        System.out.print("\n 1] Ahmed Al-Ghamdi with Price of 40 Riyals \n 2] Sarah Osama with Price of 170 Riyals \n 3] Rama Hamid with Price of 250 Riyals \n Selection: ");
        int neutritionNum = input.nextInt();
        if (neutritionNum == 1) {
            this.neutritionName = "Ahmed Al-Ghamdi";
            this.totalPrice += 40;
        } else if (neutritionNum == 2) {
            this.totalPrice += 170;
            this.neutritionName = "Sarah Osama";
        } else {
            this.totalPrice += 250;
            this.neutritionName = "Rama Hamid";

        }
        System.out.println("you have succefully subscriped to neutrition Name " + neutritionName + " and the total price is: " + totalPrice);

    }
 // If The user picked the Membership
    void Mmembership() {
        System.out.println("Do you want a membership subscription Type ( Yes / No )?");
        String membershipReply = input.next();
        if (membershipReply.equalsIgnoreCase("yes")) {
            this.hasMembership = true;
            System.out.print("Please Selecrt your membership bundle: \n 1] 3 Months with Price of 300 Riyals \n 2] 6 Months with Price of 400 Riyals \n 3] 12 Months with Price of 1050 Riyals \n Selection: ");
            int membershipBundle = input.nextInt();
            if (membershipBundle == 1) {
                this.totalPrice += 300;
                this.membershipType = "3 Months";
            } else if (membershipBundle == 2) {
                this.totalPrice += 400;
                this.membershipType = "6 Months";
            } else {
                this.totalPrice += 1050;
                this.membershipType = "12 Months";
            }
            System.out.println("you have succefully subscriped to membership number " + membershipBundle + " and the total price is: " + totalPrice);
        } else {
            System.out.println("you have not subscriped to a membership and the total price is: " + totalPrice);

        }

    }
    //Show invocie info
    void displayPayment() {
        System.out.println("Your Invoce Information is : ");
        System.out.println("---------------------------- ");
        System.out.println("Coach Name: " + coachName);
        System.out.println("Neutrition Name: " + neutritionName);
        System.out.println("Membership Bundle : " + membershipType);
        System.out.println("---------------------------- ");
        System.out.println("Total Price: " + totalPrice + " Riyals");
    }

}
