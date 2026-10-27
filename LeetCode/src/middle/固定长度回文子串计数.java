package middle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 固定长度回文子串计数 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        String s = br.readLine();
        int count = 0;
        //i是起点，终点i+m-1，不超过n-1
        for (int i = 0; i <= n - m; i++) {
            boolean isPal = true;
            //双指针：l字串往左端偏移，r字串往右端偏移。
            for (int l = 0, r = m - 1; l < r; l++, r--) {
                char leftCh = s.charAt(i + l);
                char rightCh = s.charAt(i + r);
                if (leftCh != rightCh) {
                    isPal = false;
                    break;
                }
            }
            if (isPal) {
                count++;
            }
        }
        System.out.println(count);
    }
}
