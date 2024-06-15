import java.util.*;

public class spiral {
    
    public static void SpiralMatrix(int arr[][]){
        int start_Row = 0, start_Col = 0 , end_Row = arr.length-1 , end_Col = arr[0].length-1;
        while (start_Row <= end_Row && start_Col <= end_Col) {
            // top Row
            for(int i=start_Col ; i<=end_Col ; i++){
                System.out.print(arr[start_Row][i]+" ");
            }

            // Right Column
            for(int j=start_Row+1 ; j<=end_Row ; j++){
                System.out.print(arr[j][end_Col]+" ");
            }

            // Bottom Row
            for(int j=end_Col-1 ; j>=start_Col ; j--){
                System.out.print(arr[end_Row][j]+" ");
            }

            // Left Column
            for(int i=end_Row-1; i>=start_Row+1 ; i--){
                System.out.print(arr[i][start_Col]+" ");
            }
            start_Row++;
            start_Col++;
            end_Row--;
            end_Col--;
        }
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralMatrix(arr);
    }
}
