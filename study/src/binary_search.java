import javax.swing.text.Highlighter;

public class binary_search {
    public static Integer binarySearch(int[] arr, int item) {

        //二分查找*2
        int low = 0;
        int high = arr.length - 1;//因为是下标，所以-1

        while (low <= high) {
            // 计算中间下标，整除
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return guess;
            }
            if (guess > item) {
                //中间值偏大,往小的找
                high = mid - 1;
            } else {
                //否则中间值偏小，往大的找
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] my_list = {1, 3, 5, 7, 9};//数组必须是有序的
        System.out.println(binarySearch2(my_list, 3));
        System.out.println(binarySearch2(my_list, -1));
    }


    //----------------返回下标的形式-------------------
    public static int binarySearch2(int[] arr, int itme) {
        int lo = 0;
        int h = arr.length - 1;
        while (lo <= h) {
            int midd = (lo + h) / 2;
            int guesss = arr[midd];
            if (guesss == itme) {
                return midd;
            } else if (guesss > itme) {
                h = midd - 1;
            } else {
                lo = midd + 1;
            }

        }
        return -1;
    }


}
