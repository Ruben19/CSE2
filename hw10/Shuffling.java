/* Ruben Castro Espinoza 
CSE2 Friday october 30th 
this program will first print out a deck of 52 cards then it will shuffle the deck and reprint the deck out. It will then 
randomly select 5 cards from the shuffled deck and print out the values/ name of said cards. */

public class Shuffling{
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  //System.out.print(cards[i]+" ");
}
printArray(cards); // call method printArray with array varriable cards 
Shuffle(cards); // calls method Shuffle  with array variable card 
System.out.println(" "); // creates space 
printArray(cards);// call method printArray with array varriable cards 
System.out.println(" ");
hand= randomizeHand(cards);// calls metod randomizehand with array variable cards and sets array equal to hand
printArray(hand);// calls PrintArray with array variable of H
  }
  public static void printArray(String[] x){ // method that prints the deck .
    for (int i=0; i< x.length; i++){ // for loop that prints each slot of the array. x.lenght is how = to however many slots are in the array called 
    System.out.print(x[i]+" ");// prints each slot of the array
}
}
public static void Shuffle(String[] cards){ // method that shuffles the deck. 
  for(int i=0; i<51; i++){ // for loop that shuffles deck.
    int rand= (int)(Math.random()*51+1);
   String temp= cards[rand]; // temporary variable to store  random slot called 
   cards[rand]=cards[0]; // setting random value within random slot  equal to variable within slot .
   cards[0]=temp;// setting slot 0 equal to random variable within slot. 
  }
}
public static String[] randomizeHand(String[]cards){ // method that picks 5 random cards.
  String[] hand= new String[5]; // creates an array called hand with 5 slots. 
  for(int i=0; i< 5; i++){ // for statment that fills slots  in hand array with random cards from the deck. 
    int rand=(int)(Math.random()*51); // randomly generated number.
    hand[i]=cards[rand];// sets randomly generated slot within the cards array equal to slots in sequence of array hand.
  }return hand;// returns
} 

} 
 


    
  


