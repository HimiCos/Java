package chapter03;

public class ForForTest {
  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--){
      for (int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i = 1; i <= 9; i++) {
      
      for (int j =1 ; j <= i ; j++) {
        System.out.print(i + "*" + j + "=" + i * j + " ");
      }
      System.out.println();
    }
  }
}
