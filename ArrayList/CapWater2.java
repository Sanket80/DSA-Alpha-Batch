import java.util.*;

public class CapWater2 {
    
    public static int storeWater(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0, rp = list.size()-1;
        for(int i=0 ; i<list.size() ; i++){
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
