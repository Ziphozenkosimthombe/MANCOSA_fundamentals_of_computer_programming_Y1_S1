import javax.swing.JOptionPane;


/*
 * program that prompt the user to enter 3 names,
 * and their respective weights.
 * Display name and weight for each input using System.out
 * using while loop.
 * */
public class WhileNameWeight{
  public static void main(String[] args){
    String str;
    double weight;
    int i = 1;

    while(i <= 3){
      str = JOptionPane.showInputDialog("Enter the name: ");
      weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight: "));
      System.out.println(str + " " + weight + "kg");
      i++;
    }
  }
}
