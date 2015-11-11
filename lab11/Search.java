// Ruben Castro Espinoza 
// CSE 2 
/* this program will use linear and bianary search to find an integer that the user inputs if it exists.
*/
import java.util.Scanner;
public class Search {
    public static void main(String[]args) { 
        Scanner myScanner= new Scanner(System.in);
        int[]array1= new int[5000];
        int[]array2= new int[5000];
        for (int i=0; i<4999; i++){
        int rand = (int)(Math.random()*100000);
        array1[i]= rand;
        }
        for(int z=0; z<4999;z++){
        int rand2=(int)( Math.random()*100000);
        array2[z]=rand2;    
        }
        int max = array1[0];
        for (int j=1; j< 4999; j++){
            if(array1[j]>max){
            max= array1[j];
            } 
        }System.out.println("The max value of array1 is "+ max);
        int min= array1[0];
        for(int k=1; k<4999;k++){
            if(array1[k]<min){
            min=array1[k];
            }
        }System.out.println("The minimum value of array1 is "+ min);
        //int counter= myScanner.nextInt();
        //for(int j=1; j<array1.lenght; j++){
           // if ( Input.nextInt()==array1[j]){
                 System.out .println(" Test result "+ Input.nextInt()" was found");
                 System.out.Println( " Number of Iterations: " +)
            //} 
          // else
            //System.out.println("integer doesent exist within the Array");
        
    }
  }
