// Ruben Castro Espinoza 
//CSE2  
/*This program will generate five random cards that make up a poker hand 
it will then determine weather the hand contains pairs three of a kind etc. */
//I was not able to get the program to work right :( 

public class PokerHandCheck{// allways have to state a class 
    public static void main(String[] args){// always have to state a method
        int card1=(int)(Math.random()*13)+2; // generates randome number 2 to 14
        int card2=(int)(Math.random()*13)+2;
        int card3=(int)(Math.random()*13)+2;
        int card4=(int)(Math.random()*13)+2;
        int card5=(int)(Math.random()*13)+2;
        int suit1=(int)(Math.random()*4)+1; //generates a random number between 1 and 4 
        int suit2=(int)(Math.random()*4)+1;
        int suit3=(int)(Math.random()*4)+1;
        int suit4=(int)(Math.random()*4)+1;
        int suit5=(int)(Math.random()*4)+1;
       String result1= " "; // create a string variable for the result of the switch statment 
      
      
        switch(card1){
            case 14:
                result1 = " The Ace"; // represents the output of a certain input in this case 14 will output the Ace
                break;
            case 13: 
                result1= " The King"; 
                break;
            case 12: 
                result1= " The Queen";
            case 11: 
                result1= " The Jack";
                break;
                default: 
                result1 = "the " +Integer.toString(card1); // had to explisitly cast to make this int compatible with string varibale 
                break; 
                }
        String suitResult1= " ";       // string variable where the result of suit 1 will be stored. 
            switch(suit1){
                case 1:
                    suitResult1= " of Diamonds";// represents one output that is caused by the input of 1. 
                break;
                case 2: 
                    suitResult1= " of Clubs ";
                break;
                case 3:
                    suitResult1= " of Hearts ";
                break;
                case 4: 
                    suitResult1= " of Spades ";
                break;     
            }  // the process repeats 
            String result2= " "; 
            switch(card2){
            case 14:
                result2 = " The Ace";
                break;
            case 13: 
                result2= " The King";
                break;
            case 12: 
                result2= " The Queen";
            case 11: 
                result2= " The Jack";
                break;
                default: 
                result2 = " the "+Integer.toString(+card2);
                break; 
                }
        String suitResult2= " ";        
            switch(suit2){
                case 1:
                    suitResult2= " of Diamonds";
                break;
                case 2: 
                    suitResult2= " of Clubs ";
                break;
                case 3:
                    suitResult2= " of Hearts ";
                break;
                case 4: 
                    suitResult2= " of Spades ";
                break;    
                }
                String result3= " ";// process is repeated 
            switch(card3){
            case 14:
                result3 = " The Ace";
                break;
            case 13: 
                result3= " The King";
                break;
            case 12: 
                result3= " The Queen";
            case 11: 
                result3= " The Jack";
                break;
                default: 
                result3 = " the "+Integer.toString(+card2);
                break; 
                }
        String suitResult3= " ";        
            switch(suit3){
                case 1:
                    suitResult3= " of Diamonds";
                break;
                case 2: 
                    suitResult3= " of Clubs ";
                break;
                case 3:
                    suitResult3= " of Hearts ";
                break;
                case 4: 
                    suitResult3= " of Spades ";
                break;    
                }
                 String result4= " ";//process is repeated 
            switch(card4){
            case 14:
                result4 = " The Ace";
                break;
            case 13: 
                result4= " The King";
                break;
            case 12: 
                result4= " The Queen";
            case 11: 
                result4= " The Jack";
                break;
                default: 
                result4 = " the "+Integer.toString(+card2);
                break; 
                }
        String suitResult4= " ";//process is repeated 
            switch(suit4){
                case 1:
                    suitResult4= " of Diamonds";
                break;
                case 2: 
                    suitResult4= " of Clubs ";
                break;
                case 3:
                    suitResult4= " of Hearts ";
                break;
                case 4: 
                    suitResult4= " of Spades ";
                break;    
                }
                String result5= " "; // process is repeated 
            switch(card5){
            case 14:
                result5 = " The Ace";
                break;
            case 13: 
                result5= " The King";
                break;
            case 12: 
                result5= " The Queen";
            case 11: 
                result5= " The Jack";
                break;
                default: 
                result5 = " the "+Integer.toString(+card2);
                break; 
                }
        String suitResult5= " ";        
            switch(suit5){
                case 1:
                    suitResult5= " of Diamonds";
                break;
                case 2: 
                    suitResult5= " of Clubs ";
                break;
                case 3:
                    suitResult5= " of Hearts ";
                break;
                case 4: 
                    suitResult5= " of Spades ";
                break;
                }
        String hand = " ";
               if(result1==result2 |result1==result3|result1==result4|result1==result5
                |result2==result3|result2==result4|result2==result5|result3==result4|result4==result5){
               
                    hand = "You have two double";
                }    
                    
        
        String cards1= (" Your random cards were: ");    // stores string inside variable     
        System.out.println (cards1);// prints string within  variable 
        System.out.println(result1+suitResult1);// prints string within variable.
        System.out.println(result2+suitResult2);// prints string within variable.
        System.out.println(result3+suitResult3); // prints string within variable.
        System.out.println(result4+suitResult4);
        System.out.println(result5+suitResult5);
        System.out.println(hand);
    
        
    }
}