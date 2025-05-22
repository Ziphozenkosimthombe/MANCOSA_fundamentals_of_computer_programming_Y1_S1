import javax.swing.JOptionPane;

public class Sentinel{
  public static void main(String[] args){
    int num = -99;
    int count = 0;
    String str;
    str = JOptionPane.showInputDialog("Enter the number: ");
    num = Integer.parseInt(str);
    while (num != -99){
      count++;
      str = JOptionPane.showInputDialog("Enter the number: ");
      num = Integer.parseInt(str);
    }
    System.out.println(count);
  }
}
