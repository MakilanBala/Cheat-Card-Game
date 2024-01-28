
public class Card
{
  private String cardName;
  private int cardValue;

  public Card(String cardName, int carValue)
  {
    this.cardName = cardName;
    this.cardValue = carValue;
  }

  public void setCardName(String cardName)
  {
    this.cardName = cardName;
  }

  public void setCardValue(int cardValue)
  {
    this.cardValue = cardValue;
  }

  public String getCardName()
  {
    return cardName;
  }

  public int getCardValue()
  {
    return cardValue;
  }

  public String toString()
  {
    return cardName;
  }

}