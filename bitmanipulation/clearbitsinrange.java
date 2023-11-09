public class clearbitsinrange {
  public static int range(int n, int i, int j) {
    int a = ((~0)) << (j + 1);
    int b = (1 << i) - 1;
    int bitmask = a | b;
    return n & bitmask;
  }

  public static int powerof2(int n)

  {
    return n & (n - 1);
  }

  public static int countsetbits(int n) {

    int count = 0;
    while(n>0)
    {
      if((n&1)!=0)
      {
        count++;
      }
      n = n >> 1;
    }
    return count;
  }

  public static void main(String[] args) {
    // int a = powerof2(9);
    // if (a == 0) {
    //   System.out.println("Yeah it is power of 2");
    // } else {
    //   System.out.println("Nope not a power of 2");
    // }
    System.out.println(countsetbits(10));

  }
}
