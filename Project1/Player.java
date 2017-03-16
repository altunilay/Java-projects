
import java.util.Scanner;
public class Player{


	private String name;
	private static int bankRoll;


	public Player(String new_name){ // one parameter constructor
		name=new_name;
		bankRoll=1000;
	}

	public static int bet(int amount){ // makes bet

		bankRoll=bankRoll-amount;
        if(bankRoll<=0){
            System.out.println("Sorry, not enough balance!");
            System.exit(0);
        }
		return bankRoll;
	}
    public static void winnings(int amount){ // updates winnings

		bankRoll=bankRoll+amount;
	}

    public int getBankRoll(){ // get for bankroll
        return bankRoll;

    }

	public void playHand(){ // plays hand in this function does almost everything in there

		Deck deck1=new Deck();
        deck1.shuffle();
        Card[] playerHand= new Card[5];
        Card[] computerHand= new Card[5];
        HandCheck player=new HandCheck();
        HandCheck computer=new HandCheck();

        for (int i=0;i<5;i++){
        	playerHand[i]=deck1.drawCard();
        }

        for (int i=0;i<5;i++){
        	computerHand[i]=deck1.drawCard();
        }
        System.out.println("Player Hand");
        System.out.println("For Suit: SPADES = 1,   HEARTS = 2, DIAMONDS = 3, CLUBS = 4");
        System.out.println("For Value: JACK = 11,       QUEEN = 12,     KING = 13,     ACE = 14;");
		for (int i=0;i<5;i++){
			System.out.println("Value of card: "+playerHand[i].getValue()+" Suit of card: "+playerHand[i].getSuit());
		}
        System.out.println("Hand score: "+player.check(playerHand));



		System.out.println("Do you want to redraw? (Y) for YES    (N) for No    (Q) for Quit");
		String choice;
		Scanner in=new Scanner(System.in);
		choice=in.next();

		if(choice.equals("Y")|| choice.equals("y")){
            for (int i=0;i<5;i++){
                playerHand[i]=deck1.drawCard();
            }
            System.out.println("Player's New Hand");
            System.out.println("For Suit: SPADES = 1,   HEARTS = 2, DIAMONDS = 3, CLUBS = 4");
            System.out.println("For Value: JACK = 11,       QUEEN = 12,     KING = 13,     ACE = 14;");
            for (int i=0;i<5;i++){
                
                System.out.println("Value of card: "+playerHand[i].getValue()+" Suit of card: "+playerHand[i].getSuit());

            }
            System.out.println("Hand score: "+player.check(playerHand));
		}
		else if(choice.equals("N")|| choice.equals("n")){

		}
        else if(choice.equals("Q")|| choice.equals("q")){
            System.exit(0);
        }

		else{
			System.out.println("Not a valid entry!");
		}
        String choice2;
        System.out.println("Do you want to bet? (Y) for YES    (N) for No    (Q) for Quit");
        choice2=in.next();
        int bet_amount=0;
        if(choice2.equals("Y")|| choice2.equals("y")){
        	
        	System.out.println("What is the amount you want to bet?");
        	bet_amount=in.nextInt();
        	bet(bet_amount);
        }
        else if(choice2.equals("N")|| choice2.equals("n")){
            
        }
         else if(choice2.equals("Q")|| choice2.equals("q")){
            System.exit(0);
        }
        else{
            System.out.println("Not a valid entry!");
        }
        System.out.println("Computer Hand");
        System.out.println("For Suit: SPADES = 1,   HEARTS = 2, DIAMONDS = 3, CLUBS = 4");
        System.out.println("For Value: JACK = 11,       QUEEN = 12,     KING = 13,     ACE = 14;");
        for (int i=0;i<5;i++){
			System.out.println("Value of card: "+computerHand[i].getValue()+" Suit of card: "+computerHand[i].getSuit());
		}
        System.out.println("Hand score: "+computer.check(computerHand));
       
        if(computer.check(computerHand)<400){
            for (int i=0;i<5;i++){
                computerHand[i]=deck1.drawCard();
            }
            System.out.println("Computer's New Hand");
            System.out.println("For Suit: SPADES = 1,   HEARTS = 2, DIAMONDS = 3, CLUBS = 4");
            System.out.println("For Value: JACK = 11,       QUEEN = 12,     KING = 13,     ACE = 14;");
            for (int i=0;i<5;i++){
                System.out.println("Value of card: "+computerHand[i].getValue()+" Suit of card: "+computerHand[i].getSuit());
            }
            System.out.println("Hand score: "+computer.check(computerHand));

            System.out.println("Player Hand");
            for (int i=0;i<5;i++){
                System.out.println("Value of card: "+playerHand[i].getValue()+" Suit of card: "+playerHand[i].getSuit());
            }
            System.out.println("Hand score: "+player.check(playerHand));
        }

        // decides the winner
        if(computer.check(computerHand)>player.check(playerHand)){
                System.out.println("WINNER: COMPUTER! COMPUTER'S SCORE: "+computer.check(computerHand)+" YOUR SCORE: "+ player.check(playerHand));
        }
        else if(computer.check(computerHand)==player.check(playerHand)){
                System.out.println(" DEUCE !");
                winnings(bet_amount);
        }

        else{
                System.out.println("WINNER: YOU! YOUR SCORE: "+player.check(playerHand)+" COMPUTER'S SCORE: "+computer.check(computerHand));
                winnings(bet_amount*2);
        }
        
	}
}