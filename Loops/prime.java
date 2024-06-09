import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        boolean prime = true;

        if(n == 2){
            prime = true;
        }
        else{
            for(int i = 2 ; i < Math.sqrt(n) ; i++){
                if(n%i==0){
                    System.out.println("It is not a prime Number");
                    prime = false;
                    break;
                }
            }
        }
        
        if(prime == true){
            System.out.println("It is a Prime Number!");
        }
    }
}