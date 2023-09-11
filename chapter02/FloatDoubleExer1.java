package chapter02;

public class FloatDoubleExer1 {
  public static void main(String[] args) {
    // 定義華氏溫度
    double Fahrenheit = 80.0;

    // 計算攝氏溫度
    double Centigrade = (Fahrenheit - 32) / 1.8 ;

    System.out.println("華氏度: " + Fahrenheit + ", 對應的攝氏度: " + Centigrade);
  }
}
