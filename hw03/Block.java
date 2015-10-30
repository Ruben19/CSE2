//Ruben Castro Espinoza
//CSE2 
/* This program will find the volume and surface area of any block as long as the user know the lenght width and height of 
said block*/
import java.util.Scanner;// lets java know that we will be using a scanner.
public class Block{// connects program to file make sure they are the same. 
    public static void main(String[]args){// lets java know that this is the beggining of the string.
        s// lets java know that the scanner is an input by the user.
        System.out.print(" Enter the lenght of the block in the form xx.xx: ");// prints out the words in yellow and allows user to input a value 
        double blockLength= myScanner.nextDouble();// sets apart memory for the users input in this case 64 bits.
        System.out.print(" Enter the width of the block in the form xx.xx: ");// prints out yellow leters and lets user input value.
        double blockWidth= myScanner.nextDouble();// sets apart memory for the users input in this case 64 bits.
        System.out.print(" Enter the height of the block in the form xx.xx: ");//prints out yellow leters and lets user input value
        double blockHeight=myScanner.nextDouble();//sets apart memory for the users input in this case 64 bits.
        double volume;// sets appart 64 bits of memmory for variable called volume.
        double surfaceArea;// sets appart 64 bits of memmorry for variable called Surface area.
        volume= blockLength*blockWidth*blockHeight;// defines varaible called volume as the product of block lenght block width and block height. 
        surfaceArea=2*((blockLength*blockWidth)+(blockHeight*blockLength)+
        (blockHeight*blockWidth));// defines variable called surface area.
        System.out.println(" The Volume of the block of dimesions"+blockLength+
        " x "+blockWidth+" x "+blockHeight+" x "+" is "+ volume);// prints out the words in yellow and the what ever is store under each variable 
        System.out.println(" The Surface Area of the block is "+surfaceArea);//prints out the words in yellow and the what ever is store under each variable 
    } // end of string end of class.
}