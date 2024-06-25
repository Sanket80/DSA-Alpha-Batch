import java.util.*;
public class PushBottom {
    
    public static void pushAtBotton(Stack<Integer> s, int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushAtBotton(s, n);
        s.push(top);
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBotton(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
