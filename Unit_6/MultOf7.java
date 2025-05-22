/*
 * program that display multiples of 7 below 100
 * */

public class MultOf7{
  public static void main(String[] args){
    int i = 1;
    for (; i <= 100; i++){
      if(i % 7 == 0){
      System.out.println(i);
      }
    }
  }
}
