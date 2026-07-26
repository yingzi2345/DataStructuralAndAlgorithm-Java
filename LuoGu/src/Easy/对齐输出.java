package Easy;

import java.util.Scanner;

public class 对齐输出 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%8d %8d %8d%n",a,b,c);//此处不能用println
        sc.close();
    }
}
