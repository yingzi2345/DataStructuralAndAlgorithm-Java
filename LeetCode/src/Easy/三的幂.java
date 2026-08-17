package Easy;

public class 三的幂 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        三的幂 test = new 三的幂();
        System.out.println(test.isPowerOfThree(27));  // true 3^3
        System.out.println(test.isPowerOfThree(0));   // false
        System.out.println(test.isPowerOfThree(9));   // true
        System.out.println(test.isPowerOfThree(10));  // false
        System.out.println(test.isPowerOfThree(1));   // true 3^0
    }
}
