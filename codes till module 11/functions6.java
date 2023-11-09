import java.util.*;

public class functions6 {

    public static int prime(int num) {
        int a = 0;
        for (int i = 2; i <= num - 1; i++) {

            a = num % i;

        }
        return a;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int pri = prime(num);

        if (pri == 0) {
            System.out.println("Not Prime Number");
        } else {
            System.out.println("Prime Number");
        }

    }
}
