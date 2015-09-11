//Ruben Castro Espinoza
//CSE2 
/* This program will */
import java.util.Scanner;
public class Block{
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print(" Enter the lenght of the block in the form xx.xx: ");
        double blockLength= myScanner.nextDouble();
        System.out.print(" Enter the width of the block in the form xx.xx: ");
        double blockWidth= myScanner.nextDouble();
        System.out.print(" Enter the height of the block in the form xx.xx: ");
        double blockHeight=myScanner.nextDouble();
        double volume;
        double surfaceArea;
        volume= blockLength*blockWidth*blockHeight;
        surfaceArea=2*((blockLength*blockWidth)+(blockHeight*blockLength)+
        (blockHeight*blockWidth));
        System.out.println(" The Volume of the block of dimesions"+blockLength+
        " x "+blockWidth+" x "+blockHeight+" x "+" is "+ volume);
        System.out.println(" The Surface Area of the block is "+surfaceArea);
    }
}