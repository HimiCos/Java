package chapter03;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class ForExer {
  public static void main(String[] args) {
    Random guessRandom = new Random();
    int guessNum = guessRandom.nextInt(100);
    Scanner gScanner = new Scanner(System.in);
    
    for (int i = 1; i <= 5; i++){
      System.out.print("一共五次機會, 您還剩" + (6-i) +"次, 請作答: ");
      int userGuess = gScanner.nextInt();
      if (userGuess == guessNum) {
        System.out.println("猜對了");
        break;
      } else if (userGuess > guessNum) {
        System.out.println("猜大了");
      } else {
        System.out.println("猜小了");
      }
    }
  }
}
