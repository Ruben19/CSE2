// Ruben Castro Espinoza 
// CSE 2 
/* This program will prompt the user for 15 integers in ascending order between 0 and 100. 
This program will print 3 diffrent error messages one for a input that isnt an int another for an input that 
is out of bounds and another for an input that is not greater than the previous input. 
 The program will then print the 15 integers in order and prompt the user to input another integer that will be searched for 
 within the 15 integers. Then the program will scramble the integers and  print the scrambled list. Finally it will ask the 
 again for another int and then it will check if that int is within the list.*/
 import java.util.Scanner; // allows the user to input a value. 
 public class CSE2Linear{
    public static void main(String[]args){
        Scanner Input= new java.util.Scanner(System.in); // Sets scanner variable as Input.
        int[]grades1=new int[15];// creates an array with 15 spaces called grades1 
        System.out.print("Enter " + 15 +" integers in asceding order: "); 
        for (int i=0; i< 15; i++){ // for loop that fill in the slots of the array. 
            int x =Input.nextInt();
            //if(!Input.hasNextInt()){ 
               // System.out.println(" Not an Integer ");
                //return;
            //}
            if(x<=100){ // if statments that only accepts input values for 0 to 100 
                grades1[i]= x;
            }
            if(x<0|| x>100){ // if stamtent that print out the line bellow when input is less than zerop or greater than 100.
                System.out.println("Int not within range"); 
                return;
            }
        }
        System.out.println(" ");
         PrintArray(grades1);// calls method print array. 
        System.out.println(" ");
        System.out.print ("Enter a number to search for "); 
        int y =Input.nextInt(); // variable that stores input value.
        bianarysearchArray(y, grades1);// call method linearSearch.
       // System.out.println(grades1[return]);
        ShuffleArray( grades1 );// calls method ShuffleArray
        System.out.println(" ");
        PrintArray(grades1);// calls method printArray
        System.out.println(" ");
        System.out.print(" Enter a number to search for ");
        int z= Input.nextInt();// variable that stores input value.
        linearsearchArray( z ,grades1);// calls method linear search.
    }
   public static void ShuffleArray(int[]x){ // shuffle method.
       for(int i=14; i>0; i--){ // for loop that  runns 14 times. 
       int j= (int) (Math.random()*(i+1)); // stores a random number in variable j.
        int temp = x[i]; // temporary variable that stores initial value of array . 
       x[i]=x[j];// sets first slot equal to the random slot.
        x[j]=temp; // sets the random slot equal to the first slot in the array. 
            }
    }        
    public static void PrintArray(int[]x){ // print method.
        for(int i=0; i<15 ;i++){// for statment that runs 15 times.
        System.out.print( x[i]+" "); // prints what ever is stored in the slot of the array.
        }
    } 
   public static void linearsearchArray(int x,int []y){ // method that searches for the input value amongst the stored values in the array. 
        int targetValue=x;// desired value to be found. 
        int j =1; // variable equal to zero only created to make number of iterations accurate. 
        for(int k=0; k <15; k++,j++){
            if ( targetValue==y[k]){ // if statment that only runs if the desired integer is found within a slot in the array. 
                 System.out.println( targetValue + " was found with "+j+" Iterations "); // prints desried values. 
            }
           // else if(targetValue!==y[k]){  I tried to get it to get the program to the the user that the integer wasnt in the list
                //System.out.println("Integer not int the list. " +j+ "iterations");
               // break;
            }
        }
    public static void bianarysearchArray(int x, int []list){
        int targetValue= x;
        int low= 0;
        int high= 14;
        int j=1;
        while (high>=low){
            int mid = (low+high)/2;
            if(targetValue<list[mid]){
                high=mid-1;
            }
            else if(targetValue==list[mid]){
                 System.out.println( targetValue + " found at with " + j + " iterations");
             break;
            }
            else{ 
            low= mid+1;
            }
            if (low>high){
                System.out.println( targetValue+" is not present in the list.\n");
            }
            j++;
        }
        
    }
 } 
        
      
  
  
  