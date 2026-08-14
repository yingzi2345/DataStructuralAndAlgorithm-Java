package Easy;

public class 好数对的数目 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        // i是第一个下标
        for (int i = 0; i < nums.length; i++) {
            // j一定比i大，j从i+1开始
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        好数对的数目 obj = new 好数对的数目();

        int[] arr1 = {1, 2, 3, 1, 1, 3};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {1, 2, 3};

        System.out.println(obj.numIdenticalPairs(arr1));
        System.out.println(obj.numIdenticalPairs(arr2));
        System.out.println(obj.numIdenticalPairs(arr3));
    }
}
