package chapter03;

import java.util.Scanner;
public class ScannerExer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("身高: ");
    int height = scan.nextInt();
    System.out.print("存款(千萬): ");
    Double wealth = scan.nextDouble();
    System.out.print("帥否(是/否): ");
    String isHandsome = scan.next();
    
    if (height >= 180 && wealth >= 1.0 && isHandsome.equals("是")) {
      System.out.println("我一定要嫁給他");
    } else if (height >= 180 || wealth >= 1.0 || isHandsome.equals("是")) {
      System.out.println("嫁吧, 比上不足, 比下有餘");
    } else {
      System.out.println("不嫁");
    }
  }
}
