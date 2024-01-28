import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Deck
{
  private ArrayList<Card> deckOfCards;
  private String[] cardNames = {"Ace","Two","Three","Four","Five","Six","Seven","Eight", "Nine", "Ten", "Jack","Queen","King"};

  public Deck()
  {
    deckOfCards = new ArrayList<Card>();
  }

  public void setDeck()
  {
    for (int i = 0; i < cardNames.length; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        Card card = new Card(cardNames[i],i);
        deckOfCards.add(card);
      }

    }
  }

  public void shuffleDeck()
  {
    Collections.shuffle(deckOfCards);
  }

  public ArrayList<Card> returnCards()
  {
    ArrayList<Card> cardsDealt = new ArrayList<Card>();

    for (int i = 0; i < 13; i++)
    {
      cardsDealt.add(deckOfCards.remove(0));
      // remove cards
    }
    return cardsDealt;
    
  }

  public String [] returnCardNames()
  {
    return cardNames;
  }

  public String toString()
  {
    String deck = "DECK";
    for (Card card: deckOfCards)
    {
      deck += "\n" + card + "\n";
    }
    deck += "\n \n \n \n";
    return deck;
  }
}

