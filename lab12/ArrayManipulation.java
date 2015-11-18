// Ruben Castro Espinoza 
//CSE2 
/* This program will will creat a two dimmensional array */
public class ArrayManipulation{
   public static void main(String[]args){
       int x= (int)(Math.random()*10)+10;
        int y= (int)(Math.random()*10)+10;
       //System.out.println(x);
       //System.out.println(y);
       raggedArray(x,y);
      // printArray(z);
    }
   public static int[][] raggedArray(int x, int y){ 
       int[][]z= new int[x][y];
       int x= (int)(Math.random()*10)+10;
       for(int i=0; i< x; i++){
           int y= (int)(Math.random()*10)+10;
           for(int j=0;j<y; j++){
              z[i][j]=(int)(Math.random()*2000)-1000;
              
           }
           
       }
      
       return z;
   }
   public static int[] printArray(int[][]x){
       for(int i=0;i<.x[x.lenght-1.].length; i++){
           
       }
   }
   /*public static printArray(int[]){
       
   } 
   public static int[] findSmallest(){
       
   }
   public static int[] findLargest(){
       
   }
   public static int[] findEven(){
       
   }
*/}


