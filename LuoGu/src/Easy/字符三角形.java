package Easy;

import java.util.Scanner;

public class 字符三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();  //输入的是字符串类型
        //循环三层
        for (int i = 0; i < 3; i++) {
            //打印空格
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(N);
            }
            //换行
            System.out.println();
        }
    }
}
