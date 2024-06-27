import java.util.*;

public class QueueB {
    static class Queue{
        static int arr[];
        static int size , rear;
        Queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full!");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return;
            }
            int front = arr[0];
            for(int i=0 ; i<arr.length-1 ; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}
