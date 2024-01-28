import java.lang.Thread;

public class Display
{
  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_HIGHLIGHT = "\u001B[43m";
  public static final String TEXT_RESET = "\u001B[0m";
  private String instructions = " Four player game\n\n- The game begins with an ace. Rank increase with each turn.\n\n- A player must put down 1-4 cards on their turn.\n\n -Players can put down cards with the correct rank or incorrect rank.\n\n- Another player can call cheat if they suspect the incorrect cards were placed down.\n\n- If the cards are incorrect, the player who cheated must take all the cards.\n\n- However, if the cards are correct, the player who called Cheat must take all the cards.\n\n- The first player to get rid of their cards wins.";

  private String Cheat = "▄▀▀ █▄█ ██▀ ▄▀▄ ▀█▀ \n" +
"▀▄▄ █ █ █▄▄ █▀█  █ ";
  
  private String Winner = "█   █ █ █▄ █ █▄ █ ██▀ █▀▄ \n" + "▀▄▀▄▀ █ █ ▀█ █ ▀█ █▄▄ █▀▄ ";


  public Display()
    {
      System.out.println("\n\nWelcome to Cheat \n\n");
      System.out.println(TEXT_HIGHLIGHT + "Instructions: \n\n" + TEXT_RESET);
      System.out.println(instructions + "\n\n");
      delay(5000);
      System.out.println(TEXT_RED +  "____________________\n");
      System.out.println(Cheat);
      System.out.println("____________________\n\n" +  TEXT_RESET);
     
    }

  public void delay(int time)
  {
    try
    {
      Thread.sleep(time);
    }
    catch (Exception e) 
    {
      System.out.println(e);
    }
  }

  public void displayWinner(int player)
  {
    for (int i = 0; i < 20; i++)
    {
      System.out.println("\n");
    }
    System.out.println(TEXT_RED + Winner + "\n");
    System.out.println("PLAYER " + player + TEXT_RESET);
    
  }
  
}