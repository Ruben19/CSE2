// Ruben Castro Espinoza 
//CSE2
/*This program will deal with loops. It will executed 3 diffrent loops in total 
the first loop will generate a number up to 7. */

public class GettingLoopy{
    public static void main(String[]args){
  
 int number=0;
 while (number<8){
     System.out.print( number);
     number++;
 }
 int number2=0;
 while (number2<7){
     System.out.print("7");
     number2++;
 }
 int number3, factor;
 number3=10;
 factor=2;
 while (number3<100){
     if(number3%factor==0){
     System.out.print(number3);
     }
     number3++;
     factor++;
 }
}
}