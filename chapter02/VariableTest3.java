/*
* 測試基本數據類型變量間的運算規則
* 
* 1. 這裡提到可以做運算的基本數類型有7種, 不包含布爾類型
* 2. 運算規則包括:
*       1> 自動類型提升
*       2> 強制類型轉換
* 3. 此文件用來測試自動類型提升
* 規則: 當容量小的變量與容量大的變量做運算時, 結果自動轉換為容量大的數據類型。
* 
*       byte、short、char ---> int ---> long ---> float ---> double
*       特別的: byte、short、char類型的變量之間做運算, 結果為int類型
* 
* 說明: 此時的容量小或大，並非指占用的內存空間的大小，而是指表示數據的範圍的大小
*       long (8字節)    float (4字節)
*/
package chapter02;

public class VariableTest3 {
  public static void main(String[] args) {
    int i1 = 10;
    int i2 = i1;
    
    long l1 = i1;
    
    float f1 = l1;
    
    byte b1 = 12;
    int i3 = i1 + b1;
    // 編譯不通過
    // byte b2 = i1 + b1;
    
    
    // ****************************************
    // 特殊的情況 1: byte 和 short 需要使用int..
    byte b2 = 10;
    short s1 = 20;
    // 編譯不通過
    // short s2 = b2 + s1;
    int i4 = b2 + s1;
    
    // byte 和 byte 需要使用int..
    // short 和 short 也需要使用int..
    byte b3 = 11;
    byte b4 = 15;
    // 編譯不通過
    // byte b5 = b3 + b4;
    int s2 = b3 + b4;
    
    int i5 = 2147483647;
    int i6 = 2147483647;
    int i7 = i5 + i6;
    System.out.println(i7); // -2

    // 特殊的情況 2: char
    char c1 = 'a';
    // 編譯不通過
    // char c2 = c1 + b1;
    int i8 = c1 + b1;
    
    
    // ****************************************
    // 練習1:
    long l2 = 123L;
    long l3 = 123; // 理解為: 自動類型提升 (int ---> long)
    // long l4 = 123123123123; // 理解為int類型, 因為超出可int範圍, 所以報錯
    long l5 = 123123123123L;
    
    // 練習2: 
    float f2 = 12.3F;
    // 編譯不通過
    // float f3 = 12.3; // 不滿足自動提升的規則, 所以報錯
    
    // 練習3:
    byte b6 = 10;
    // 規定1: 整型常量, 規定為是int類型
    // byte b7 = b6 + 1; // 編譯不通過
    int i9 = b6 + 1;
    // 規定2: 浮點型常量, 規定為是double類型
    // float f3 = b6 + 12.5; // 編譯不通過
    double d1 = b6 + 12.5;
    
    // 練習4: 說明為什麼不允許變量名是數字開頭, 為了防止"自洽"
    /*
    * int 123L = 12;
    * long l6 = 123L;
    */
  }
}









