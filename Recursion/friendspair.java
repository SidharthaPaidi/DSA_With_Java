public class friendspair {
     public static int friendspairning(int n){

        if(n==1||n==2) return n;

        int single = friendspairning(n-1);
        int pair  = (n-1)*friendspairning(n-2);
        
        return single+pair;
     }

     public static void main(String[] args) {
        System.out.println(friendspairning(3));
     }
}
