import java.util.*;
public class functions4 {

    
    public static int fact(int num){
         int f =1;
        for (int i = 1; i <= num; i++) {

            f =f* i;
            

        }
        return f;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a , b ;
    System.out.println("Enter the values of n and r respectively");
    a= sc.nextInt();
    b= sc.nextInt();
    
    int coe = bino(a,b);
    System.out.println(coe);




    }

    public static int bino(int n,int r)
    {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);

        int bin = a/(b*c);

        return bin;
    }
}
