// public class NestedLoop {
//     public static void main(String[] args){
//         for (int i = 1; i <= 5; i++){
//             for (int j = 1; j <= 7; j++){
//                 System.out.print("("+i+","+j+")");
//             }
//             System.out.print("");
//         }
//     }
    
// }


// +++++++++++++ Patterns ++++++++++++++++++++++++++

// public class NestedLoop {
//     public static void main(String[] args){
//         for (int i = 1; i <= 5; i++){
//             for (int j = 1; j <= 5; j++){                   12345 output will be repeated 5 times.
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// +++++++++++++++++++ Example 1 ++++++++++++++++++++++++++++

// public class NestedLoop{
//     public static void main(String[] args){
//         for (int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){                      11111,222222 upto number 5 to repeated like this 
//                 System.out.print(i+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



//  +++++++++++ Example 2 +++++++++++++++++++++++++

// public class NestedLoop{
//     public static void main(String[] args){
//         for (int i=1; i<=5; i++){
//             for (int j=1; j<=5; j++){
//                 System.out.print(i+j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// ++++++++++++++++++++ Example 3 ++++++++++++++++++++

// public class NestedLoop{
//     public static void main(String[] args){
//         int count = 0;
//         for (int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 count++;                                this code will be print natural numbers then it will be use "count".
//                 System.out.print(count+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



//  ++++++++++++++++ Example 4 +++++++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){
//         for (int i=1; i<=5; i++){
//             for (int j=1; j<=i; j++){                 it will be print first line 1 2nd line 2 3 in third line three terms will be print
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// ++++++++++++++++++ Example 5 ++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){                        1      this like will be print 
//         int count = 0;                                             2 3
//         for (int i=1; i<=5; i++){                                  4 5 6
//             for (int j=1; j<=i; j++){                              7 8 9 10
//                 count++;                                           11 12 13 14 15       
//                 System.out.print(count+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



//      ++++++++++++ Example 6 +++++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){            1 2 3 4 5   it will be print like this 
//         for (int i=1; i<=5; i++){                      1 2 3 4 
//             for(int j=1; j<=5-i+1; j++){               1 2 3
//                 System.out.print(j+" ");               1 2 
//             }                                          1
//             System.out.println("");
//         }
//     }
// }



// ++++++++++++++ Example 7 ++++++++++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){                01 02 03 04 05    it will be print like this
//         int count = 0;                                     06 07 08 09
//         for (int i=1; i<=5; i++){                          10 11 12
//             for (int j=1; j<=5-i+1; j++){                  13 14
//                 count++;                                   15
//                 System.out.format("%02d ", count);
//             }
//             System.out.println("");
//         }
//     }
// }



//      ++++++++++++++++++++++   Example 8 ++++++++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){
//         for (int i=1; i<=5; i++){                   * * * * *  it will be print like this 
//             for (int j=1; j<=5; j++){                 * * * *
//                 if(i<=j)                                * * *
//                     System.out.print(("* "));             * *
//                 else                                        *
//                     System.out.print("  ");
//             }
//             System.out.println("");
//         }
//     }
// }




// ++++++++++++ Example ++++++++++++++++++++++++++
// public class NestedLoop{
//     public static void main(String[] args){                               
//         for (int i=1; i<=5; i++){                                *        
//             for (int j=1; j<=5; j++){                          * *
//                 if (i+j>5)                                   * * *    
//                     System.out.print(("* "));              * * * *
//                 else                                     * * * * * 
//                     System.out.print("  ");
//             }
//             System.out.println("");
//         }
//     }
// }