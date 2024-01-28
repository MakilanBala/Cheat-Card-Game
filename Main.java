import java.util.Scanner;
import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1, player2, player3, player4;
    PlayingDeck playingDeck = new PlayingDeck();
    Scanner input = new Scanner(System.in);
    Display display = new Display();
    boolean noWinner = true;
    ArrayList<Card> lastCardsPlayed = new ArrayList<Card>();
    Card cardPlayed = null;
    int cardsPlayed; 
    Boolean cheat = null;

    deck.setDeck();
    deck.shuffleDeck();
    
    player1 = new Player(deck.returnCards());
    player2 = new Player(deck.returnCards());
    player3 = new Player(deck.returnCards());
    player4 = new Player(deck.returnCards());
    Player[] players = { player1, player2, player3, player4 };

    
    
    while (noWinner){  
      for (int i = 0; i < 4; i++) {
        System.out.println("_______________\n");
        System.out.println("Player " + (i+1));
        System.out.println("_______________");
        System.out.println("\nView Cards (1)");
        System.out.print("\nPlayer : ");
        if (input.nextInt() == 1) {
          players[i].viewCards();
        }
        System.out.println("Card Rank : " + playingDeck.getRank());
        System.out.println("Choose Card : (1) ");
        System.out.println("Call Cheat : (2)");
        System.out.print("\nPlayer : ");
        if (input.nextInt() == 2)
        {
          try {
           
            if (cheat)
            {
              if (i == 0)
              {
                players[3].addCards(playingDeck.returnCards());
              }
              else
              {
                players[i-1].addCards(playingDeck.returnCards());
              }
              System.out.println("Good call :)");
            }
            else
            {
              players[i].addCards(playingDeck.returnCards());
              System.out.println("Oops, they weren't lying :(");
              players[i].viewCards();
            }
            playingDeck.clearCards();
          } catch (Exception e)
          {
            System.out.println("Can't call cheat with no cards placed"); 
            
          }
        }
        System.out.print("\n\nNumbers of Cards Played(1-4): "); 
        cardsPlayed = input.nextInt();
        for (int j = 0; j < cardsPlayed; j++)
        {
          if (j < 4)
          {
            System.out.print("\nCard Choice: ");
            cardPlayed = players[i].placeCard(input.nextInt());
            playingDeck.addCard(cardPlayed);
            players[i].viewCards();
          }  
        }
        
        lastCardsPlayed = playingDeck.showLastCards(cardsPlayed);
        cheat = false;
        for (int j = 0; j < lastCardsPlayed.size(); j++)
          {
            if(players[i].didCheat(lastCardsPlayed.get(j),playingDeck.getRankValue()))
            {
              cheat = true;
            }
          }
        
        if (players[i].hasZeroCards())
        {
          noWinner = false;
          display.displayWinner(i+1);
          i = 4;
        }
        display.delay(750);
        for (int j = 0; j < 20; j++) {
          System.out.println("\n");
        }
        
        System.out.println("-------------------------------");
        System.out.println("Don't look at other players cards");
        System.out.println("\n-------------------------------");
        playingDeck.setRank();
      }
    }
    

    
  }

  
  
  
  
}