import java.util.Scanner;
public class Area{
    public static double rectArea(double x, double y) {
    double area = x * y;
    return area;
}
public static double triArea(double x, double y){
    double area = 0.5* x*y;
    return area; 
}
public static double circArea(double x ){
    double pie= 3.14; 
    double area= x*x*pie;
    return area;
}
public static String error(String shapeName){
    System.out.println("Invalid shape. Please enter rectangle, circle, or triangle");
   Scanner myScanner= new Scanner(System.in); 
   shapeName =myScanner.nextLine();
    return shapeName;
}
public  static void main(String[]args){
    Scanner myScanner= new Scanner(System.in);
    System.out.println(" Enter shape all lowercase");
    String shapeName= myScanner.nextLine();
    String rect ="rectangle";
    String tri="triangle";
    String circ="circle";
    if (rect.equals(shapeName)){
        System.out.println("enter lenght and width");
        double x= myScanner.nextDouble();
        double y= myScanner.nextDouble();
        double area= rectArea(x,y);
        System.out.println(area);
    }
    else if(tri.equals(shapeName)){
        System.out.println(" Enter the base and the height"); 
        double x= myScanner.nextDouble();
        double y=myScanner.nextDouble();
        double area=triArea( x ,y);
        System.out.println(area);
    }
    else if(circ.equals(shapeName)){
        System.out.println("Enter the radius");
        double x= myScanner.nextDouble();
        double area= circArea(x);
        System.out.println(area);
    }
    else 
    error(shapeName);
     }
    
}
    



