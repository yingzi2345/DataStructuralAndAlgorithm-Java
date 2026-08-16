package Easy;

public class 各位相加 {

    public int addDigits(int num) {
        /*//只要不是个位数，就继续循环
        while (num >= 10) {
            int sum = 0;//每一位拿出来累加
            while (num > 0) {
                sum += num % 10;//取个位
                num = num / 10;//取十位
            }
            num = sum;
        }
        return num;*/

        // -------------进阶写法：数学法O(1)-----------
        if (num == 0) {
            return 0;        //如果num==0，直接返回0
        }
        return num % 9 == 0 ? 9 : num % 9;//否则：num %9,如果取模等于0，返回9，否则返回取模结果
    }

    public static void main(String[] args) {
        各位相加 test = new 各位相加();
        System.out.println(test.addDigits(38)); //输出2
        System.out.println(test.addDigits(0));  //输出0
        System.out.println(test.addDigits(99)); //9+9=18 →1+8=9
    }
}
