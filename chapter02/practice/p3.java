package chapter02.practice;

public class p3 {
  public static void main(String[] args) {
    double i = 1;
    i = i * 0.1;
    System.out.println(i);


    boolean b1 = false;
    // 区分好==和=的区别。
    if(b1 == true)  //if(b1 = true)
      System.out.println("结果为真");
    else
      System.out.println("结果为假");
  }
}
