/*
* 測試運算符的使用3: 比較運算符
* 
* 1. ==  !=  >  <  >=  <=  instanceof
* 
* 2. 說明
*   1> instanceof 在面向對象的多態性的位置提及
*   2> ==  !=  >  <  >=  <= 適用與基本數據類型 結果為boolean類型
*   3> 了解: ==  !== 可以適用與引用數據類型 String...
*   4> 區分: == 與 = 不相等
* 
*/
package chapter02;

public class CompareTest {
  public static void main(String[] args) {
    int m1 = 10;
    int m2 = 20;
    boolean compare1 = m1 > m2;
    System.out.println(compare1); // false
    
    int n1 = 10;
    int n2 = 20;
    System.out.println(n1 == n2); // false
    System.out.println(n1 = n2); // 20
    
    boolean b1 = false;
    boolean b2 = true;
    System.out.println(b1 == b2); // false
    System.out.println(b1 = b2); // true
    
  }
}
