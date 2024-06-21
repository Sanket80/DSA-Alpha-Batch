
public class Subsets {
    
    public static void PrintSubsets(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // Yes Choice
        PrintSubsets(str, ans+str.charAt(i), i+1);
        // No Choice
        PrintSubsets(str, ans, i+1);
    }

    public static void main(String args[]){
        String str = "abc", ans="";
        PrintSubsets(str, ans, 0);
    }
}
