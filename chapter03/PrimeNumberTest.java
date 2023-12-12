package chapter03;

public class PrimeNumberTest {
  public static void main(String[] args) {
    int count = 0;
    l:for (int i = 2; i <= 100; i++){
      for (int j = 2; j < i; j++){
        if (i % j == 0){
          continue l;
        }
      }
      System.out.print(i + " ");
      count++;
    }
    System.out.println();
    System.out.println("質數總共有"+ count + "個");
  }
}
