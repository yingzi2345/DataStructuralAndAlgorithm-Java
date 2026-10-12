package middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 几乎唯一子数组的最大和 {
    public long maxSum(List<Integer> nums, int m, int k) {
        // 哈希表：记录窗口内数字出现频次
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        long maxAns = 0;
        int diffCnt = 0;//当前窗口不同数字的数量

        //初始化第一个窗口
        for (int i = 0; i < k; i++) {
            int num = nums.get(i);
            sum += num;
            //getOrDefault (要找的 key, 找不到时返回啥)
            //有 key 就拿 value，没 key 就拿默认值。
            if (freq.getOrDefault(num, 0) == 0) {
                //在添加这个数字之前，窗口中该数字出现次数为 0，也就是窗口没有这个数字，所以不同数字种类diffCnt++
                diffCnt++;
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            //拿到当前次数（不存在就0），次数+1，再存回map
        }
        //判断第一个窗口是否满足条件
        if (diffCnt >= m) {
            maxAns = sum;
        }

        //滑动窗口，从k位置一直到数组末尾
        for (int right = k; right < nums.size(); right++) {
            //移除左边的元素，nums[right-k]
            int leftNum = nums.get(right - k);
            freq.put(leftNum, freq.getOrDefault(leftNum, 0) - 1);
            if (freq.getOrDefault(leftNum, 0) == 0) {
                diffCnt--;
            }
            sum -= leftNum;

            //加入右边新元素： nums[right]
            int rightNum = nums.get(right);
            if (freq.getOrDefault(rightNum, 0) == 0) {
                diffCnt++;
            }
            freq.put(rightNum, freq.getOrDefault(rightNum, 0) + 1);
            sum += rightNum;

            //检查当前窗口是否符合条件，更新最大值
            if (diffCnt >= m) {
                if (sum > maxAns) {
                    maxAns = sum;
                }
            }
        }
        return maxAns;
    }

    public static void main(String[] args) {
        几乎唯一子数组的最大和 test = new 几乎唯一子数组的最大和();
        // 构建 List<Integer>
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(1);
        nums.add(7);
        long res = test.maxSum(nums, 3, 4);
        System.out.println(res);
    }
}
