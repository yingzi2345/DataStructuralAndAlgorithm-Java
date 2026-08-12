package Easy;

class Solution26081201 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}

public class 最小偶倍数 {
    public static void main(String[] args) {
        Solution26081201 solution2 = new Solution26081201();
        System.out.println(solution2.smallestEvenMultiple(5));
        System.out.println(solution2.smallestEvenMultiple(6));
        System.out.println(solution2.smallestEvenMultiple(87));
    }
}
