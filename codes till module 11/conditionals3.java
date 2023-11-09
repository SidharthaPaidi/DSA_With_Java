import java.util.*;
public class conditionals3 {
    public static void main(String[] args) {
        Scanner inspect = new Scanner(System.in);
        int income ;
        int  tax ;
        System.out.println("Enter your Income");
        income = inspect.nextInt();
        System.out.println("Your tax amount is ");
    if (income < 500000) {
        tax = 0 ;
        System.out.println(tax);

        
    } else if(income >= 500000 && income <= 1000000) {
        tax = (int)(income*0.2);
        System.out.println(tax);
        
    }else{
        tax = (int)(income*0.3);
        System.out.println(tax);
    }  
    }
    
}
