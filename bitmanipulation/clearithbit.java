public class clearithbit {
    public static int clear(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int set(int n , int i)
    {
        int bitmask = 1<<i;
        return n|bitmask;
        
    }
    public static void update(int n,int i , int newbit)
    {
        if(newbit==0)
        {
            clear(n, i);
        }else{
            set(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(clear(10,1));
    }
}
