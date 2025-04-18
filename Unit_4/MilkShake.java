import javax.swing.JOptionPane;

/*
 * program which ask the user to input the size of the milk shake, she would like to purchase
 * and based on the size, it will tell here the price,
 * the price are as follow:
 * 1. small = R5
 * 2. medium = R10
 * 3. large = R15
 * the user should type the number 1,2,3 in order to select the size.
 * we must make sure we instruct the user to do so in a text input dialogbox.
 * */

public class MilkShake{
  public static void main(String[] args){
    String answerString;
    int answerInt;
    answerString = JOptionPane.showInputDialog("Hello what size of the milkshake you want to buy" + "\n" + "1. small" + "\n" + "2. medium" + "\n " + "3. large");
    answerInt = Integer.parseInt(answerString);
    if(answerInt == 1){
      JOptionPane.showMessageDialog(null, "the price of small milkshake is R5");
    }
    if(answerInt == 2){
      JOptionPane.showMessageDialog(null, "the price of medium milkshake is R10");
    }
    if(answerInt == 3){
      JOptionPane.showMessageDialog(null, "the price of large milkshake is R15");
    }
  }
}
