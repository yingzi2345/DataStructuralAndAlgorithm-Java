package Easy;

public class 分割字符串的最大得分 {
    public int maxScore(String s) {
        int totalOne = 0;
        //统计全部1的总数
        for (char c : s.toCharArray()){
            if (c == '1') {
                totalOne++;
            }
        }
        int max = 0;
        int left0 = 0;
        int left1 = 0;
        //i是分割点，i从1到s.length()-1,i代表右边开始的下标
        for (int i = 1;i<s.length();i++){
            //当前要加入左边的字符是:s[i-1]
            char ch = s.charAt(i-1);
            if(ch =='0'){
                left0++;
            }else{
                left1++;
            }
            // 套用公式计算当前得分
            int score = left0 +(totalOne-left1);
            if(score>max){
                max = score;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        分割字符串的最大得分 sol = new 分割字符串的最大得分();
        System.out.println(sol.maxScore("011101")); //5
        System.out.println(sol.maxScore("00111"));   //5
        System.out.println(sol.maxScore("1111"));   //3
    }
}
