import java.util.*;

public class MaxLength {
    
    public static void main(String args[]){
        int Pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} , {50,90}};

        Arrays.sort(Pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = Pairs[0][1];

        for(int i=1 ; i<Pairs.length ; i++){
            if(Pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = Pairs[i][1];
            }
        }

        System.out.println("Maximum Length of Chain: "+chainLen);
    }
}
