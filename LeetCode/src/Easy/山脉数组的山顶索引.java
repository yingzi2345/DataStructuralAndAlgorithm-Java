package Easy;

public class 山脉数组的山顶索引 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;//左右区间

        while (left<right){
            int mid = left +(right - left)/2;//不用（left+right）/2:防止int溢出
            if (arr[mid]<arr[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;// left or right, same result;
    }

    public static void main(String[] args) {
        山脉数组的山顶索引 test = new 山脉数组的山顶索引();
        int[] arr1 = {0, 1, 0};
        System.out.println(test.peakIndexInMountainArray(arr1)); //1

        int[] arr2 = {0, 2, 1, 0};
        System.out.println(test.peakIndexInMountainArray(arr2)); //1

        int[] arr3 = {0, 1, 5, 2};
        System.out.println(test.peakIndexInMountainArray(arr3)); //2
    }
}
