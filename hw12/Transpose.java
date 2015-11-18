//Ruben Castro Espinoza
//CSE2  11,17,2015
/* this program will  create a matrix and then print it out. it will then transpose the matrix and print out the new matrix
....*/
import java.util.Scanner; // allows the user to input values 
public class Transpose{ 
public static void main (String[]args) {
    Scanner myScanner= new Scanner(System.in);// declares the scanner
    System.out.print (" Enter Int for rows and Int for colums");// prompts the user to input a int. 
    int rows = myScanner.nextInt();//creates variable called row and declares it as the first input value.
    int colums=myScanner.nextInt();// creates varaible called colums declares it as the second input value.
    int[][]matrix;// creates 2d array called matrix
    int[][]newarray; // creates 2d array called new array.
    System.out.println(" ");
    randomMatrix( rows, colums);//calls method 
    matrix=randomMatrix(rows,colums);//calls method 
    printMatrix(matrix);//calls method 
    transposeMatrix(matrix);
    newarray=transposeMatrix(matrix);
   System.out.println(matrix.length );
    System.out.println("");
    System.out.println("");
    printMatrix(newarray);
}
    public static int[][] randomMatrix( int rows, int colums){ // method that creates random matrix.
        int[][] matrix= new int[rows][colums];
         for (int i=0; i<rows; i++){// for loop that takes care of the rows in the matrix. 
           for(int j=0; j<colums; j++){// for loop that takes care of the columbs in the matrix 
                int randNumber=(int)(Math.random()*20)-10;// creates a random number.
                matrix[i][j]=randNumber;// sets the slot equal to random number that is generated every time the loops iterates.
            }
        }  
        return matrix; // retuns 2d array 
    }
    public static void  printMatrix( int [][] array ){ //method that prints matrix
        int rows= array.length;
        int colums = array[1].length;
       for(int i=0;i<rows;i++){ // for loop that takes care of the rows 
            for (int j=0;j<colums ;j++){// for loop that takes care of the columbs
             System.out.print(array[i][j]+" "); // prints out the value of each array.
            }System.out.println("");// prints a space.
        }
    }
    public static int [][] transposeMatrix(int[][]array){ // method that is suposse to transpose method but it dosent workd something about out of bounds work for hours to try to fix it 
        int rows= array[1].length;
        int colums= array.length;
        int[][]newarray= new int[colums][rows]; 
        int x=0;
        int y=0;
        for (int i=0; i<rows; i++,x++){
           for(int j=0 ; j<colums;j++,y++){
           newarray[i][j]= array[y][x]; // sets new array equal to old array val.
            }
        
        } return newarray; // retuns new 2d array. 
    }
}
