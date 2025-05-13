import javax.swing.JOptionPane;

/*
 * program that prompt the user to enter five marks,
 * using while loop,
 * Display the sum and the average of five marks
 * */

public class Marks{
  public static void main(String[] args){
    int count = 1;
    int total = 0;
    int num;
    String str;
    double average;

    while (count <= 5){
      str = JOptionPane.showInputDialog("Enter the marks: ");
      num = Integer.parseInt(str);
      total = total + num;
      count++;
    }

    average = total / 5;
    System.out.println("Total = " + total);
    System.out.println("Average = " + average);
  }
}
