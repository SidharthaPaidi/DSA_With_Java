import java.util.*;
public class conditionals2 {
    public static void main(String args[]){
        Scanner inspect = new Scanner(System.in);
        int number ;
        System.out.println("Enter a number ");
        number = inspect.nextInt();
    if (number % 2 == 0) {
        System.out.println(number +" is even number");
        
    } else {
        System.out.println(number + " is the odd number");
        
    }    
    }
    
}
