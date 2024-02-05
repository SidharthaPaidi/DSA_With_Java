class numberFactor {
    public static void main(String[] args) {
        System.out.println(waysToGet(6));
    }

    public static int waysToGet(int n) {
        if ((n == 0) || (n == 1) || (n == 2)) {
            return 1;
        }
        if (n == 3) {
            return 2; // {1,1,1} , {3}
        }
        int sub1 = waysToGet(n - 1);
        int sub2 = waysToGet(n - 3);
        int sub3 = waysToGet(n - 4);
        return sub1 + sub2 + sub3;
    }
}