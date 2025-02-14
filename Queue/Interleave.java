import java.util.*;

public class Interleave{

    public static void Interleave(Queue q){
        Queue q1 = new LinkedList<>();
        int size = q.size();

        for(int i=0 ; i<size/2 ; i++){
            q1.add(q.remove());
        }

        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String args[]){
        Queue q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        
        Interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}