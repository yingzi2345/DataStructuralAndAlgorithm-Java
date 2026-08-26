package Easy;

public class 回文数 {

    public boolean isPalindrome(int x) {
        //方法一：反转字符串
        /*if (x < 0) return false;//负数直接false
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;*/

        //方法二：反转后半段，不反转全部
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseHash = 0;
        //当原数 > 反转后的数，说明还没走到一半
        while (x > reverseHash) {
            reverseHash = reverseHash * 10 + x % 10;
            x = x / 10;
        }
        //偶数位：x == reverseHalf；奇数位：reverseHalf/10去掉中间数字
        return x == reverseHash || x == reverseHash / 10;
    }

    public static void main(String[] args) {
        回文数 test = new 回文数();
        System.out.println(test.isPalindrome(121));
        System.out.println(test.isPalindrome(-121));
        System.out.println(test.isPalindrome(10));
        System.out.println(test.isPalindrome(22));
        System.out.println(test.isPalindrome(0110));
    }
}
