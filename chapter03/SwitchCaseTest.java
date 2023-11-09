/*
1. 表達式
switch(表达式){
    case 常量值1:
        语句块1;
        //break;
    case 常量值2:
        语句块2;
        //break; 
    // ...
   default:
        语句块n+1;
        break;
} 
2. 执行过程:

第1步：根据switch中表达式的值，依次匹配各个case。如果表达式的值等于某个case中的常量值，则执行对应case中的执行语句。

第2步：执行完此case的执行语句以后，
          情况1：如果遇到break,则执行break并跳出当前的switch-case结构
	        情况2：如果没有遇到break，则会继续执行当前case之后的其它case中的执行语句。--->case穿透
	        ...
	        直到遇到break关键字或执行完所有的case及default的执行语句，跳出当前的switch-case结构

3. 使用注意点: 

- switch(表达式)中表达式的值必须是下述几种类型之一：byte，short，char，int，枚举 (jdk 5.0)，String (jdk 7.0)；

- case子句中的值必须是常量，不能是变量名或不确定的表达式值或范围；

- 同一个switch语句，所有case子句中的常量值互不相同；

- break语句用来在执行完一个case分支后使程序跳出switch语句块；

  如果没有break，程序会顺序执行到switch结尾；

- default子句是可选的。同时，位置也是灵活的。当没有匹配的case时，执行default语句。
* */
package chapter03;

public class SwitchCaseTest {
  public static void main(String[] args) {
    int num = 1;
    switch (num) {
      case 0:
        System.out.println("zero");
        break;
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      default:
        System.out.println("other");
        break;
    }
  }
}
