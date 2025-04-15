import javax.swing.JOptionPane;

public class PriceCalculator{
  public static void main(String[] args){
    int quantity = 3;
    double unitPrice = 4.5;
    double totalPrice = quantity * unitPrice;
    JOptionPane.showMessageDialog(null, "Total price is : R" + totalPrice);
    System.exit(0);
  }
}
