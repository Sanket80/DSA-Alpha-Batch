import java.util.*;

public class advance {
    
    public static void hollow_rectangle(int rows, int cols){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=cols ; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_pyramind(int rows){
        for(int i=1 ; i<=rows ; i++){
            // spaces
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            // starts
            for(int j=1 ; j<=i ;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1; i<=n ; i++){
            // starts
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1 ; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // down half
        for(int i=n; i>=1 ; i--){
            // starts
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1 ; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void solid_Rhombus(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //hollow_rectangle(4, 7);
        //inverted_rotated_pyramind(5);
        //zero_one_triangle(5);
        //butterfly(5);
        solid_Rhombus(4);
    }
}
