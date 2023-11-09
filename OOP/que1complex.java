import java.util.*;

public class que1complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex solve = new Complex();
        System.out.println("Enter the real and imaginary values respectively");

        int r = sc.nextInt();
        int i = sc.nextInt();
        solve.sum(r, i);
        solve.difference(r, i);
        solve.product(r, i);
    }

}

class Complex {
    int real;
    int img;

    void sum(int real, int img) {
        System.out.println("sum = " + (real + img));
    }

    void difference(int real, int img) {
        System.out.println("difference = " + (real - img));
    }

    void product(int real, int img) {
        System.out.println("product = " + (real*img));
    }
}
