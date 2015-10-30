//Ruben Castro Espinoza 
//CSE2
// 10/4/15
/* this program will accept 7 values from the user each representing one day of the week
it will then represent the values inputed in a horizontal bar graph. This program will 
also calculate the average of the input values by plus and minus 20% and multiply that 
value by 52 and then by four giving the user his or her average, plus or minus 20%, 
of the total cost of 4 years of expenses in college.*/

import java.util.Scanner; 
public class BarGraph{
    public static void main (String[]args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Mon Expenses");
        double mondayExpenses=myScanner.nextDouble();
        System.out.println("Tue Expenses ");
        double tuesdayExpenses=myScanner.nextDouble();
        System.out.println("Wed Expenses ");
        double wednesdayExpenses=myScanner.nextDouble();
        System.out.println("Thur Expenses ");
        double thursdayExpenses=myScanner.nextDouble();
        System.out.println("Fri Expenses");
        double fridaysExpenses=myScanner.nextDouble();
        System.out.println("Sat Expenses ");
        double saturdayExpenses=myScanner.nextDouble();
        System.out.println("Sun Expenses");
        double sundayExpenses=myScanner.nextDouble();
        double averageweeklyExpenses;
            if (mondayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (mondayExpenses-(int)mondayExpenses>=0.5){
               System.out.print("MON:");
                ++mondayExpenses;
            do{ 
       System.out.print("*");
       mondayExpenses--;
       }while(mondayExpenses-1>=0);
            }
        else if(mondayExpenses-(int)mondayExpenses<0.5){
            System.out.print("MON:");
            do{ 
       System.out.print("*");
       mondayExpenses--;
       }while(mondayExpenses-1>=0);
        }
       if (tuesdayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (tuesdayExpenses-(int)mondayExpenses>=0.5){
               System.out.print("\n"+"TUE:");
                ++tuesdayExpenses;
               do{ 
       System.out.print("*");
       tuesdayExpenses--;
       }while(tuesdayExpenses-1>=0);
            }
        else if(tuesdayExpenses-(int)tuesdayExpenses<0.5){
            System.out.print("\n"+"TUE:");
            do{ 
       System.out.print("*");
       tuesdayExpenses--;
       }while(tuesdayExpenses-1>=0);
        }
        
        if (wednesdayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (wednesdayExpenses-(int)wednesdayExpenses>=0.5){
               System.out.print("\n"+"WED:");
                ++wednesdayExpenses;
               do{ 
       System.out.print("*");
       wednesdayExpenses--;
       }while(wednesdayExpenses-1>=0);
            }
        else if(wednesdayExpenses-(int)wednesdayExpenses<0.5){
            System.out.print("\n"+"WED:");
            do{ 
       System.out.print("*");
       wednesdayExpenses--;
       }while(wednesdayExpenses-1>=0);
        }
       
        if (thursdayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (thursdayExpenses-(int)thursdayExpenses>=0.5){
               System.out.print("\n"+"THUR:");
                ++thursdayExpenses;
               do{ 
       System.out.print("*");
       thursdayExpenses--;
       }while(thursdayExpenses-1>=0);
            }
        else if(thursdayExpenses-(int)thursdayExpenses<0.5){
            System.out.print("\n"+"THUR:");
            do{ 
       System.out.print("*");
       thursdayExpenses--;
       }while(thursdayExpenses-1>=0);
        }
        
        if (fridaysExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (fridaysExpenses-(int)fridaysExpenses>=0.5){
               System.out.print("\n"+"FRI:");
                ++fridaysExpenses;
               do{ 
       System.out.print("*");
       fridaysExpenses--;
       }while(fridaysExpenses-1>=0);
            }
        else if(fridaysExpenses-(int)fridaysExpenses<0.5){
            System.out.print("\n"+"FRI:");
            do{ 
       System.out.print("*");
       fridaysExpenses--;
       }while(fridaysExpenses-1>=0);
        } 
              
         if (saturdayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (saturdayExpenses-(int)saturdayExpenses>=0.5){
               System.out.print("\n"+"SAT:");
                ++saturdayExpenses;
               do{ 
       System.out.print("*");
       saturdayExpenses--;
       }while(saturdayExpenses-1>=0);
            }
        else if(saturdayExpenses-(int)fridaysExpenses<0.5){
            System.out.print("\n"+"SAT:");
            do{ 
       System.out.print("*");
       saturdayExpenses--;
       }while(saturdayExpenses-1>=0);
        } 
        
         if (sundayExpenses<0){
            System.out.println("invalid expense amount");
         }
           else if (sundayExpenses-(int)sundayExpenses>=0.5){
               System.out.print("\n"+"SUN:");
                ++sundayExpenses;
               do{ 
       System.out.print("*");
       sundayExpenses--;
       }while(sundayExpenses-1>=0);
            }
        else if(sundayExpenses-(int)sundayExpenses<0.5){
            System.out.print("\n"+"SUN:");
            do{ 
       System.out.print("*");
       sundayExpenses--;
       }while(sundayExpenses-1>=0);
        }       
        
     averageweeklyExpenses=(mondayExpenses+tuesdayExpenses+wednesdayExpenses+thursdayExpenses+fridaysExpenses
        +saturdayExpenses+sundayExpenses)/7;
        System.out.println("\n"+"averageweeklyExpenses");
        
        int weeks;
        weeks=1;
        
         while (weeks<54){
            int percent = (int)(Math.random()*40)+2;
            double averageweeklyexpensesTotal=(averageweeklyExpenses*percent+averageweeklyExpenses);
            double y= averageweeklyexpensesTotal;
            averageweeklyexpensesTotal=averageweeklyexpensesTotal+y;
        
             weeks++;
         }
            
            
        
    
      
        
   
   
   
    }
}    