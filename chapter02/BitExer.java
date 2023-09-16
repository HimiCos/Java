/*
如何交换两个int型变量的值？String呢？
*/
package chapter02;

public class BitExer {
  public static void main(String[] args) {
    int m = 10;
    int n = 20;
    
    System.out.println("m = " + m + " n = " + n);
    
    // 交互兩個變量的值
    // 方式一: 聲明一個臨時變量(推薦)
    // int temp = m;
    // m = n;
    // n = temp;
    
    // 方式二: 優點: 不需要定義臨時變量; 缺點: 難、適用性差(不適用與非數值類型)
    // m = m + n;
    // n = m - n;
    // m = m - n;
    
    // 方式三: 缺點: 真難
    m = m ^ n;
    n = m ^ n; // n = (m ^ n) ^ n
    m = m ^ n;

    System.out.println("m = " + m + " n = " + n);
    
    
  }
}
