public class functions10 {
    
public static boolean even(int a){
    if(a%2==0){
        return true;
    }else{
        return false;
    }
}
public static void main(String[] args) {
    int a = 5;
    if(even(a)){
        System.out.println("Even number");
    }else{
        System.out.println("Odd");
    }
}

}
