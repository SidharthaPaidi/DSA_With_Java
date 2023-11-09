public class palindrome {
    public static boolean palindrome(String st)
    {
        for(int i = 0;i<st.length()/2;i++)
        {
            if(st.charAt(i)!=st.charAt(st.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
