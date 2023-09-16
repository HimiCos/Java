package chapter02.practice;

public class p2 {
  public static void main(String[] args) {
    // 複習二進制
    // 1000 0000 -128
    // 0000 0001 1
    // 0010 1011 2^5 + 2^3 + 2^1 + 2^0 =  32 + 8 + 2 + 1 = 43
    // 50 --> 0011 0010
    
    // 複習運算符 + - + - * / % ++ ++ -- -- +
    
    // 除法
    int i1 = 12;
    int i2 = 5;
    int i3 = i1 / i2; // 2
    
    // 取模(取餘)
    int ii1 = 13;
    int ii2 = 5;
    int ii3 = ii1 % ii2;
    System.out.println(ii3); // 3
    
    // 練習1
    int iii1 = 78945;
    int ge = iii1 % 10;
    int shi = iii1 % 100 / 10;
    int bai = iii1 % 1000 / 100;
    int qian = iii1 % 10000 / 1000;
    int wan = iii1 % 100000 / 10000;

    System.out.println(ge);
    System.out.println(shi);
    System.out.println(bai);
    System.out.println(qian);
    System.out.println(wan);
    
    // 練習2
    int o1 = 89;
    int day = o1 / 24;
    int hour = o1 % 24;
    System.out.println("day: " + day + ", hour: " + hour);
    
    // 前++
    // 後++
    int e1 = 10;
//    int r1 = ++e1;
    int r1 = e1++;
    System.out.println(r1);
    
    // 前--
    // 後--
    int a1 = 10;
//    int b1 = a1--;
    int b1 = --a1;
    System.out.println(b1);
    
    // 練習
    int i = 1;
    int j = i++ + ++i * i++;
    System.out.println("j = " + j);
    
  }
}

class ArithmeticExer3{
  public static void main(String[] args){
    int i1 = 10;
    int i2 = 20;
    int i = i1++;
    System.out.print("i="+i); // 10
    System.out.println(" i1="+i1);// 11
    i = ++i1;
    System.out.print("i="+i);// 12
    System.out.println(" i1="+i1);// 12
    i = i2--;
    System.out.print("i="+i);// 20
    System.out.println(" i2="+i2);// 19
    i = --i2;
    System.out.print("i="+i);// 18
    System.out.println(" i2="+i2);// 18
  }
}
