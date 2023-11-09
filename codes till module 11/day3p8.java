import java.util.*;

public class day3p8 {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the cost of the pencil");
        float pencil = scn.nextFloat();
        System.out.println("Enter the cost of pen");
        float pen = scn.nextFloat();
        System.out.println("Enter the cost of Eraser ");
        float eraser = scn.nextFloat();
         
        float total = pencil+pen+eraser;
        System.out.println("The bill is of amount :"+ total);
        float gst = (0.18f * total)+total;
        //including gst 
        System.out.println("With 18% Gst "+ gst);
       
    }
    
}
