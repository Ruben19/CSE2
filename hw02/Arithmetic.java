// Ruben Castro 
// september 2 2015
// CSE2 
// This program will calculate each item's idividual total cost and sales tax 
// it will also calculate the total cost of all 3 items before and after tax.
public class Arithmetic {
    public static void  main(String [] args) {
        int nSocks=3;// number of pairs of socks
        double sockCost$=2.58;// Cost per pair of sock
        int nGlasses=6; // Number of drinking glass 
        double glassesCost$=2.29;// cost per glass 
        int nEnvelopes=1; // Number of boxes of envelopes  
        double envelopeCost$=3.25;// Cost per box 
        double taxPercent=0.06; 
        double totalcostofSocks, totalcostofGlasses, totalcostofEnvelopes,
              totalcostofpurchasebeforeTax,sockTax,glassesTax,envelopeTax,
              totaltax,totalcostofPurchase; // I used double on all of these 
             //variables to maintain accuracy.
        
        totalcostofSocks=nSocks*sockCost$;// total cost of socks  
        totalcostofGlasses=nGlasses*glassesCost$;// total cost of glasses 
        totalcostofEnvelopes=nEnvelopes*envelopeCost$;//total cost of envelopes
        sockTax=totalcostofSocks*taxPercent*100;// tax of socks 
        glassesTax=totalcostofGlasses*taxPercent*100;//tax of glass 
        envelopeTax=totalcostofEnvelopes*taxPercent*100;//tax of envelopes 
        totalcostofpurchasebeforeTax = (totalcostofSocks+totalcostofGlasses+
             totalcostofEnvelopes)*100; // total cost of purchase before tax 
        totaltax = sockTax+glassesTax+envelopeTax;// total tax 
        // I multiplied by 100 on certain lines above to prevent answers that 
        // would have more than 2 decimal places. 
        double val1= (double)totalcostofSocks; 
        double val2=(double)totalcostofGlasses;
        double val3= (double)totalcostofEnvelopes;
        // from lines 37-41 I used int to get a number without any decimal 
        // places that way when I devided by 100.0 I would only have 
        // a number with a maxiumum of 2 decimal places.
        int val4=(int)totalcostofpurchasebeforeTax;
        int val5=(int)sockTax;
        int val6=(int)glassesTax;
        int val7=(int)envelopeTax;
        int val8=(int)totaltax;
        // I explicitly cast lines 37-41 to get a number with no decimal value 
        // so that when i devided by 100.0 i would get a value with a maximum 
        // of two decimal points.
        double val10= val5/100.0;
        double val11=val6/100.0;
        double val12=val7/100.0;
        double val13=val8/100.0;
        double val14=val4/100.0;
        double val9= val14+val13;
       // In lines 45-48 I devided by 100.0 to convert the numbers that where
       // once really long decimal points into more realistic numbers 
       // with only two decimal points. 
    System.out.println(" Total Cost of socks " + (val1) + 
          " has a sales tax of " + (val10));
    System.out.println(" Total cost of glasses " + (val2) +
           " has a sales tax of " + (val11));
    System.out.println(" Total cost of envelopes " + (val3) + 
           " has a sales tax of " + (val12));
    System.out.println(" Total cost before sales tax "+ 
    (val14) + " total sales tax " + (val13));
    System.out.println(" Total cost " + (val9)); 
   
        }// end of main 
    }// end of class 