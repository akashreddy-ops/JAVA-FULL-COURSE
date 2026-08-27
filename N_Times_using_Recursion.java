// Print name n Times Using Recursion
class Solution{
    public void printName(String name, int count, int n){
        if(count == n){
            return;
        }
        System.out.println(name);
        printName(name, count + 1, n);
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        String name = "Akash";
        sol.printName(name, 0, n);
    }
}


// Print 1 To N using Recursion  // Forward Recursion
class Solution{
    public void printNumbers(int curr, int n){
        if(curr > n){
            return;
        }
        System.out.println(curr + " ");
        printNumbers(curr + 1, n);
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.printNumbers(1, n);
        System.out.println();
    }
}

// BackTracking
class Solution{
    public void printNumbers(int curr, int n){
        if(curr > n){
            return;
        }
        printNumbers(curr + 1, n);
        System.out.print(curr + " ");
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 10;
        sol.printNumbers(1, n);
        System.out.println();
    }
}



// Print N to 1 Using Recursion  // Forward Recursion
class Solution{
    public void printNumbers(int curr){
        if(curr < 1){
            return;
        }
        System.out.print(curr + " ");
        printNumbers(curr - 1);
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 10;
        sol.printNumbers(n);
        System.out.println();
    }
}

// BackTracking
class Solution{
    public void printNumbers(int curr){
        if(curr < 1){
            return;
        }
        printNumbers(curr - 1);
        System.out.print(curr + " ");
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 10;
        sol.printNumbers(10);
        System.out.println();
    }
}


// Sum of first N Natural Numbers  // We can use the formula for the sum of N numbers, i.e N(N+1)/2.
// Using Formula Directly
import java.util.*;
class Solution{
    public int sumOfNaturalNumbers(int n){
        return (n * (n + 1)) / 2;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n= sc.nextInt();
        System.out.println(sol.sumOfNaturalNumbers(n));
        sc.close();
    }
}

// Recursive Approach

import java.util.*;
class Solution{
    public int sumOfNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
}
public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol.sumOfNaturalNumbers(n));
        sc.close();
        
    }
}

// Factorial of a Number : Iterative and Recursive
// Iterative Solution 
public class Main{
    public static int factorial(int x){
        int ans = 1;
        
        for(int i=1; i<=x; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args){
        int x = 5;
        int result = factorial(x);
        System.out.println("The factorial of: " + x + " is " + result);
    }
}

// Recursive Solution
public class Main {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }
}


// Print Fibonacci Series up to Nth term
// Better Approach
public class FibonacciEfficient {
    public static void main(String[] args) {
        int n = 5;

        if (n == 0) {
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.println(0);
        } else {
            int secondLast = 0; // (i-2)th term
            int last = 1;       // (i-1)th term

            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(secondLast + " " + last + " ");

            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;  // Calculate current term
                secondLast = last;        // Slide the window
                last = cur;
                System.out.print(cur + " ");
            }
        }
    }
}


// Optimal Approach
public class RecursiveFibonacci {

    public static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }

        int last = fibonacci(N - 1);    // (N-1)th term
        int slast = fibonacci(N - 2);   // (N-2)th term

        return last + slast;
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(fibonacci(N)); 
    }
}

