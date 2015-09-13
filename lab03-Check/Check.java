// Ruben Castro Espinoza 
//CSE 2
/* This program will calculate the exact dollar amount each member of a party 
has to pay if they want to split the ckeck evenly. */ 

import java.util.*;// lets java know that the user will be inputing quantities into the program.
public class Check{ // We always have to state a class 
    public static void main ( String[]args) {
        Scanner myScanner= new Scanner(System.in);// this part is necessary because it allows the user to input any number.
            System.out.print (" Enter the original cost of the check in the form xx.xx: ");
            // the line above outputs displays the yello leters to the user the user will the input the total cost of the check. 
            double checkCost=myScanner.nextDouble(); /* this line of code creats a double "box" where the total cost of check inputed 
            by the user will go*/ 
            System.out.print(" Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
            // the line of code above displays the yellow words to the user and allows the user to input a desired percentage. 
            double tipPercent=myScanner.nextDouble(); /*This line of code creates a "box" where the input percentage will be stored*/
            tipPercent/=100;// the inputed desired tax percentage is a whole number we want a percentage so we devide it by ten. 
            System.out.print(" Enter the number of people that went out to dinner: ");
            /* The line of code above displays the words in yellow to the user and allows the user to input the number of 
            people that went to dinner*/ 
            int numPeople=myScanner.nextInt();/* this line of code creates a box of the integer class where the inputed number 
            of people will be stored.*/
            double totalCost; //this line creates a box of the double class and will eventually store the total cost inputed by user.
            double costperPerson;// this line creates a box of the double class and will store the exact cost each person must pay.
            int dollars,dimes,pennies;// creates 3 boxes of the integer class. 
            totalCost= checkCost*(1+tipPercent);// this code defines what will be stored within the box called total cost.
            costperPerson= totalCost / numPeople;//  this code defines what will be stored within the box called cost per person. 
            dollars=(int) costperPerson; // this code defines what will be stored in the box called dollars and explicitly casts 
            //whatever it is into an int.   
            dimes=(int)(costperPerson*10)%10;// this code defines what will be stored in the box called dimes.
            pennies=(int)(costperPerson*100)%10;// this code defines what will be stored in the box called pennies.
            System.out.println(" Each person in the group owes $ "+dollars+
            '.'+ dimes + pennies);
            /* the code from lines 32- 33 displays the words in yellow to the user and it also displays what was in the 
            boxes called dollars dimes and pennies to the user which is in the grand scheme of things the total that each 
            member of the dinner party has to pay.*/
        
    } // end of string    
}// end of class.