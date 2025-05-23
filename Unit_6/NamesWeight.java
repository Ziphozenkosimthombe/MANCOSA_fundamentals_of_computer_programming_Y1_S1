import javax.swing.JOptionPane;


/*
 * program that prompt the user to enter 3 names,
 * and their respective weights.
 * Display name and weight for each input using System.out
 * */
public class NamesWeight{
  public static void main(String[] args){
    String str;
    double weight;

    for(int i = 0; i < 3; i++){
      str = JOptionPane.showInputDialog("Enter the name: ");
      weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight: "));
      System.out.println(str + " " + weight + "kg");
    }
  }
}
