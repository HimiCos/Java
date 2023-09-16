/*
* 測試運算符的使用4: 邏輯運算符
* 
* 1. &  &&  |  ||  !  ^
* 
* 2. 說明:
*   1> 邏輯運算符針對的都是boolean類型的變量進行的操作
*   2> 邏輯運算符運算的結果也是boolean類型
*   3> 邏輯運算符常使用條件判斷結構、循環結構中
* 
*/

package chapter02;

public class LogicTest {
  public static void main(String[] args) {
    
    /* 
    * 區分 & 與 &&
    * 
    * 1. 相同點: 兩個符號表達的都是"且"的關係, 只有當符號左右兩邊的類型值均為true時, 結果為true
    * 
    * 2. 執行過程: 
    *   1> 如果符號左邊是true, 則 &、&& 都會執行符號右邊的操作
    *   2> 如果符號左邊為false, 僅有 & 會執行符號右邊的操作
    * 3. 開發中, 推薦使用 &&
    * 
    */
    
    // &
    boolean b1 = true;
    b1 = false;
    int num1 = 10;
    if (b1 & (num1++ > 0)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.println("num1 = " + num1); // 11
    
    // && 短路
    boolean b2 = true;
    b2 = false;
    int num2 = 10;
    if (b2 && (num2++ > 0)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.println("num2 = " + num2); // 10
    
    // *********************************************

    /*
    * 區分 | 與 ||
    *
    * 1. 相同點: 兩個符號表達的都是"或"的關係, 只要符號左右兩邊任意一個類型值為true, 結果都為true
    *
    * 2. 執行過程:
    *   1> 如果符號左邊是true, 僅有 | 會執行符號右邊的操作
    *   2> 如果符號左邊為false, 則 |、|| 都會執行符號右邊的操作
    * 3. 開發中, 推薦使用 ||
    *
    */
    
    // |
    boolean b3 = false;
    b3 = true;
    int num3 = 10;
    if (b3 | (num3++ > 0)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.println("num3 = " + num3); // 11

    // || 短路
    boolean b4 = false;
    b4 = true;
    int num4 = 10;
    if (b4 || (num4++ > 0)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.println("num4 = " + num4); // 10
  }
}
