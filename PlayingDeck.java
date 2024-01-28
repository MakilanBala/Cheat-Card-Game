import java.util.ArrayList;

public class PlayingDeck
{
  ArrayList<Card> deckOfCards;
  
  int cardRank;

  public PlayingDeck()
  {
    deckOfCards = new ArrayList<Card>();
    cardRank = 0;
  }

  public void addCard(Card card)
  {
    deckOfCards.add(card);
  }
  
  public ArrayList<Card> showLastCards(int numCards)
  {
    ArrayList<Card> lastCardsPlayed = new ArrayList<Card>();

    for (int i = 1; i <= numCards ; i++)
      {
        Card card = deckOfCards.get(deckOfCards.size()-i);
        lastCardsPlayed.add(card);
      }
    return lastCardsPlayed;
  }

  public ArrayList<Card> returnCards()
  {
    return deckOfCards;
  }

  public void clearCards()
  {
    deckOfCards.clear();
  }

  public void setRank()
  {
    if (cardRank < 12)
    {
      cardRank++;
    }
    else
    {
      cardRank = 0;
    }
    
  }

  public int getRankValue()
  {
    return cardRank;
  }
  
  public String getRank()
  {
    Deck deck = new Deck();
    String [] cardNames = deck.returnCardNames();
    return cardNames[cardRank];
    
  }

}