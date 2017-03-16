
import java.util.Scanner;

public class DeckTester{
    public static void main(String[] args) {
        testFullGame();
        //DeckTestMethod();
        //CardTestMethod();
        
         
    }

    public static void DeckTestMethod(){

        Deck testDeck=new Deck();
        testDeck.shuffle();
        testDeck.drawCard();
        testDeck.drawCard();
        testDeck.drawCard();
        testDeck.drawCard();

    }
     public static void CardTestMethod(){

        Card testCard=new Card(14,4);
         System.out.println(testCard.getValue()+"   "+ testCard.getSuit());
        Card testCard2=new Card(17,4);

    }

    public static void testFullGame(){
        Player player1=new Player("nilay");
        System.out.println("***********************************");
        System.out.println("*       POKER         *");
        System.out.println("***********************************");
        System.out.println("Your initial balance: $"+ player1.getBankRoll());
        player1.playHand();
        String choice;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Do you want to play another hand? (Y) for new hand (Q) for Quit");
            choice=in.next();
            if(choice.equals("Y")|| choice.equals("y")){
                System.out.println("Your initial balance: $"+ player1.getBankRoll());
                player1.playHand();
            }
            else if(choice.equals("Q")|| choice.equals("q")){
                System.out.println("Your last balance: $"+ player1.getBankRoll());
                System.out.println("GOODBYE!");
                break;

            }
            else{
                System.out.println("Not a valid entry!");
            }
        }

    }
}

