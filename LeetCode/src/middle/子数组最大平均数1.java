package middle;

public class 子数组最大平均数1 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        //初始化第一个窗口，计算前k个数之和
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        //滑动窗口
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];//关键！i-k是挤出去的数字，nums[i]是右边新进来的数字
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        //总和转double再除以k，得到平均数
        return (double) maxSum / k;//最后转double，如果一开始就转，会多一点浮点运算。
    }

    public static void main(String[] args) {
        子数组最大平均数1 test = new 子数组最大平均数1();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        System.out.println(test.findMaxAverage(nums, 4));

        int[] nums2 = new int[]{5};
        System.out.println(test.findMaxAverage(nums2, 1));
    }
}
