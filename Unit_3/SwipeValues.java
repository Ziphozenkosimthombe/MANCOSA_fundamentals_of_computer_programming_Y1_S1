import javax.swing.JOptionPane;

public class SwipeValues{
  public static void main(String[] args){
    int num1 = 0;
    int num2 = 10;
    int num3 = 4;
    int temp;
    JOptionPane.showMessageDialog(null,"Before swip:  " + num1 + "; " + num2 + "; " + num3);

    temp = num1;
    num1 = num2;
    num2 = num3;
    num3 = temp;
    JOptionPane.showMessageDialog(null,"After swip:  " + num1 + "; " + num2 + "; " + num3);
  }
}
