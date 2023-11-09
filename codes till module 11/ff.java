
public class ff {

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flyods(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void oioi(int rows, int col) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println("");
        }
    }

    public static void solidrhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            // stars n
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }
    }

    public static void hollowrhom(int n) {
        for (int i = 1; i <=n ; i++) {
            // spaces - rows-i
            for (int j = 1; j <=n  - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= n ; j++) {
                if (i == 1 || i ==n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println(" ");
        }
    }
    public static void diamond(int n)
    {
        for (int i = 1; i <= n; i++) {
            //spaces n-i
            for (int j = 1; j <= n-i; j++) {
              System.out.print(" ");  
            }
            for (int j = 1; j <= (2*i)-1; j++) {
               System.out.print("*"); 
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            //spaces n-i
            for (int j = 1; j <= n-i; j++) {
              System.out.print(" ");  
            }
            for (int j = 1; j <= (2*i)-1; j++) {
               System.out.print("*"); 
            }
            System.out.println("");
        }
    }

    public static void main(String[] arg) {
        // butterfly(5);
        // flyods(5);
        // oioi(4, 4);
        // solidrhombus(7);
        // hollowrhom(7);
        diamond(5);
    }
}
