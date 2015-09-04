// Ruben Castro Espinoza 
//September 4 2015
// CSE 2 
//  This program will calculate the time, distance and counts for each trip
// individually and then together. 

public class Cyclometer {
    //
    public static void main(String[]args) {
        int secsTrip1= 480;// time trip one took.
        int secsTrip2=3220;//time trip two took 
        int countsTrip1=1561;// times the wheel made one full rotation in Trip1
        int countsTrip2=9037;//times the wheel made one full rotation in Trip2
        double wheelDiameter=27.0,// necessasry to solve for distance traveled
        PI=3.14159,// necesasry to solve for distance traveled 
        feetperMile= 5280,// necessasry for conversion Miles. 
        inchesperFoot=12,// necessasry for conversion
        secondsperMinute=60;//necessary for conversion. 
        double distanceTrip1, distanceTrip2, totalDistance;
        // the first two varaibles above represent each individual trips 
        //distance the final variable is the combination or total distance 
        // of the two. 
    System.out.println (" Trip 1 took "+
           (secsTrip1/secondsperMinute)+ " minutes and had "+
          countsTrip1+ " counts.");
    System.out.println(" Trip 2 took " +
          (secsTrip2/secondsperMinute)+ " minutes and had "+
          countsTrip2 + " counts.");
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // above gives the distance in inches 
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesperFoot*feetperMile;//converts distance to miles.
    distanceTrip2=countsTrip2*wheelDiameter*PI;
    distanceTrip2/=inchesperFoot*feetperMile;
    totalDistance= distanceTrip1+distanceTrip2;
    System.out.println(" Trip 1 was "+ distanceTrip1 +" miles ");
    System.out.println(" Trip 2 was "+ distanceTrip2+" miles ");
    System.out.println(" Total distance was " + totalDistance + " miles ");
     }// end of main method 
} // end of class 