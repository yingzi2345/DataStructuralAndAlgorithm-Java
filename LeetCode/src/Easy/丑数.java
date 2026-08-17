package Easy;

public class 丑数 {

    public boolean isUgly(int n) {
        // 负数和0直接false
        if (n <= 0) {
            return false;
        }
        // 把2除干净
        while (n % 2 == 0) {
            n = n / 2;
        }
        // 把3除干净
        while (n % 3 == 0) {
            n = n / 3;
        }
        // 把5除干净
        while (n % 5 == 0) {
            n = n / 5;
        }
        // 剩下等于1就是丑数
        return n == 1;
    }

    public static void main(String[] args) {
        丑数 test = new 丑数();
        System.out.println(test.isUgly(6));   // true
        System.out.println(test.isUgly(1));   // true
        System.out.println(test.isUgly(14));  // false
        System.out.println(test.isUgly(-2));  // false
    }
}
