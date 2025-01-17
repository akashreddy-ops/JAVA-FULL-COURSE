// class Literal {
//     public static void main(String arg[]){
//         byte b=5;
//         short s=1;
//         int i=100;
//         System.out.println(b);
//         System.out.println(s);
//         System.out.println(i);
//     }
    
// }


                   // example 
// class Literal {
//     public static void main (String arg[]){
//         byte b1 = 10;
//         byte b2 = 0b1010;
//         byte b3 = 012;
//         byte b4 = 0xA;
//         System.out.println(b1);
//         System.out.println(b2);
//         System.out.println(b3);
//         System.out.println(b4);

//       }
// }



             // example 1 
// class Literal {
//   public static void main(String arg[]){
//     long l = 125;
//     System.out.println(l);
//   }
// }

          
              // example 2
// class Literal{
//   public static void main(String arg[]){
//     long l = 999999999999L;
//     System.out.println(l);
//   }
// }




              // Underscore but not showing in the output
class Literal{
  public static void main(String arg[]){
    long l = 999_999_999;
    System.out.println(l);
    float f = 123_456.56f;
    System.out.println(f);
    
  }
}