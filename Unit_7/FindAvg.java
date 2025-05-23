

/*
 * program that find the average of three numbers
 * */

public class FindAvg{
  static int findAvg(int a, int b, int c){
    return ((a+b+c)/3);
  }
  public static void main(String[] args){
    System.out.println("Average is "+findAvg(10,20,30));
  }
}
