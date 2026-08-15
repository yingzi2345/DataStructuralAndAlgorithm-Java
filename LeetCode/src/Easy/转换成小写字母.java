package Easy;

import java.util.Locale;

public class 转换成小写字母 {
    public String toLowerCase(String s) {
        return s.toLowerCase();

        //----------手动转---------------
       /* char[] chars = s.toCharArray();
            for(int i = 0;i<chars.length;i++){
                if(chars[i] >='A' &&chars[i] <='Z'){
                    chars[i] += 32;
                }
            }
            return new String(chars);*/


    }


    public static void main(String[] args) {
        转换成小写字母 obj = new 转换成小写字母();
        System.out.println(obj.toLowerCase("Hello"));
        System.out.println(obj.toLowerCase("here"));
        System.out.println(obj.toLowerCase("LOVELY"));

    }
}
