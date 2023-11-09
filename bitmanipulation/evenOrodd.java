public class evenOrodd {
    public static void evenodd(int n)
    {
        if((n&1)==0)
        {
           System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }


    public static void main(String[] args) {
         evenodd(2);
    }
}
