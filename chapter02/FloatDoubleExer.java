package chapter02;

public class FloatDoubleExer {
  public static void main(String[] args) {
    // 定義圓周率變量
    double pi = 3.14;

    // 定義三個圓的半徑
    double radius1 = 1.2;
    double radius2 = 2.5;
    int radius3 = 6;

    // 計算面積
    double area1 = pi * radius1 * radius1;
    double area2 = pi * radius2 * radius2;
    double area3 = pi * radius3 * radius3;

    System.out.println("area1 = " + area1);
    System.out.println("area2 = " + area2);
    System.out.println("area3 = " + area3);

  }
}
