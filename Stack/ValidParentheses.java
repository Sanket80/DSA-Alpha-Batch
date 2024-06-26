import java.util.*;

public class ValidParentheses {
    
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<str.length() ; i++){
            char currBrac = str.charAt(i);
            if(currBrac == '(' || currBrac == '[' || currBrac == '{'){
                s.push(currBrac);
            }
            else {
                if( !s.isEmpty() && ((currBrac == ']' && s.peek() == '[') || (currBrac == '}' && s.peek() == '{') || (currBrac == ')' && s.peek() == '('))){
                    s.pop();
                }else{
                    return false;
                }
            }
            
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        String str = "([{[]}])()";
        System.out.println(isvalid(str));
    }
}
