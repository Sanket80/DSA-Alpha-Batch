import java.util.*;

public class Duplicates {
    
    public static void RemoveDuplicates(String s , int idx , StringBuilder str , boolean map[]){
        if(idx == s.length()){
            System.out.println(str);
            return;
        }
        char currentchar = s.charAt(idx);
        if(map[currentchar - 'a'] == true){
            RemoveDuplicates(s, idx+1, str, map);
        }else{
            map[currentchar - 'a'] = true;
            RemoveDuplicates(s, idx+1, str.append(currentchar), map);
        }
    }

    public static void main(String args[]){
        String s = "appnacollege";
        boolean map[] = new boolean[26];
        StringBuilder str = new StringBuilder("");
        RemoveDuplicates(s, 0, str, map);
    }
}
