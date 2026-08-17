package Easy;

public class 整数的各位积和之差 {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int ge = n % 10;
            product *= ge;
            sum += ge;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        整数的各位积和之差 obj = new 整数的各位积和之差();
        System.out.println(obj.subtractProductAndSum(234));
        System.out.println(obj.subtractProductAndSum(4421));
    }
}
