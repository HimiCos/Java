/*
測試運算符的使用6 : 條件運算符

1. (條件表達時) ? 表達式1 : 表達式2
2. 說明: 
  1> 條件表達式的結果是boolean類型
  2> 如果條件表達式的結果是true, 則執行表達式1, 反之亦然
  3> 表達式1 和 表達式2 需要是相同的類型或能兼容的類型
 
- 凡是可以使用條件運算符的地方，都可以改寫為if-else結構。反之，不成立。
- 開發中，如果既可以使用條件運算符，又可以使用if-else，推薦使用條件運算符。因為執行效率稍高。
*/
package chapter02;

public class ConditionTest {
  public static void main(String[] args) {
    
    String info = (2 > 1) ? "大於" : "小於";
    System.out.println(info);

    double result = (2 > 1) ? 2 : 1.0;
    System.out.println(result);
    
    // 練習1: 獲取兩個整數的較大值
    int m = 10;
    int n = 20;

    int compare = (m > n) ? m : n;
    System.out.println("較大值為: " + compare);
    
    // 練習2: 獲取三個整數的最大值
    int i = 20;
    int j = 30;
    int k = 23;
    
    int tempMax = (i > j) ? i : j;
    int finalMax = (tempMax > k) ? tempMax : k;
    System.out.println("三個整數最大值為: " + finalMax);
    
  }
}
