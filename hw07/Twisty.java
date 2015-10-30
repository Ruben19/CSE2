/* Ruben Castro Espinoza 
   CSE2
   10-14-15
   This program will create a pattern of hashtags and dashes the length and width of 
   the pattern will be determined by the users input.*/
   
 import java.util.Scanner;
 public class Twisty{
     public static void main(String[]args);
     Scanner myScanner= new Scanner(System.in);
     int mylenght=0;
    System.out.print("Enter desired length");
     // int myInteger= myScanner.nextInt();
     
     boolean acceptable= false;
     
     while(!acceptable) {
         if (input.hasnextInt() ) {
            mylenght= input.nextInt();
            acceptable= true;
        }
        else{
            System.out.println("   ERROR: need a integer");
            System.out.print("Input your Int: ");
            input.next();
        }

     }
     
 }