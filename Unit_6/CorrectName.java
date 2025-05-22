import javax.swing.JOptionPane;

/*
 * program that ask the user to enter their name.
 * the program keeps prompting them until they enter the correct name.
 *
 * */
public class CorrectName{
  public static void main(String[] args){
    String str;
    str = JOptionPane.showInputDialog("Enter the name: ");
    while(!str.equals("Apple")){
      str = JOptionPane.showInputDialog("Enter the name: ");  
    }
      System.out.println("Correct name");
  }
}
