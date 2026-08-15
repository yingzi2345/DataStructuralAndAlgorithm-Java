package Easy;

import java.util.Locale;

public class 转换成小写字母 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        转换成小写字母 obj = new 转换成小写字母();
        System.out.println(obj.toLowerCase("Hello"));
        System.out.println(obj.toLowerCase("here"));
        System.out.println(obj.toLowerCase("LOVELY"));

    }
}
