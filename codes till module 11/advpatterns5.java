public class advpatterns5 {
    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // spaces - 2*(n-1)

            for (int j= 1; j<= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            //stars - i 
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
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
            //stars - i 
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
       

    }
    public static void main(String[] arg){
        butterfly(10);
    }
}
