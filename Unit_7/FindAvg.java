

/*
 * program that find the average of three numbers
 * */

public class FindAvg{
  static double findAvg(int a, int b, int c){
    double avg = (a+b+c)/3;
    return (avg);
  }
  public static void main(String[] args){
    double av = findAvg(10,20,30);
    System.out.println("Average is "+ av);
  }
}
