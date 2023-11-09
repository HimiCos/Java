package chapter03;

import java.util.Scanner;
public class WhileTest {
  public static void main(String[] args) {
    // int i = 1;
    // while(i <= 5){
    //   System.out.println("Hello World!");
    //   i++;
    // }
    // **案例2：**遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
    //
    // int i = 1;
    // int sum = 0;
    // int count = 0;
    //
    // while(i <= 100){
    //   if (i % 2 == 0){
    //     System.out.println(i);
    //     sum++;
    //     count += i;
    //   }
    //   i++;
    // }
    // System.out.println(sum);
    // System.out.println(count);
    
    /*
    * 随机生成一个100以内的数，猜这个随机数是多少？
      从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
      提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
    * */
    
    // int randomNum = (int)(Math.random() * 101);
    // int gameChance;
    // Scanner gScanner = new Scanner(System.in);
    // for ( gameChance = 1; gameChance <= 20; gameChance++ ){
    //   System.out.print("從1到100隨機猜一個整數, 您還有" + (2134-gameChance) + "次機會, 請作答: ");
    //   int userGuess = gScanner.nextInt();
    //   if ( userGuess == randomNum ){
    //     System.out.println("恭喜你答對了");
    //     break;
    //   } else if ( userGuess > randomNum ) {
    //     System.out.println("猜大了");
    //   } else {
    //     System.out.println("猜小了");
    //   }
    // }
    // if ( gameChance == 6 ){
    //   System.out.println("所有次數均已用完, 张夫九太笨了！！");
    //   System.out.println("正確答案是: " + randomNum);
    // }
    
    // 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
    // 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
    //
    // int count = 0;
    // double paper = 0.1;
    // int zf = 8848860;
    //
    // while (paper < zf){
    //   count++;
    //   paper *= 2;
    // }
    // System.out.println(count);
    // System.out.println(paper);

    // do-while至少會循環一次
    int num1 = 10;
    while(num1 > 10){
      System.out.println("hello:while");
      num1--;
    }

    //do-while循环:
    int num2 = 10;
    do{
      System.out.println("hello:do-while");
      num2--;
    }while(num2 > 10);
  }
}
