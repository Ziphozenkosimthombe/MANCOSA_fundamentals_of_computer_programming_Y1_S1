/*
 * program that out put the number,
 * is even or odd
 * using the while loop statement
 * */

public class Even_Odd{
  public static void main(String[] args){
    int count = 1;
    while (count <= 10){
      if (count % 2 == 0){
        System.out.println(count + " =  is even");
      }else{
        System.out.println(count + " =  is odd");
      }
      count++;
    }
  }
}
