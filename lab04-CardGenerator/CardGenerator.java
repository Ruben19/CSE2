 //Ruben Castro Espinoza 
 //CSE2
 /*This program will generate a random playing card */
 
public class CardGenerator{
        public static void main(String[]args){
            
            int card = (int)(Math.random()*13)+2;
            int suitNum = (int)(Math.random()*3)+1;
            String name;
            String suit;
            switch(card){
                case 14:
                    name=(" Ace ");
                    break;
                case 13:
                    name=("King");
                    break;
                case 12:
                    name=("Queen");
                    break;
                case 11: 
                   name=("Jack");
                    break;
            }
            if(suitNum==4){
                suit=("Spades");
                
            }
            else if(suitNum==3){
                suit=("Hearts");
            } 
            else if(suitNum==2){
                suit=("Clubs");
            }
            else if(suitNum==1){
                suit=("Diamonds");
            }
            name=Integer.toString(card);
            suit=Integer.toString(suitNum);
           System.out.println(" You picked the " +name+suit );    
            
            
            }
           
            
        }   
        

    
        
 