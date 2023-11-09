public class tiling {
    public static int tiles(int n){
        if(n == 0 || n == 1) return 1;
        

        //vertical
    int ver = tiles(n-1);
        //horizontal
    int hor = tiles(n-2);

    return ver+hor;
    }

    public static void main(String[] args) {
        System.out.println(tiles(4));
    }
}
