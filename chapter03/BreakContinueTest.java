package chapter03;

public class BreakContinueTest {
  public static void main(String[] args) {
    label:for (int j = 1; j <= 4; j++) {
      for (int i = 1; i <= 10; i++) {

        if (i % 4 == 0) {
          // break label;
          // continue;
          continue label;
        }

        System.out.print(i);
      }
    }
  }
}
