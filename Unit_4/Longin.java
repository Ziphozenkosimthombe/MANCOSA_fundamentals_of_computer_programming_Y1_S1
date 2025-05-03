import javax.swing.JOptionPane;

/*
 * the program will ask the user to input their username and password
 * the username and password are as follow:
 * 1. username = admin
 * 2. password = abcs1234
 * */


public class Longin{
  public static void main(String [] args){
    String answerString;
    String answerString2;
    answerString = JOptionPane.showInputDialog("Enter the username");
    answerString2 = JOptionPane.showInputDialog("Enter the password");

    if(answerString.equals("admin") && answerString2.equals("abcd1234")){
      JOptionPane.showMessageDialog(null, "correct");
    }else{
      JOptionPane.showMessageDialog(null, "incorrect");
    }
  }

}
