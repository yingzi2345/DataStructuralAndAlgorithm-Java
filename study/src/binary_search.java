public class binary_search {
    public static Integer binarySearch(int[] arr, int item) {
        //二分查找
        int low = 0;
        int high = arr.length - 1;//-1

        while (low <= high) {
            // 计算中间下标，整除
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return guess;
            }
            if (guess > item) {
                // 中间值偏大，往左半边找
                high = mid - 1;
            } else {
                // 中间值偏小，往右半边找
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] my_list = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(my_list,3));
        System.out.println(binarySearch(my_list,-1));
    }
}
