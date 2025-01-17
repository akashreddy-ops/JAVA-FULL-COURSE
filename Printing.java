// public class Printing {
//     public static void main(String[] args){
//         int x=10, y=20;
//         System.out.println("Sum "+x+y);
//     }
// }



                       // Example 2
// public class Printing{
//     public static void main(String[] args){
//         int x = 10, y = 20;
//         System.out.println(x+y+" Sum");

//     }
// }





                      // Example 3 Sum of 10 and 20 is 30
// public class Printing{
//     public static void main(String[] args){
//         int x=10, y=20;
//         System.out.println("sum of "+x+" and "+y+" is "+(x+y));
//     }
// }







                              // Example 4 Formatting output
// public class Printing{
//     public static void main(String[] args){
//         int x=10;
//         float y=125.6f;
//         char z='A';
//         System.out.printf("Hello %e \n",y);
//     }
// }






                  // Example 4    float
// public class Printing{
//     public static void main(String[] args){
//         int x=10;
//         float y=0.0012f;
//         char z='A';
//         System.out.printf("Hello %e \n",y);

//     }

// }







                             // Example 5    String
// public class Printing{
//     public static void main(String[] args){
//         int x=10;
//         float y=0.0012f;
//         char z='A';
//         String str="java Program";
//         System.out.printf("%s \n",str);
//     }
// }



                      // Example 6   

// public class Printing{
//     public static void main(String[] args ){
//         int x = 10;
//         float y = 0.0012f;
//         char z = 'A';
//         String str = "java program";
//         System.out.printf("%1$d, %2$f, %1$d",x,y);
//     }
// }




                      // Flags and Width
// public class Printing{
//     public static void main(String[] args){
//         int x = 10;
//         System.out.printf("%05d",x);
//     }
// }

          //  I Will put the negative to the value then waht happend it will seen next
// public class Printing{
//     public static void main(String[] args){
//         int x = -10;
//         System.out.printf("%(5d",x);
//     }
// }

                // I will used + symbol in the middle of %d with spaces of 5 times
// public class Printing{
//     public static void main(String[] args){
//         int x = 10;
//         System.out.printf("%+5d",x);
//     }
// }



              // Now using float 
// public class Printing{
//     public static void main(String[] args){
//         float x = 123.45f;        // its showing precise not accurate values for you given the value 
//         System.out.printf("%f",x);
//     }
// }



         // same example 2
// public class Printing{
//     public static void main(String[] args){
//         float x = 123.45f;
//         System.out.printf("%6.2f",x);
//     }
// }




               // String 
public class Printing{
    public static void main(String[] args){
        String str = "Java";
        System.out.printf("%-20s",str);   // By using same code with "Format also" they execute will done
    }
}