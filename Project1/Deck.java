
import java.util.Random;
import java.util.Arrays;
public class Deck{
    
    private Card[] deck;
    
    public Deck(){  //constructor
        
        deck = new Card[52];
        int counter=0;
        System.out.println("For Suit: SPADES = 1,   HEARTS = 2, DIAMONDS = 3, CLUBS = 4");
        System.out.println("For Value: JACK = 11,       QUEEN = 12,     KING = 13,     ACE = 14;");
        System.out.println("Deck created!!");
        for ( int suit = 1; suit <= 4; suit++ ) {
            for ( int value = 2; value <= 14; value++ ) {
                deck[counter] = new Card(value,suit);
                System.out.println("Card "+counter+": value= "+value+" suit= "+suit);
                counter++;

            }
        }
    }
    
        public void shuffle(){  // shuffles the cards

            Random rand = new Random();
            System.out.println("Deck shuffled!!");
            for(int i =0; i<deck.length; i++){
                int n=rand.nextInt(deck.length-1) + 1;
                Card temp=deck[i];
                deck[i]=deck[n];
                deck[n]=temp;
                System.out.println("Value of card: "+deck[i].getValue()+" Suit of card: "+deck[i].getSuit());
            }

            
        }
        public Card drawCard(){  // draws a card from deck
                /*Card drawnCard = deck[deck.length-1-dCard];
                dCard++;
                if(dCard==51){
                    System.out.println("Last card drawn");
                }*/
                Card drawnCard =this.deck[0];
                this.deck=Arrays.copyOfRange(deck,1,deck.length-1);
                if(deck.length-1<1){
                    System.out.println("Last card drawn");
                }
               // System.out.println(deck.length);

                return drawnCard;
        }
}

