import java.util.*;
public class inputoutput {
    public static void String(String st)
    {
        for(int i = 0;i<st.length();i++)
        {
            System.out.println(st.charAt(i));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        str = sc.nextLine();
        System.out.println(str);
        String Firstname = "Sidhartha";
        String Lastname = "Paidi";
        String fullname = Firstname + Lastname;
        System.out.println(fullname);
        String(fullname);
    }
}
