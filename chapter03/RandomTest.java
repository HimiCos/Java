/*
如何生成一個隨機數？

1. 可以使用Java提供的Api: Math類的random()
2. random()調用後, 會返回一個[0.0,1.0)範圍的double型的隨機數 
3. 需求1: 獲取一個[0,100]範圍的隨機整數?
   需求2: 獲取一個[1,100]範圍的隨機整數?
4. 需求3: 獲取一個[a,b]範圍的隨機整數?
   (int)(Math.random() * (b - a + 1)) + a

*/
package chapter03;

public class RandomTest {
  public static void main(String[] args) {
    double d1 = Math.random();
    System.out.println("d1" + d1);
    
    int num1 = (int)(Math.random() * 101);
    System.out.println(num1);

    int num2 = (int)(Math.random() * 100)+1;
    System.out.println(num2);
  }
}
