package Easy;



public class 两整数相加 {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // 1. 创建Solution对象
        两整数相加 solution = new 两整数相加();
        // 2. 调用sum方法，传入数字
        int sum = solution.sum(15, 2);
        // 3. 打印结果看效果
        System.out.println(sum);
    }
}


