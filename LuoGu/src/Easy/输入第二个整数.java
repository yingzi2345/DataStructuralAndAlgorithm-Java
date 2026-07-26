package Easy;

import java.util.Scanner;

/*题目描述
输入三个整数，整数之间由一个空格分隔。把第二个输入的整数输出。

输入格式
只有一行，共三个整数，整数之间由一个空格分隔。

输出格式
只有一行，一个整数，即输入的第二个整数。

输入输出样例
输入
123 456 789
输出
456*/
public class 输入第二个整数 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //输出第二个数
        System.out.println(b);
        sc.close();
    }
}
