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
    String EName;
    double fees;
    String membershipType;
    double totalPrice;

    
    Scanner input = new Scanner(System.in);

    public Payment(String EName, double fees) {
        this.EName = EName;
        this.fees = fees;
        
        
    }
   
 // If The user picked the Membership
    void displayPayment(String EName , double fees) {
        System.out.println("Do you want a membership subscription Type ( Yes / No )?");
        String membershipReply = input.next();
        if (membershipReply.equalsIgnoreCase("yes")) {
            this.hasMembership = true;
            System.out.print("Please Selecrt your membership bundle: \n 1] 3 Months with Price of 300 Riyals \n 2] 6 Months with Price of 400 Riyals \n 3] 12 Months with Price of 1050 Riyals \n Selection: ");
            int membershipBundle = input.nextInt();
            if (membershipBundle == 1) {
                this.totalPrice = fees +300;
                this.membershipType = "3 Months";
            } else if (membershipBundle == 2) {
                this.totalPrice = fees + 400;
                this.membershipType = "6 Months";
            } else {
                this.totalPrice = fees + 1050;
                this.membershipType = "12 Months";
            }
            System.out.println("you have succefully subscriped to membership number " + membershipBundle );
        } else {
            
            System.out.println("you have not subscriped to a membership and the total price is: " + totalPrice);

        }
        System.out.println("Your Invoce Information is : ");
        System.out.println("---------------------------- ");
        System.out.println("Coach Name: " + EName);
        System.out.println("Membership Bundle : " + membershipType);
        System.out.println("---------------------------- ");
        System.out.println("Total Price: " + totalPrice + " Riyals");
        System.exit(0);

    }
    
    

}
