public class functions1 {


   public static void swap(int num1,int num2)
   {
        int temp = num1;
        num1= num2;
        num2 = temp;
        
    }


    public static void main(String arg[]){
        int a = 1;
        int b = 2;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    }
    
}
// $?) { java functions1 }
// a=2
// b=1
// PS X:\java> cd "x:\java\" ; if ($?) { javac functions1.java } ; if ($?) { java functions1 }
// a=2
// b=1
// PS X:\java> cd "x:\java\" ; if ($?) { javac functions1.java } ; if ($?) { java functions1 }
// a=1
// b=2
// PS X:\java> 
