package middle;

import java.util.Arrays;

public class 半径为k的子数组平均值 {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;//n：数组长度
        int[] res = new int[n];//存放答案的数组res
        long sum = 0;//注意用long防止溢出。
        int windowSize = 2 * k + 1;//窗口大小

        //初始化结果，默认全部为-1
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        //如果窗口比数组还大，直接返回res
        if (windowSize > n) {
            return res;
        }
        //第一步：计算第一个窗口总和
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }
        //第一个中心位置：k
        res[k] = (int) (sum / windowSize);

        //第二步：滑动窗口，right从 windowSize 开始（下一个新的右边界）
        for(int right = windowSize; right < n; right++){
            // 窗口向右挪一格：丢掉窗口最左边元素，加入新的right元素
            sum = sum - nums[right - windowSize] + nums[right];
            // 算出当前这个窗口对应的中心位置
            int center = right - k;
            res[center] = (int)(sum / windowSize);
        }
        return res;
    }

    public static void main(String[] args) {
        半径为k的子数组平均值 test = new 半径为k的子数组平均值();
        int[] nums = new int[]{7,4,3,9,1,8,5,2,6};
        int res[] = test.getAverages(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}
