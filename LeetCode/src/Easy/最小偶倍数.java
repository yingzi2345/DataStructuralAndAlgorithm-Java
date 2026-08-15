package Easy;


public class 最小偶倍数 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public static void main(String[] args) {
        最小偶倍数 solution2 = new 最小偶倍数();
        System.out.println(solution2.smallestEvenMultiple(5));
        System.out.println(solution2.smallestEvenMultiple(6));
        System.out.println(solution2.smallestEvenMultiple(87));
    }
}
