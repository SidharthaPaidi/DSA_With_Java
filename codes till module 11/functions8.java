public class functions8 {
    public static boolean prime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void primerange(int num) {
        for (int i = 2; i <= num; i++) {
            if (prime(i)) {
                System.out.print(i + " ");

            }

        }
    }

    public static void main(String arg[]) {
        primerange(50);
    }

}
