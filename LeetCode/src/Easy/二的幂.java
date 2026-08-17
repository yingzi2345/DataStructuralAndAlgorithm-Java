package Easy;

public class 二的幂 {

    public boolean isPowerOfTwo(int n) {
        /*// 小于等于0直接不是
        if (n <= 0) {
            return false;
        }
        // 只要是偶数就一直除以2
        while (n % 2 == 0) {
            n = n / 2;
        }
        //最后剩下1，就是2的幂
        return n == 1;*/

        //-----------进阶写法------------
        return n>0 &&(n&(n-1))==0;
    }

    public static void main(String[] args) {
        二的幂 test = new 二的幂();
        System.out.println(test.isPowerOfTwo(1));   // true
        System.out.println(test.isPowerOfTwo(16));  // true
        System.out.println(test.isPowerOfTwo(3));   // false
        System.out.println(test.isPowerOfTwo(-4));  // false

    }
}
