package chapter03;

public class ForExerTwo {
  public static void main(String[] args) {
    // int m = 12, n = 20;
    // int min = (m < n) ? m : n;
    // for (int i = min; i>= 1; i--){
    //   if (m % i == 0 && n % i == 0){
    //     System.out.println("兩數最小公倍數是: " + i);
    //     break;
    //   }
    // }
    // 打印出四位数字中“个位+百位”等于“十位+千位”并且个位数为偶数，千位数为奇数的数字，并打印符合条件的数字的个数。
    // 1122 aabb
    // for (int i = 1000; i < 10000; i++){
    //   int one = i % 10;
    //   int ten = i / 10 % 10;
    //   int hundred = i / 100 % 10;
    //   int thousand = i / 1000 % 10;
    //   if ( one + hundred == ten + thousand && one % 2 == 0 && thousand % 2 != 0){
    //     System.out.println(i);
    //   }
    // }
    // **打印1~100之间所有是7的倍数的整数的个数及总和 (体会设置计数器的思想)
    
    // int item = 0;
    // int count = 0;
    //
    // for(int i = 1; i <= 100; i++){
    //   if (i % 7 == 0){
    //     item++;
    //     count += i;
    //   }
    // }
    // System.out.println(item);
    // System.out.println(count);
    //
    
    // 编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
    
    for (int i = 1; i <= 150; i++){
      if ( i % 3 == 0 ){
        System.out.println(i + "foo");
      } else if ( i % 5 == 0 ) {
        System.out.println(i + "biz");
      } else if ( i % 7 == 0 ) {
        System.out.println(i + "baz");
      } else {
        System.out.println(i + "nothing");
      }
    }
    
    
  }
}
