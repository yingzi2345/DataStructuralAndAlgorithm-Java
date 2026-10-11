package middle;

public class 得到k个黑块的最少涂色次数 {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int windowW = 0;

        //初始化第一个窗口
        for (int i = 0; i < k; i++) {
            if(blocks.charAt(i) == 'W'){
                windowW++;
            }
        }
        int min = windowW;

        //滑动窗口，right从k开始
        for (int right = k; right < n; right++) {
            //移出窗口的字符：right-k
            if(blocks.charAt(right-k) == 'W'){
                windowW--;
            }
            //新进入窗口的字符：right
            if (blocks.charAt(right) == 'W') {
                windowW++;
            }
            //更新最小值
            min = Math.min(min, windowW);//Math.min(a,b)：取 a 和 b 里面更小的值
        }
        return min;
    }

    public static void main(String[] args) {
        得到k个黑块的最少涂色次数 test = new 得到k个黑块的最少涂色次数();
        System.out.println(test.minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(test.minimumRecolors("WBWBBBW", 2));
    }
}
