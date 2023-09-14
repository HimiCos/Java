/*
* 基本數據類型與String的運算
* 一、關於String的理解
* 1. String類, 屬於引用數據類型, 俗稱字符串
* 2. String類型的變量, 可以使用一對""的方式進行賦值
* 3. String聲明的字符串內部, 可以包含0個, 1個或多個字符
* 
* 二、String與基本數據類型變量間的運算
* 1. 這的基本數據類型包括boolean在內的8種
* 2. String與基本數據類型變量間只能做連接運算, 使用"+"表示
* 3. 運算的結果是String類型
*/
package chapter02;

public class StringTest {
  public static void main(String[] args) {
    String str1 = "Hello World!";
    System.out.println(str1);
    
    String str2 = "";
    String str3 = "a";
    char c1 = 'a';
    
    // 測試連接運算
    int num1 = 10;
    boolean b1 = true;
    String str4 = "Hello";
    
    System.out.println(str4 + b1);
    
    String str5 = str4 + b1;
    String str6 = str4 + b1 + num1;

    System.out.println(str6);
    
    // 思考: 如下的聲明 編譯能通過名?
    // String str7 = b1 + num1 + str4; //編譯不通過
    // 必須是String與其他基本數據類型變量間做運算
    
    
    // 如何將String類型的變量轉換為基本數據類型?
    String str8 = "abc"; // 不能考慮轉換為基本數據類型

    int num2 = 10;
    String str7 = num2 + ""; // "10"
    System.out.println(str7 + 1);
    // int num3 = (int)str7; // 編譯不通過
    
    // 如何實現呢? 使用Integer類
    int num3 = Integer.parseInt(str7);
    System.out.println(num3 + 1);
  }
}






