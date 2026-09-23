package Easy;

import java.util.Arrays;

public class 早餐组合 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {

        final int MOD = 1000000007;
        long ans = 0;

        /*       //方法一：排序主食+二分
         //对主食进行排序。
        Arrays.sort(staple);
        for (int s : staple) {
            int remain = x - s;
            if (remain < 0) {
                continue;
            }
            //二分查找drinks中<=remain的元素个数
            int left = 0, right = drinks.length - 1;
            int cnt = 0;//满足条件的饮品数量
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (drinks[mid] <= remain) {
                    cnt = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            ans += cnt;
        }
        return (int) (ans % MOD);
         */


        //方法二：排序+双指针
        //对主食and饮料进行排序。
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i = 0;
        int j = drinks.length - 1;
        while (i < staple.length && j >= 0) {
            if (staple[i] + drinks[j] <= x) {
                ans += j + 1;
                i++;
            } else {
                j--;
            }
        }
        return (int) (ans % MOD);
    }

    public static void main(String[] args) {
        早餐组合 test = new 早餐组合();
        int[] staple = new int[]{10, 20, 5};
        int[] drinks = new int[]{5, 5, 2};
        int x = 15;
        System.out.println(test.breakfastNumber(staple, drinks, x));
    }
}
