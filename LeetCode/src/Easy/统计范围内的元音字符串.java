package Easy;

public class 统计范围内的元音字符串 {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];//拿当前的这个字符串
            char first = s.charAt(0);//拿这个字符串的第一个字符
            char last = s.charAt(s.length() - 1);//拿最后一个字符
            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }
        return count;
    }

    //判断一个字符是不是元音
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static void main(String[] args) {
        统计范围内的元音字符串 test = new 统计范围内的元音字符串();
        // 样例1
        String[] words1 = {"are", "amy", "u"};
        int res1 = test.vowelStrings(words1, 0, 2);
        System.out.println(res1); //预期输出 2

        // 样例2
        String[] words2 = {"hey", "aeo", "mu", "ooo", "artro"};
        int res2 = test.vowelStrings(words2, 1, 4);
        System.out.println(res2); //预期输出 3
    }
}
