/*
由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else)，并且从大到小输出。

* */

package chapter03;

public class IfElseTest1 {
  public static void main(String[] args) {
    int num1 = 81;
    int num2 = 78;
    int num3 = 52;
    
    if ( num1 >= num2 ) {
      if ( num3 >= num1) {
        System.out.println("num3 > num1 > num2");
      } else if (num3 <= num2) {
        System.out.println("num1 > num2 > num3");
      } else {
        System.out.println("num1 > num3 > num2");
      }
    } else {
      if ( num3 >= num2) {
        System.out.println("num3 > num2 > num1");
      } else if (num3 <= num1) {
        System.out.println("num2 > num1 > num3");
      } else {
        System.out.println("num2 > num3 > num1");
      }
    }
  }
}
class Test1 {
  public static void main(String[] args) {
    int small = 10;
    int big = 9;
    if ( small > big ) {
      int temp = small;
      small = big;
      big = temp;
    }
    System.out.println("small=" + small + ",big=" + big);
  }
}
