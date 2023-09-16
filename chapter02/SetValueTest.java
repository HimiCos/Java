/*
* 測試運算符的使用2: 賦值運算符
* 1. = += -= *= /= %=
* 
* 2. 說明
* - 当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
* - 支持`连续赋值`。
* - = += -= *= /= %= 這些操作不會改變變量本身的數據類型
*/
package chapter02;

public class SetValueTest {
  public static void main(String[] args) {
    int i = 5;
    
    int l = 10; // 自動類型提升
    byte b = (byte)i; // 強制類型轉換

    // 操作方法一:
    // int a = 10;
    // int c = 10;
    
    // 操作方法二: 連續賦值
    int a;
    int c;
    // 或合併: int a,c;
    a = c = 10;
    
    // 操作方式三:
    int a3 = 10,b3 = 20;
    
    // *****************************
    // +=
    int m1 = 10;
    m1 += 5; // 類似於 m1 = m1 + 5;
    System.out.println(m1);
    
    int by1 = 10;
    by1 += 5; // 不等於 by1 = by1 + 5; // 編譯不通過
    System.out.println(by1);
    
    int m2 = 1;
    m2 *= 0.1; // m2 = (int)(m2 * 0.1);
    System.out.println(m2);
    
    // 練習1: 如何實現變量的值增加2
    // 方式一:
    int n1 = 10;
    n1 = n1 + 2;
    
    // 方式二: 推薦
    int n2 = 10;
    n2 += 2;
    
    // 練習2: 如何實現變量的值加1
    // 方式一: 
    int i1 = 10;
    i1 = i1 + 1;

    // 方式二: 
    int i2 = 10;
    i2 += 1;
    
    // 方式三: 推薦
    int i3 = 10;
    i3++; //++i3;
  }
}
