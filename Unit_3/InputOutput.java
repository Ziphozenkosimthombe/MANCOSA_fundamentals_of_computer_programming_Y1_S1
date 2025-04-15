import javax.swing.JOptionPane;

public class InputOutput{
  public static void main(String[] args){
    int num1;
    int num2;
    int total;
    String numString1;
    String numString2;

    numString1 = JOptionPane.showInputDialog("Enter the first number: ");
    numString2 = JOptionPane.showInputDialog("Enter the second number:" );

    num1 = Integer.parseInt(numString1);
    num2 = Integer.parseInt(numString2);
    total = num1 + num2;

    JOptionPane.showMessageDialog(null, "The total is: " + total);
    System.exit(0);
  }
}
