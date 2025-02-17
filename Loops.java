// import java.util.*;
// public class Loops {
//     public static void main(String[] args){
//         int i=1;
//         while(i<100){
//             System.out.println(i);
//             i=i*2;
//         }
//     }
// }


// public class Loops {
//     public static void main(String[] args){
//         byte i = 1;
//         while(true){
//             System.out.println(i);
//             i++;
//         }
//     }
// }



// public class Loops{
//     public static void main(String[] args){
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }
//     }
// }




//       +++++++++++++++++++ Display Multiplication Table ++++++++++++++++++++++++++++++
// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n+" x "+i+" = "+n*i);
//         }
//     }
// }





// +++++++++++++++++++++ Find Sum of n Numbers +++++++++++++++++++++
// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//              int sum = 0;
//         for (int i = 1; i <= n; i++){
//             sum = sum + i;
//         }
//         System.out.println("Sum of "+n+" Number is "+sum);
//     }
// }




// +++++++++++++ Factorial of a Number +++++++++++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         long factorial = 1;
//         for (int i=1; i<=n; i++){
//             factorial = factorial * i;

//         }
//         System.out.println("Factorial is: "+ factorial);

//     }
// }




// +++++++++++++++++++++ Display Digits ++++++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int r;
//         while (n > 0){
//             r = n % 10;
//             n = n / 10;
//             System.out.println(r);
//         }
//         System.out.println(n);
//     }
// }




// +++++++++++++++++++++ Count Digits of a Number +++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int count = 0;
//         while (n > 0){
//             n = n / 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }



// +++++++++++++++++++++ Finding a Number is Armstrong or Not +++++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int m = n;
//         int sum = 0;
//         int r;
//         while(n>0){
//             r = n % 10;
//             n = n / 10;
//             sum = sum + r * r * r;
//         }
//         if (sum == m){
//             System.out.println("It is a Armstrong Number");
//         }else{
//             System.out.println("It is not a Armstrong");
//         }
//     }
// }




// ++++++++++++++++++++++ Reverse a Number ++++++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int reverse = 0, r;
//         while (n>0){
//             r = n % 10;
//             reverse = reverse * 10 + r;
//             n = n / 10;
//         }
//         System.out.println("Reverse number : "+ reverse);
//     }
// }


// ++++++++++ Check a number is Palindrome +++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int m = n;
//         int reverse = 0, r;
//         while (n>0){
//             r = n % 10;
//             reverse = reverse * 10 + r;
//             n /= 10;

//         }
//         if (reverse == m)
//             System.out.println("It is a Palindrome");
//         else
//             System.out.println("It is not a Palindrome");
//     }
// }




// +++++++++++++++++++ Display a number in words even with tailing 0 ++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = SC.nextInt();
//         int r;
//         String str ="";
//         while(n>0){
//             r = n % 10;
//             n = n / 10;
//             str = str + r;

//         }
//         System.out.println(str);
        
//         char c;
//         for (int i = str.length() - 1; i>=0; i--){
//             c = str.charAt(i);
//             switch(c){
//                 case '0': System.out.print("Zero "); 
//                     break;
//                 case '1': System.out.print("One "); 
//                     break;
//                 case '2': System.out.print("Two "); 
//                     break;
//                 case '3': System.out.print("Three "); 
//                     break;
//                 case '4': System.out.print("Four "); 
//                     break;
//                 case '5': System.out.print("Five "); 
//                     break;
//                 case '6': System.out.print("Six ");  
//                     break;
//                 case '7': System.out.print("Seven "); 
//                     break;
//                 case '8': System.out.print("Eight "); 
//                     break;
//                 case '9': System.out.print("Nine "); 
//                     break;
//             }
//         }
//     }
// }



// ++++++++++++++++++++++ Display AP Series +++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Program to print AP Series: ");
//         System.out.println("Enter a, d and n");

//         int a = SC.nextInt();
//         int d = SC.nextInt();
//         int n = SC.nextInt();

//         int term = a;
//         for (int i = 0; i < n; i++) {
//             System.out.println(term+",");
//             term=term+d;
//         }
//     }
// }



//    ++++++++++++++++++++ Dispaly GP Series ++++++++++++++++++++++++++

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Program to print GP Series: ");
//         System.out.println("Enter a, r and n");
//         int a = SC.nextInt();
//         int r = SC.nextInt();
//         int n = SC.nextInt();

//         int term = a;

//         for (int i = 0; i < n; i++){
//             System.out.print(term+",");
//             term = term * r;
//         }
//     }
// }



// ++++++++++++++++++++ Display Fibonacci Series +++++++++++++++++++++

import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("program to Fibonacci Series: ");
        System.out.println("Enter the Number of Terms");
        int n = SC.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i = 0; i < n-2; i++){
            c = a + b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
    }
}