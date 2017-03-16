
public class Card{
    private final int value;
    private final int suit;

   private final static int SPADES = 1,       
                            HEARTS = 2,
                            DIAMONDS = 3,
                            CLUBS = 4;
                            
    private final static int JACK = 11,        
                            QUEEN = 12,      
                            KING = 13,
                            ACE = 14;

    public Card(int val, int sui){ // constructor
        if(sui>4){
            System.out.println(" WRONG SUIT NUMBER OF CARD");
            System.exit(0);

        }
        if(val>14){
            System.out.println(" WRONG VALUE OF CARD");
            System.exit(0);

        }

    	value=val;
    	suit=sui;

    }

    public int getValue(){ // get for value
    	return value;

    }

    public int getSuit(){ // get for suit
    	return suit;

    }
    
}




