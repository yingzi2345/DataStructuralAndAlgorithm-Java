package Easy;

import java.util.Arrays;

public class 多数元素 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {3, 2, 3};
        多数元素 obj = new 多数元素();
        int res1 = obj.majorityElement(nums1);
        System.out.println("结果1：" + res1);

        // 测试用例2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int res2 = obj.majorityElement(nums2);
        System.out.println("结果2：" + res2);
    }
}
