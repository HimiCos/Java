/*
如何从键盘获取不同类型（基本数据类型、String类型）的变量：使用Scanner类。

1. 键盘输入代码的四个步骤：
  1. 导包：`import java.util.Scanner;`
  2. 创建Scanner类型的对象：`Scanner scan = new Scanner(System.in);`
  3. 调用Scanner类的相关方法（`next() / nextXxx()`），来获取指定类型的变量
  4. 释放资源：`scan.close();`
  
2. 案例: 小明注册某交友网站，要求录入个人相关信息。如下：
   请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 
3. Scanner类中提供了获取byte \short \int \ long \float \double \boolean \String类型变量的方法。
   注意沒有提供獲取char類型變量的方法。需要使用next().charAt(0)
* */
package chapter03;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("請輸入你的網名: ");
    String name = scan.next();
    System.out.print("請輸入你的年齡: ");
    int age = scan.nextInt();
    System.out.print("請輸入你的體重: ");
    double weight = scan.nextDouble();
    System.out.print("請輸入你是否單身: ");
    boolean isSingle = scan.nextBoolean();
    System.out.print("請輸入你的性別: ");
    char gender = scan.next().charAt(0);
    System.out.println("你的基本情况如下：");
    System.out.println("网名：" + name + "\n年龄：" + age + "\n体重：" + weight +
      "\n单身：" + isSingle + "\n性别：" + gender);
    
    scan.close();
    
  }
}
