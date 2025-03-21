
// ++++++++++++++++++++++++ Finding Sum of all Elements +++++++++++++++++++++++
// public class Array {
//     public static void main(String args[]){
//         int A[] = {3,9,7,8,12,6,15,5,4,10};

//         int sum = 0;
//         for(int X:A){
//             sum = sum + X;
//         }
//         System.out.println("Sum is "+ sum);
//     }
    
// }




// +++++++++++++++++++++++++ Searching an Element ++++++++++++++++++++++++++++++++

// import java.util.*;
// public class Array{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         int A[] = {3,9,7,8,12,6,15,5,4,10};
//         int key;
//         key = SC.nextInt();
//         for(int i=0; i<A.length; i++){
//             if(key == A[i]){
//                 System.out.println("Element Found at: "+i);
//                 System.exit(0);
//             }
//         }
//     }
//     System.out.println("Not Found");
// }




// ++++++++++++++++++++++++++++++ Finding Maximum Element +++++++++++++++++++++++++
// public class Array{
//     public static void main(String[] args){
//         int A[] = {3,9,7,8,12,6,15,5,4,10};
//         int max1, max2;
//         max1 = max2 = A[0];
//         for(int i=1; i<A.length; i++){
//             if(A[i] > max1){
//                 max2 = max1;
//                 max1 = A[i];
//             }
//             else if(A[i] > max2){
//                 max2 = A[i];
//             }
//             System.out.println("Second Largest is "+max2);
//         }

//     }
//         // System.out.println("Second Largest is "+max2);
// }


// ++++++++++++++++++++ Rotating An Array ++++++++++++++++++++++++++++++++
// public class Array{
//     public static void main(String[] args){
//         int A[] = {3,9,7,8,12,6,15,5,4,10};
//         for(int x:A)
//         System.out.print(x+",");
//         System.out.println("");

//         int temp = A[0];
//         for(int i=1; i<A.length; i++){
//             A[i-1] = A[i];
//         }
//         A[A.length-1] = temp;
//         for(int x:A)
//         System.out.print(x+",");
//         System.out.println("");
//     }
// }



// ++++++++++++++++++++ Example ++++++++++++++++++++++++++++
// public class Array{
//     public static void main(String[] args){
//         int A[][] = new int[5][5];
//         int B[][] = {{1,2,3},{2,4,6},{1,3,5}};

//         for(int i=0; i<B.length; i++){
//             for(int j=0; j<B[0].length; j++){
//                 System.out.print(B[i][j]+" ");
//             }
//             System.out.println("");
//         }
//         // System.out.println("");
//     }
// }



// ++++++++++++++++ Adding Two Matrices ++++++++++++++++++

// public class Array{
//     public static void main(String[] args){
//         int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
//         int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
//         int C[][] = new int[3][3];

//         for(int i=0; i<A.length; i++){
//             for(int j=0; j<A[0].length; j++){
//                 C[i][j] = A[i][j] + B[i][j];
//             }
//         }
//         for(int x[]:C){
//             for(int y:x){
//                 System.out.println(y+" ");
//             }
//             System.out.println("");
//         }
//         // System.out.println("");
//     }
// }




// ++++++++++++++++++++++ Sorting Array Of Strings ++++++++++++++++++

// public class Array{
//     public static void main(String[] args){
//         int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
//         int B[][] = {{1,0,0},{0,1,0},{0,0,1}};

//         int C[][] = new int[3][3];


//         for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 C[i][j] = 0;
//                 for(int k=0; k<3; k++){
//                     C[i][j] = C[i][j] + A[i][k]*B[k][j];
//                 }
//             }
//             for(int x[]:C){
//                 for(int y:x){
//                     System.out.print(y+" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }




// ++++++++++++++++++++++ Example +++++++++++++++++++++++++

public class Array{
    public static void main(String[] args){
        String arr[] = {"Java","Python","Pascal","Smalltalk","ada","Basic"};
        java.util.Arrays.sort(arr);
        for(String x:arr)
            System.out.println(x);
    }
}