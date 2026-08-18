package Easy;

public class 重新排列数组 {
    public int[] shuffle(int[] nums, int n) {
        // 创建结果数组，长度 2n
        int[] res = new int[2 * n];
        // i遍历前n个元素（x1~xn）
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];// 偶数位置放x
            res[2 * i + 1] = nums[n + i];//奇数位置放y
        }
        return res;
    }

    public static void main(String[] args) {
        重新排列数组 test = new 重新排列数组();
        int[] arr1 = {2, 5, 1, 3, 4, 7};
        int[] ans1 = test.shuffle(arr1, 3);
        for (int x : ans1) {
            System.out.print(x + " "); // 2 3 5 4 1 7
        }
    }
}
