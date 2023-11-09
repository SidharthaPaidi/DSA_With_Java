import java.util.*;

public class functions3 {

    public static int fact(int num) {
        int f =1;
        for (int i = 1; i <= num; i++) {

            f =f* i;
            

        }
        return f;
    }

    public static void main(String arg[]) {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter a value");
            n = sc.nextInt();
            int c = fact(n);
            System.out.println(c);
    }
}