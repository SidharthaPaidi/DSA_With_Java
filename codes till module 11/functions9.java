import java.util.*;

public class functions9 {

    public static int bintodec(int bin) {
        int dec = 0;
        int n = 0;
        int lastdig;
        int x = 0;
        int pow = 0;

        int temp = bin;
        while (temp != 0) {
            temp /= 10;
            n++;

        }
        x = n;

        for (int i = 0; i <= n; i++) {
            lastdig = bin % 10;

            dec = (dec + (lastdig * (int) Math.pow(2, pow)));

            pow++;
            bin /= 10;
        }

        return dec;
    }

    public static void main(String[] args) {
        int bin = 111;
        int dec = bintodec(bin);
        System.out.println(dec);

    }
}
