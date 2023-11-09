public class loops5 {
    public static void main(String[] args) {
        int number = 3009;
        int revnum = 0 ;
        while(number>0)
        {
            int lastnum = number%10;
            revnum = (revnum*10)+lastnum;
            number/=10;
        }
        System.out.println(revnum);
    }
    
}
