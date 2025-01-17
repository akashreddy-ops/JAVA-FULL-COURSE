
// import java.util.*;

// public class Expression{
//     public static void main(String[] args){
//         float base,height,area;
//         System.out.println("Enter Base and Height ");
//         Scanner SC = new Scanner(System.in);
//         base = SC.nextFloat();
//         height =  SC.nextFloat();
//         area = base * height / 2;
//         System.out.println("Area of a triangle is "+ area);
//         }
    
// }



                // Area of triangle by using sqrt
import java.lang.*;
import java.util.*;
public class Expression{
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        int a,b,c;
        float s;
        double area;
        System.out.println("Enter three sides of a triangle");
        a= SC.nextInt();
        b= SC.nextInt();
        c= SC.nextInt();
        s= (a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
        System.out.println("Area is "+area);
    }
}
