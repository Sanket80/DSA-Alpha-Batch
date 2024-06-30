import java.util.*;

public class ConnectRopes {

    public static int ConnectNRopes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]);
        }

        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            res += first + second;
            pq.add(first+second);
        }
        return res;
    }
    
    public static void main(String args[]){
        int arr[] = {4,3,2,6};
        System.out.println(ConnectNRopes(arr));
    }
}
