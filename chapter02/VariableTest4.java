/*
* 此文件用來測試強制類型轉換
* 
* 規則:
* 1. 如果需要將容量大的變量的類型轉換成容量小的變量的類型, 需要使用強制轉換類型
* 2. 強制轉換需要使用強轉符 int i1 = (long)l1
* 3. 強制類型轉換過程中, 可能存在精度損失的問題
*/
package chapter02;

public class VariableTest4 {
  public static void main(String[] args) {
    
    double d1 = 12; // 存在類型提升
    
    // int i1 = d1; // 編譯失敗
    
    int i2 = (int)d1;
    System.out.println(i2);
    
    long l1 = 123;
    // short s1 = l1; // 編譯不通過
    short s2 = (short)l1;
    System.out.println(s2);
    
    // 練習
    int i3 = 12;
    float f1 = i3;
    System.out.println(f1);
    
    float f2 = (float)i3; // 編譯可以通過, 只不過可以省略(), 因為有自動提升變量
    
    // 強制轉換精度損失
    // 例子1:
    int i4 = 128;
    byte b1 = (byte)i4;
    System.out.println("@@ " + b1);
    
    // 例子2:
    double d2 = 12.9;
    int i5 = (int)d2;
    System.out.println(i5);
    
    // 實際開發舉例
    byte b2 = 12;
    method(b2);
    
    long l2 = 12;
    // method(l2) //編譯不通過
    method((int)l2);
  }
  public static void method(int num){  // int num = b2; 自動類型提升
    System.out.println("num = " + num);
  }
}
