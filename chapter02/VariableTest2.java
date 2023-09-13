package chapter02;

public class VariableTest2 {
  public static void main(String[] args) {
    // 1.字符類型
    // char(占用2字節)
    char c1 = 'c';
    // 表示形式二
    char c2 = '\u0036';
    System.out.println(c2);
    // 表示形式三
    char c3 = '\n';
    char c4 = '\t';
    System.out.println("Hello" + c3 + "World");
    // 表示形式四
    char c5 = 97;
    System.out.println(c5); //a
    
    // 2. 布爾類型
    boolean bo1 = true;
    boolean bo2 = false;
    
    boolean isMarried = true;
    if (isMarried){
      System.out.println("很遺憾, 不能參加單身派對了");
    } else {
      System.out.println("可以多談幾個女朋友或男朋友");
    }
  }
}
