public class clearlast_ithbit {
    public static int clearlastith(int n ,int i)
    {
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(clearlastith(7, 1));
    }
}
