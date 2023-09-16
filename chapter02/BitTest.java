/*
測試運算符的使用5: 位運算符

1. <<  >>  >>>  &  |  ^  ~

2. 說明:
  1> <<  >>  >>>  &  |  ^  ~ : 針對數值類型的變量或常量進行運算, 運算結果也是數值
  2> 
    << : 在一定範圍內, 每向左移動一位, 結果就在原有的基礎上 * 2 (對於正數、負數都適用)
    >> : 在一定範圍內, 每向右移動一位, 結果就在原有的基礎上 / 2 (對於正數、負數都適用)
    
3. 面試題: 用高效的方式計算 2 * 8 ?
  2 << 3  或  8 << 1

*/
package chapter02;

public class BitTest {
  public static void main(String[] args) {
    int num1 = 7;

    System.out.println("num1 << 1 : " + (num1 << 1));
    System.out.println("num1 << 2 : " + (num1 << 2));
    System.out.println("num1 << 3 : " + (num1 << 3));

    int num2 = -7;

    System.out.println("num2 << 1 : " + (num2 << 1));
    System.out.println("num2 << 2 : " + (num2 << 2));
    System.out.println("num2 << 3 : " + (num2 << 3));
    
    int num3 = 8;
    System.out.println(num3 << 1);
  }
}
