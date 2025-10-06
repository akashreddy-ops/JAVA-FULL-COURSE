// public class Coding{
//     public static void main(String[] args){
        // We will Write Code Inside this
        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // We Want to print Hello World in 5 different lines 
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
// }


// question 1 pattern
// public class Coding{                                       // 0 0 0 0 0 0 
//     public static void main(String[] args){                // 0 0 0 0 0 0
//         for(int i=0; i<=4; i++){                           // 0 0 0 0 0 0
//             for(int j=0; j<=5; j++){                       // 0 0 0 0 0 0
//                 System.out.print("0");                     // 0 0 0 0 0 0
//             }
//             System.out.println();
//         }
//     }
// }



// Question 2 Pattern 
// public class Coding{                                      // 0
//     public static void main(String[] args){               // 0 0
//        for(int i=0; i<=3; i++){                           // 0 0 0 
//         for(int j=0; j<i+1; j++){                         // 0 0 0 0
//             System.out.print("0");
//         }
//         System.out.println();
//        }
//     }
// }





// Question 3 Pattern 
// import java.util.*;
// public class Coding{                                               // 1 
//     public static void main(String[] args){                        // 1 2
//         Scanner SC = new Scanner(System.in);                       // 1 2 3
//         int n = SC.nextInt();                                      // 1 2 3 4
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(i+1 + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// Question 4 Ascii
// import java.util.*;
// public class Coding{
//          public static void main(String[] args){                                // 1
//                 Scanner SC = new Scanner(System.in);                            // 2 2
//                 int n = SC.nextInt();                                           // 3 3 3
//                 for(int i=0; i<n; i++){
//                         for(int j=0; j<=i; j++){
//                                 System.out.print((char)(65+i) + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }



// Question 5 
// import java.util.*;
// public class Coding{                                                           // A
//         public static void main(String[] args){                                // B B
//                 Scanner sc = new Scanner(System.in);                           // C C C
//                 int n = sc.nextInt();
//                 for(int i=0; i<n; i++){
//                         for(int j=0; j<=i; j++){
//                                 System.out.print((char)(65+i+j) + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }




// Question 6 
// import java.util.*;
// public class Coding{                                                          // A
//         public static void main(String[] args){                               // B C
//                 Scanner sc = new Scanner(System.in);                          // C D E
//                 int n = sc.nextInt();                                         // D E F G
//                 for(int i=0; i<n; i++){
//                         for(int j=0; j<=i; j++){
//                                 System.out.print((char)(69-i+j) + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }




// Qestion 7 
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);                  // Pattern for n=4
//                 int n = sc.nextInt();                                  // ...1
//                 for(int i=0; i<n; i++){                                // ..12
//                         for(int j=0; j<n-i-1; j++){                    // .123
//                                 System.out.print(" ");                 // 1234
//                         }
//                         for(int k=1; k<=i+1; k++){
//                                 System.out.print(k);
//                         }
//                         System.out.println();
//                 }
//         }
// }



// Question 8 
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){                    // Pattern for n=4 
//                 Scanner sc = new Scanner(System.in);               // 4444
//                 int n = sc.nextInt();                              // 333
//                 for(int i=0; i<n; i++){                            // 22
//                         for(int j=0; j<n-i; j++){                  // 1
//                                 System.out.print(n-i);
//                         }
//                         System.out.println();
//                 }
//         }
// }




// question 10
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);             // pattern for n=4
//                 int n = sc.nextInt();                            // . . . 1
//                 for(int i=0; i<n; i++){                          // . . 2 3 2
//                         for(int j=0; j<n-i-1; j++){              // . 3 4 5 4 3
//                                 System.out.print(".");         // 4 5 6 7 6 5 4
//                         }
//                         for(int j=i+1; j<=2*i+1; j++){
//                                 System.out.print(j);
//                         }
//                         for(int j=2*i; j>=i+1; j--){
//                                 System.out.print(j);
//                         }
//                         System.out.println();
//                 }
//         }
// }





// Question 11
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int x = (n/2) + 1;

//                 for(int i=0; i<x; i++){
//                         for(int j=1; j<=x-i-1; j++){                        // Pattern for n=5
//                                 System.out.print(".");                     // . . *
//                         }                                                    // . * * *
//                         for(int j=1; j<=2*i+1; j++){                         // * * * * * 
//                                 System.out.print("*");                     // . * * *
//                         }                                                    // . . *
//                         System.out.println();
//                 }

//                 // Second Part
//                 for(int i=1; i<=(n-x); i++){
//                         for(int j=1; j<=i; j++){
//                                 System.out.print(".");
//                         }
//                         for(int j=1; j<=n-(2*i); j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }




// question 12
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int total = (n*2) - 1;
//                 for(int i=0; i<(total/2) + 1; i++){
//                         for(int j=0; j<=i-1; j++){
//                                 System.out.print(n-j+" ");
//                         }
//                         for(int j=i; j<total-i; j++){                           // pattern for n=4
//                                 System.out.print(n-i+" ");
//                         }                                                       //4 4 4 4 4 4 4
//                         for(int j=n-i+1; j<=n; j++){                            //4 3 3 3 3 3 4
//                                 System.out.print(j+" ");                        //4 3 2 2 2 3 4
//                         }                                                       //4 3 2 1 2 3 4
//                         System.out.println();                                   //4 3 2 2 2 3 4
//                 }                                                               //4 3 3 3 3 3 4
//                                                                                 //4 4 4 4 4 4 4

//                 int x = total / 2;
//                 for(int i=0; i<x; i++){
//                         for(int j=n; j>=3+i; j--){
//                                 System.out.print(j+" ");
//                         }
//                         for(int j=0; j<3+(2*i); j++){
//                                 System.out.print(i+2+" ");
//                         }
//                         for(int j=x-2-i; j>=0; j--){
//                                 System.out.print(n-j+" ");
                 
//                         }
//                         System.out.println();
//                 }

//         }
// } 






// question 13 Parallelogram pattern 
// import java.util.*;
// public class Coding{                                                    // dots will be spaces 
//         public static void main(String[] args){                         //.****
//                 Scanner sc = new Scanner(System.in);                    //..****
//                 int n = sc.nextInt();                                   //...****
//                                                                         //....****
//                 for(int i=1; i<=n; i++){
//                         for(int j=1; j<=i; j++){
//                                 System.out.print(".");
//                         }
//                         for(int j=1; j<=n; j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }





// Question 14 Integers Sum 
// import java.util.*;
// public class Coding{
//           public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // assuming n is defined somewhere
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = 1; j <= i + 1; j++) {                          //1=1
//                 System.out.print(j);                                    //1+2=3
//                 if (j < i + 1) {                                        //1+2+3=6
//                     System.out.print("+");                            
//                 }
//                 sum += j;
//             }
//             System.out.println("=" + sum);
//         }
//     }
// }




//Question 15 
// public class Coding{
//         public static void main(String[] args){                         //******
//                 for(int i=0; i<6; i++){                                 //*****             
//                         for(int j=0; j<6-i; j++){                       //****
//                                 System.out.print("*");                //***
//                         }                                               //**
//                         System.out.println();                           //*
//                 }
//         }
// }




// Question 16
// public class Coding{
//         public static void main(String[] args){
//                 for(int i=0; i<6; i++){
//                         System.out.print("*");
//                 }
//                 System.out.println();                                   //******
//                 for(int i=0; i<3; i++){                                 //*   *
//                         System.out.print("*");                        //*  *
//                         for(int j=3; j>=i+1; j--){                      //* *
//                                 System.out.print(" ");                //*
//                         }
//                         System.out.print("*");
//                         System.out.println();
//                 }
//                 System.out.print("*");
//         }
// }





// Question 17 Odd Square 
// import java.util.*;
// public class Coding{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();                                   //1 3 5 7 
//                         for (int i = 0; i < n; i++) {                   //3 5 7 1
//                 for (int j = 2 * i + 1; j < 2 * n; j += 2) {            //5 7 1 3
//                         System.out.print(j + " ");                      //7 1 3 5
//                 }
//                 int a = 1;
//                 for (int k = 0; k < i; k++) {
//                         System.out.print(a + " ");
//                         a += 2;
//                 }
//                 System.out.println();
//                 }
//         }
// }



