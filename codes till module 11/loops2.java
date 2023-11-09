import java.util.Scanner;
public class loops2 {
    public static void main(String args[])
    {
       Scanner inspect = new Scanner(System.in);
       int i = 0;
       int s = 0 ;
       int n = inspect.nextInt();
       while(i<n)
       {
        
      
       s= i+s;
       i++;

       }
       System.out.println(s);
    }
}
