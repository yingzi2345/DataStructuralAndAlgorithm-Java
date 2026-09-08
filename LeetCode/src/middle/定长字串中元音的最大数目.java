package middle;

public class 定长字串中元音的最大数目 {

    //简单写法：私有调用
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        //标记出哪些字母是元音：
        /*boolean[] vowel = new boolean[26];
        vowel['a' - 'a'] = true;
        vowel['e' - 'a'] = true;
        vowel['i' - 'a'] = true;
        vowel['o' - 'a'] = true;
        vowel['u' - 'a'] = true;*/


        int count = 0;//当前窗口的元音数量。

        // =========第一步：先把第一个窗口装满============
        //前k个字符，统计元音数量
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        int max = count;//最大元音数量
        // =========第二步：窗口不断向右滑动============
        for (int i = k; i < s.length(); i++) {
            //扔掉窗口最左边的字符;下标i-k
            char outChar = s.charAt(i - k);
            if (isVowel(outChar)) {
                count--;//如果扔出去的是元音，总数减1
            }
            //接纳右边新进来的字符，下标i
            char inChar = s.charAt(i);
            if (isVowel(inChar)) {
                count++;//如果进来的是元音字母，总数加1
            }
            //更新最大数量
            if (count > max) {
                max = count;
            }
            //优化：如果元音数量等于窗口数量，直接返回。
            if (max == k) {
                return k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        定长字串中元音的最大数目 test = new 定长字串中元音的最大数目();
        String s1 = "aeiou";
        int res1 = test.maxVowels(s1, 2);
        System.out.println(res1);

        String s2 = "abciiidef";
        int res2 = test.maxVowels(s2, 3);
        System.out.println(res2);

        String s3 = "lseaoidkjleliht";
        int res3 = test.maxVowels(s3, 3);
        System.out.println(res3);
    }
}
