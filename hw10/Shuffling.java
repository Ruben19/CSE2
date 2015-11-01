/* Ruben Castro Espinoza 
CSE2 Friday october 30th 
this program will first print out a deck of 52 cards then it will shuffle the deck and reprint the deck out. It will then 
randomly select 5 cards from the shuffled deck and print out the values/ name of said cards. */
import java.util.Scanner;
public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  System.out.print(cards[i]+" ");
}
/*printArray(cards);
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand);*/
  }
  public static String[]printArray(String[]){
    
  }
}
