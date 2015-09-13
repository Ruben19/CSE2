//Ruben Castro Espinoza 
//CSE2
/* This program will tell the user how much time he has left before his dinner date */
import java.util.Scanner; // lets java know that the user will input the values. 
public class Timer{ // have to have a class that matches with the file name. 
    public static void main(String[]args){// lets java know that the commands are about to begin.
        Scanner myScanner= new Scanner(System.in);// defines what my scanner is and what it will do.
        System.out.print(" Enter current time here in the form xx.xx: ");// prints the yellow words and allows user to input.
        int currentTime= myScanner.nextInt();//dedicates memory space for the user's input. 
        System.out.print(" Enter the time you will be eating dinner in the form xx.xx ");// prints the yellow words and lets user input
        int dinnerTime= myScanner.nextInt();// dedicates memory space for the user's input.
        int timeuntilDinner= dinnerTime-currentTime; // defines that time until dinner is desired dinner time minus current time. 
        int hours= timeuntilDinner/100;// defines that hours until dinner is time until dinner divided by 100.
        int minutes= timeuntilDinner%100;// defines that minute until dinner is the remainder of time until dinner divided by 100
        System.out.println (" you have " + hours +" hours and " + minutes +" minutes. ");// prints the yellow words and the values for hours and minutes. 
    }// end of string 
}//end of class 