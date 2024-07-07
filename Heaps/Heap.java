import java.util.*;

public class Heap {
    
    static class heap{
        static ArrayList<Integer> arr = new ArrayList<>();
        public static void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x-1)/2;
            }
        }

        private static void heapify(int i){
            int minIdx = i;
            int left = 2*i +1;
            int right = 2*i + 2;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            
            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public static void remove(){
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);

            arr.remove(arr.size()-1);

            heapify(0);
        }

        public static int peek(){
            return arr.get(0);
        }

        public static boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String args[]){
        heap h = new heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(1);
        
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
