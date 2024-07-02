import java.util.*;

public class ActivitySelection {
    
    public static void main(String args[]){
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};
        int activity[][] = new int[start.length][3];
        for(int i=0 ; i<start.length ; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activity[0][0]);
        maxAct = 1;
        int lastAct = activity[0][2];

        for(int i=1 ; i<start.length ; i++){
            if(activity[i][1] >= lastAct){
                ans.add(activity[i][0]);
                maxAct++;
                lastAct = activity[i][2];
            }
        }

        System.out.print("Max Activities: ");
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
