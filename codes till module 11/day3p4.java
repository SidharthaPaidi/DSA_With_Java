import java.util.*;
public class day3p4 {
    //type casting in java
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
     float a = 25.12f;
    //  int b = a;
    //  here if you try to convert a float to 
    // integer compiler shows error as it is lossy conversion 
    //but if you can convert forcefully by writing "(int)a"
    int b = (int)a;//forcefully here you convert float to int hence output will be 25 
    System.out.println(b);
    }
    
}
