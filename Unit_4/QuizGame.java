import javax.swing.JOptionPane;

/*
 * This is a simple quiz game.
 * The user has to answer 4 + 5 correctly.
 * If the answer is correct, the message "correct" will be displayed.
 * else "incorrect" will be displayed.
 * */

public class QuizGame{
  public static void main(String[] args) {
    String answerString;
    int answerInt;

    answerString = JOptionPane.showInputDialog("what is 4 + 5");
    answerInt = Integer.parseInt(answerString);

    if(answerInt == 9) {
      JOptionPane.showMessageDialog(null, "correct");
    }
    else{
      JOptionPane.showMessageDialog(null, "incorrect");
    }
  }
}
