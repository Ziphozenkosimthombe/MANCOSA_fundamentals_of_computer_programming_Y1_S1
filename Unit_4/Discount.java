import javax.swing.JOptionPane;


/*
 * this program ask the user their age
 * if the user age is lessthan 12 or the users age is greater than 60
 * the user will get the discount of 25%
 * */

public class Discount{
  public static void main(String[] args){
    String answerString;

    answerString = JOptionPane.showInputDialog("Enter your age");
    if(Integer.parseInt(answerString) < 12 || Integer.parseInt(answerString) > 60){
      JOptionPane.showMessageDialog(null, "you get a discount of 25%");
    }else{
      JOptionPane.showMessageDialog(null, "no discount");
    }
  }
}
