import java.util.*;

public class Compression {
    
    public static String stringCompression(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        
        StringBuilder str2 = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                str2.append(str.charAt(i));
                if (count > 1) {
                    str2.append(count);
                }
                count = 1;
            }
        }
        
        return str2.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbcc";
        System.out.println(stringCompression(str));
    }
}
