import java.util.Scanner;

public class calculator { 
public static void main(String  args[])
{
    Scanner inspect = new Scanner(System.in);
System.out.println("Enter any two digits");
    int a= inspect.nextInt() ;
    int b = inspect.nextInt();
    System.out.println("Enter the operation ");
    char operator  = inspect.next().charAt(0);
    switch (operator) {
        case '+':
            System.out.println(a+b);
            break;
    case '-' :
    System.out.println(a-b);
    break;
    case '*' :
    System.out.println(a*b);
    break;
    case '/':
    System.out.println(a/b);
    break;

        default:
        System.out.println("Opps enter a valid operation");
            break;
    }

   
   

  

}

    
}
