package Easy;

class Solution1 {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{Kelvin,Fahrenheit};
    }
}

public class 温度转换 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        double[] res = solution.convertTemperature(36.5);
        System.out.println(res[0] +"," +res[1]);
    }
}
