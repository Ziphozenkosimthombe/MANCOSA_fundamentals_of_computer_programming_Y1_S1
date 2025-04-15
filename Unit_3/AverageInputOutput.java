import javax.swing.JOptionPane;

public class AverageInputOutput{
  public static void main(String[] args){
    int num1;
    int num2;
    int num3;
    int average;
    String numString1;
    String numString2;
    String numString3;

    numString1 = JOptionPane.showInputDialog("Enter the first number: ");
    numString2 = JOptionPane.showInputDialog("Enter the second number:" );
    numString3 = JOptionPane.showInputDialog("Enter the third number:" );
    num1 = Integer.parseInt(numString1);
    num2 = Integer.parseInt(numString2);
    num3 = Integer.parseInt(numString3);
    average = (num1 + num2 + num3) / 3;
    JOptionPane.showMessageDialog(null, "The average is: " + average);
    System.exit(0);
  }
}
