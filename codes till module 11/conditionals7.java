import java.util.Scanner;
public class conditionals7 {
    public static void main(String[] args) {
        String branch ;
        System.out.println("Enter your branch ");
        Scanner inspect = new Scanner(System.in);
        branch = inspect.nextLine();
        switch(branch)
        {
            case "cse" -> System.out.println("Your branch has a good scope");
            case "cyber" -> System.out.println("Your branch is Godlike");
            case "ai" -> System.out.println("Your branch is not bad");
            case   "mechanical" -> System.out.println("OOhh ooo poor fellows , no girls in the branch or wot?");
        }
    
    }
}
