package chapter03;

public class PrimeNumberTest1 {
  public static void main(String[] args) {
    
    // 獲取系統當前時間
    long start = System.currentTimeMillis();
    int count = 0;
    
    l:for (int i = 2; i <= 100000; i++){
      for (int j = 2; j <= Math.sqrt(i); j++){
        if (i % j == 0){
          continue l;
        }
      }
      count++;
    }
    long end = System.currentTimeMillis();
    System.out.println("質數總共有"+ count + "個");
    System.out.println("程序耗時" + (end - start) + "ms");
  }
}
