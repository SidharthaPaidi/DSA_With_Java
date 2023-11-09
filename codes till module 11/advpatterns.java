public class advpatterns {
    public static void hollow_rect(int rows ,int col){

        for(int i=1;i <= rows ;i ++){
            for(int j = 1 ; j <= col;j++){
                if (i==1||i==rows||j==1||j==col) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        hollow_rect(10,7);
    }
}
