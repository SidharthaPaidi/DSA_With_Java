public class advpatterns2 {
    public static void invernum(int lines){
        for (int i = 0; i <= lines; i++) {
            for(int j=1;j<=lines-i+1;j++){
                System.out.print(j);
                
                
            }
            System.out.println("");
        }
    }
        public static void main(String[] arg){
                invernum(5);
        }
    
}
