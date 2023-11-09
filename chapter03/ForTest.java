/*

1. Java中規範了3種循環結構: for 、while、do-while
2. 凡是循環結構, 就一定會有4個要素:
- 初始化部分
- 循环条件部分
- 循环体部分
- 迭代部分 
3. for循環的格式
for (①初始化部分; ②循环条件部分; ④迭代部分)｛
         	③循环体部分;
｝
执行过程：①-②-③-④-②-③-④-②-③-④-.....-②

*/
package chapter03;

public class ForTest {
  public static void main(String[] args) {
    // 輸出5行HelloWorld
    for (int i = 1; i <= 5; i++){
      System.out.println("HelloWorld");
    }
    int num = 1;
    for(System.out.print("a");num < 3;System.out.print("c"),num++){
      System.out.print("b");
    } //abcbc
    
    // 遍歷從1-100的偶數
    // for (int i = 0; i <= 100; i+=2){
    //   System.out.println(i);
    // }
    int item = 0;
    int count = 0;
    for (int i = 1; i <= 100; i++){
      if (i % 2 == 0){
        // System.out.println(i);
        item++;
        count += i;
      }
    }
    // System.out.println(item);
    // System.out.println(count);
    
    for (int i = 100; i < 1000; i++){
      int one = i % 10;
      int ten = i / 10 % 10;
      int hundred = i / 100;
      
      if ((one * one * one + ten * ten * ten + hundred * hundred * hundred) == i){
        System.out.println("水仙花數有: " + i);
      }
    }
  }
}
