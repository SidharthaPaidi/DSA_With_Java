public class advpatterns4 {
    public static void oioi(int row,int col)
    {
        for (int i = 0; i <= row; i++) {
            for (int j = 0;j <= i; j++) {
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println("");
            
        }
    }
    public static void main(String[] args) {
        oioi(4, 4);
    }
}
