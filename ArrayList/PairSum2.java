import java.util.*;

public class PairSum2 {

    public static boolean pairsum(ArrayList<Integer> list , int target){
        int bp=-1;
        for(int i=0 ; i<list.size()-1 ; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
            }
        }

        int lp = bp+1 , rp = bp , n= list.size();
        while (lp != rp) {
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }else if((list.get(lp) + list.get(rp)) < target){
                //lp = (lp+1) % n;
                if(lp == list.size()-1){
                    lp = 0;
                }else{
                    lp++;
                }
                System.out.println(lp+" ");
            }else{
                //rp = (n+rp-1) % n;
                if(rp == 0){
                    rp = list.size()-1;
                }else{
                    rp --;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);
        System.out.println(pairsum(list, 26));
    }
}
