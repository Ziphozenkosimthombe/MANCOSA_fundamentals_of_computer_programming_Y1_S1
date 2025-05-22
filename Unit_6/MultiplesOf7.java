/*
 * program that print from 1 to 10,
 * but it quit if the multiples of 7 encountered
 * */


public class MultiplesOf7{
  public static void main(String[] args){
    int i = 1;

    do{
      System.out.println(i);
      if(i % 7 == 0){
        System.out.println("program quit multiples of 7 encountered");
        break;

      }
      i++;
    }while(i <= 10);
  }
}
