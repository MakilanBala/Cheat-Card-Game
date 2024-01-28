import java.util.ArrayList;

public class Player
{
  private ArrayList<Card> playerDeck;

  public Player( ArrayList<Card> cards)
  {
    playerDeck = new ArrayList<Card>();
    for (Card card : cards)
    {
      playerDeck.add(card);
    }
  }

  public void addCards(ArrayList<Card> cards)
  {
    for (Card card : cards)
    {
      playerDeck.add(card);
    }
  }

  public void viewCards()
  {
    String TEXT_BLUE = "\u001B[34m";
    String TEXT_RESET = "\u001B[0m";
    System.out.println(TEXT_BLUE + toString() + TEXT_RESET);
  }

  public boolean hasZeroCards()
  {
    if (playerDeck.size() == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  

  public Card placeCard(int cardPlace)
  {
    return playerDeck.remove(cardPlace - 1);
  }

  public boolean didCheat(Card card, int rank)
  {
    
      boolean cheat;
      if (card.getCardValue() == rank)
      {
        cheat = false;
      }
      else
      {
        cheat = true;
      }
      return cheat;
    
    
  }
  
  public String toString()
  {
    String output = "\n------------------\n";
    output += "Cards in Your Deck\n";
    output += "------------------\n\n";
    for (int i = 0; i < playerDeck.size(); i++)
    {
      output += "(" + (i + 1) + ") " + (playerDeck.get(i)).getCardName() + "\n";
    }
    output += "\n------------------\n";
    return output;
  }

  
}