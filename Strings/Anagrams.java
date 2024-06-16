import java.util.*;

public class Anagrams {
    
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";
        
        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length() == str2.length()){
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);
            if(result){
                System.out.println("They are Anagrams");
            }else{
                System.out.println("They are not Anagrams of each other");
            }
        }
        else{
            System.out.println("They are not Anagrams of each other");
        }
    }
}
