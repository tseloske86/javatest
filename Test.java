import java.io.*;
import java.util.*;
//This is my first time!!
/*
enter your code block comments here!
*/

public class Test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int egg = sc.nextInt();

    System.out.println("Hello World! " + kirby(egg));
  }

  public static int kirby(int x){
    if(x == 0){
      return x + 1000;
    }else if(x % 2 == 0){
      return x * 1000;
    }
  }
}
