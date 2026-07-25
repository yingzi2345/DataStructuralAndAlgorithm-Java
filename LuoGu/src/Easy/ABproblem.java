package Easy;

import java.util.Scanner;

public class ABproblem {
    public static void main(String[] args) {
        //输入两个整数 a,b，输出它们的和。
        //
        //注意：
        //
        //Pascal 使用 integer 会爆掉哦！
        //有负数哦！
        //C/C++ 的 main 函数必须是 int 类型。程序正常结束时的返回值必须是 0。这不仅对洛谷其他题目有效，而且也是 NOIP/CSP/NOI 比赛的要求！
        Scanner number = new Scanner(System.in);
        int a = number.nextInt(), b = number.nextInt();
        System.out.println(a + b);
    }
}
