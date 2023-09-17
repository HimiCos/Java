/*
分支結構1: if-else 條件判斷結構

1. 格式
格式1:
if (條件表達式) {
  語句塊;
}

格式2:
if (條件表達式) {
  語句塊1;
} else {
  語句塊2;
}

格式3:
if (條件表達式) {
  語句塊1;
} else if (條件表達式2) {
  語句塊2;
}
...
} else if (條件表達式n) {
  語句塊n;
} else {
  語句塊n+1;
}

*/
package chapter03;

public class IfElseTest {
  public static void main(String[] args) {
    /*
    案例1:
    成年人心率的正常范围是每分钟60-100次。
    体检时，如果心率不在此范围内，则提示需要做进一步的检查。
    */
    int heartRate = 89;
    
    if ( heartRate >= 60 && heartRate <= 100 ) {
      System.out.println("心率正常");
    } else {
      System.out.println("需要進一步檢查");
    }
    // *********************************************
    
    /*
    案例2: 定义一个整数，判定是偶数还是奇数    
    * */
    
    int i1 = 87;
    if (i1 % 2 == 0){
      System.out.println(i1 +"是偶數");
    } else {
      System.out.println(i1 + "奇數");
    }
    
    // **********************************************
    /*
    案例3:
    岳小鹏参加Java考试，他和父亲岳不群达成承诺：
    如果：
    成绩为100分时，奖励一辆跑车；
    成绩为(80，99]时，奖励一辆山地自行车；
    当成绩为[60,80]时，奖励环球影城一日游；
    其它时，胖揍一顿。
    
    说明：默认成绩是在[0,100]范围内
    * */
    
    int grade = 61;
    
    // 無交集 順序可以隨便排
    /*if ( grade == 100 ) {
      System.out.println("奖励一辆跑车");
    } else if ( grade > 80 && grade <= 99) {
      System.out.println("奖励一辆山地自行车");
    } else if ( grade >= 60 && grade <= 80) {
      System.out.println("奖励环球影城一日游");
    } else {
      System.out.println("無獎勵");
    }*/
    
    // 範圍小的寫上面
    if ( grade == 100 ) {
      System.out.println("奖励一辆跑车");
    } else if ( grade > 80) {
      System.out.println("奖励一辆山地自行车");
    } else if ( grade >= 60) {
      System.out.println("奖励环球影城一日游");
    } else {
      System.out.println("無獎勵");
    }
  }
}
