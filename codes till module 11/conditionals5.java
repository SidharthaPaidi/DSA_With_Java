import java.util.*;
public class conditionals5 {
    public static void main(String[] args) {
        int marks ;
        System.out.println("Enter your Marks");
Scanner inspect = new Scanner(System.in);
marks = inspect.nextInt();
        String result = (marks >= 35 )?"pass":"fail";
        System.out.println(result);

    }
}
