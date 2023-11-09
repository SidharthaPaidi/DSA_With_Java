import java.util.Scanner;
public class conditionals6 {
    public static void main(String[] args) {
        String name ;
        System.out.println("Enter Your name to find your Hometown");
        
        Scanner inspect = new Scanner(System.in);
        name = inspect.nextLine();
        switch(name){
            case "sidhu":
            System.out.println("You are from bori");
            break;
            case "harshith":
            System.out.println("You are from gondpipri");
            break;
            case "sumit":
            System.out.println("You are from chandrapur");
            break;
            case "chetan":
            System.out.println("You are from gondia");
            break;
            default:
            System.out.println("Your name is not in the list");

        }
        System.out.println("yeah boii my code works!!");
    }
}
