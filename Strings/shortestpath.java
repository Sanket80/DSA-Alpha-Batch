import java.util.*;

public class shortestpath {
    
    public static float calcShortestPath(String str){
        int x=0 , y=0 ;
        for(int i=0 ; i<str.length() ; i++){
            int direction = str.charAt(i);
            if(direction == 'N'){
                y++;
            }
            else if(direction == 'S'){
                y--;
            }
            else if(direction == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println("Shortest Path: "+calcShortestPath(str));
    }
}
