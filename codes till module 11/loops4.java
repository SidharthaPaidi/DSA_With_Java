public class loops4 {

    public static void main(String[] args) {
        int number = 152004;
        while( number > 0)
        {
            int lastnum = number%10;//is se apne ko last digit milega
            System.out.print(lastnum);
            number/=10;
        }

    }
}
