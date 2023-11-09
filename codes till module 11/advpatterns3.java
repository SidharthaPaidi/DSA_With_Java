public class advpatterns3 {
    public static void flyods(int lines)
    {
            int counter=1;
        for (int i = 1; i <= lines ; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print(counter+" ");
                counter++;
               
                
            }
            System.out.println(" ");
            
        }
    }
    public static void main(String[] arg){
        flyods(6);
    }
    
}
