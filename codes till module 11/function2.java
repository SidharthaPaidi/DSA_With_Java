import java.util.*;
public class function2 {
    
public static int prod(int a , int b)
{
    int c ;
    c = a*b;
    return c;

}
public static void main(String arg[]){

    Scanner sc = new Scanner(System.in);
    int a ,b;
    System.out.println("Enter two numbers");;
    a = sc.nextInt();
    b = sc.nextInt();
    int product = prod(a,b);
    System.out.println(product);
     product = prod(2,4);
    System.out.println(product);
}

}
