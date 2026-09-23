package middle;

public class 大小为K且平均值大于等于阈值的子数组数目 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        long sum = 0;//存当前窗口里面所有数字的总和
        int count = 0;//计数器，记录满足条件的窗口一共有多少个
        //计算目标总和target = k * threshold，窗口总和只要≥target就符合条件
        int target = k * threshold;

        //初始化第一个窗口
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= target) {
            count++;
        }
        //窗口向右边滑动
        for (int right = k; right < n; right++) {
            sum = sum - arr[right - k] + arr[right];
            if (sum >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        大小为K且平均值大于等于阈值的子数组数目 test = new 大小为K且平均值大于等于阈值的子数组数目();
        int[] arr = new int[]{2, 2, 2, 2, 5, 5, 5, 8};
        int res = test.numOfSubarrays(arr, 3, 4);
        System.out.println(res);

        int[] arr1 = new int[]{11,13,17,23,29,31,7,5,2,3};
        int res1 = test.numOfSubarrays(arr1, 3, 5);
        System.out.println(res1);

    }
}
