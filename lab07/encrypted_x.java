/* Ruben Castro Espinoza 
CSE2 This program will creat an x made out of "*"  by taking two input integers provided by the 
the user these integers will be the dimensions of the x.*/
import java.util.Scanner;// allows the user to input a value 
public class encrypted_x { // creates a class 
    public static void main(String[]args){
    Scanner myScanner= new Scanner(System.in); //creates a variable for the inputed value.   
    int input =0;
    boolean acceptable = false;
    System.out.print("Input an integer between 0 and 100  ");
        while( !acceptable ){ // creates a condition that the input must meet for the program to work if input dosent meet condition the 
        if (myScanner.hasNextInt()){// program will ask for a new integer until the condition is met. 
            input = myScanner.nextInt();
            if(input>0&& input<100){
                acceptable = true;
            } 
            else{
                System.out.println("ERROR: need an int less than 100 and greater than zero");
                System.out.print("Input your int: ");
                myScanner.next();
            } 
        }
        else{
            System.out.println("   ERROR: need a int");
            System.out.print("Input your int: ");
            myScanner.next();
        }
        } 
    int x= 1 ;
    for(int i=0 ; i< input; i++){ // this loop controls how many rows are int the output.
        for(int j=0; j<input; j++ ){ // this loop controls what is printed on each row. 
            if(i==j||j==(input-x)){// if statment that allows the gaps in *
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }System.out.println(" "); // very important this creates a new line. without it there would be no square 
            x++;// important for the pattern. 
        }
    }
}
