import java.util.Scanner;

public class posorneg {
    public static void main(String args[])
    {
      Scanner inspect = new Scanner(System.in);
      System.out.println("Enter a number");
      int a = inspect.nextInt();
      if (a>0) {
        System.out.println(a + " is the positive number");

        
      } else {
        System.out.println(a +" is the negative number");
        
      }
    }
}
