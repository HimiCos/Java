package Project.GuLiAccount;

public class GuliAccount {
  public static void main(String[] args) {
    
    while(true){
      System.out.println("-----------------穀粒記帳軟件-----------------\n");
      System.out.println("                 1 收支明細");
      System.out.println("                 2 登陸收入");
      System.out.println("                 3 登陸支出");
      System.out.println("                 4 退   出\n");
      System.out.println("                 請選擇(1-4)");

      char selection = Utility.readMenuSelection();
      
      switch(selection){
        case '1':
          System.out.println("收支明細");
          break;
        case '2':
          System.out.println("登記收入");
          break;
        case '3':
          System.out.println("登記支出");
          break;
        case '4':
          System.out.println("退出");
          break;
      }
    }
  }
}
