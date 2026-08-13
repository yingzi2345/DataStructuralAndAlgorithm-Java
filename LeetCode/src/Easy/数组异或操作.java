package Easy;

public class 数组异或操作 {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        // 创建对象
        数组异或操作 test = new 数组异或操作();

        // 测试样例
        System.out.println(test.xorOperation(5, 0));   // 8
        System.out.println(test.xorOperation(4, 3));   // 8
        System.out.println(test.xorOperation(1, 7));   // 7
        System.out.println(test.xorOperation(10, 5));  // 2
    }
}
