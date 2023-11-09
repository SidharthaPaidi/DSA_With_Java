import java.util.*;
public class functions {
   public static int addfunction(int a, int b){
    int num3 = a+b;
    return num3;
   }
   public static void main(String[] args) {
    Scanner inspect = new Scanner(System.in);
    int a , b;
    System.out.println("Enter two numbers");
     a = inspect.nextInt();
     b = inspect.nextInt();
    int c = addfunction(a, b);
    System.out.println(c);

    
   }

}
