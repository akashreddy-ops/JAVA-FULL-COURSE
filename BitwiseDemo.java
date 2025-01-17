                     //   And Operator 

// public class BitwiseDemo {
//     public static void main(String[] args){
//         int x=10,y=6,z;
//         z = x & y;
//         System.out.println(z);
//     }
    
// }




                            // Or Operator ||
// public class BitwiseDemo{
//     public static void main(String[] args){
//         int x=10,y=6,z;
//         z = x | y;
//         System.out.println(z);

//     }
// }



                

                          //  X Or Operator 
// public class BitwiseDemo{
//     public static void main(String[] args){
//         int x=10,y=6,z;
//         z = x ^ y;
//         System.out.println(z);
//     }
// }









                        //    Un Signed operator 
public class BitwiseDemo{
    public static void main(String[] args){
        int x = -0b1010;
        int y;
        y = x>>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%32s",Integer.toBinaryString(y)));
    }
}
