import java.util.*;
public class function7 {
    public static boolean prime(int num){
        boolean prime = true;
        for (int i = 2; i <= num-1; i++) {
            if(num%i==0){
                prime = false;
            }

        }
        return prime;
    }
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        System.out.println(prime(num));
    }
}
