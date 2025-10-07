
import java.util.Arrays;

// Basic Structure of the Array
// import java.util.*; 
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.println("Enter 5 Integers, one at a time: ");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("you entered the following integers: ");
//         int size = arr.length;
//         for(int i=0; i<size; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




// Basic Array Stored Elements
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i=0; i<=size-1; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0; i<size; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// Question 18
// Sum and Multiplication of all number in Arrays
// public class Arrays{
//     public static void main(String[] args){
//         int x = 10;
//         int y = 25;
//         int z = x + y;
//         int k = x * y;
//         System.out.println("Sum of x+y = " + z);
//         System.out.println("Multiplication of x*y = " + k);
//     }
// }



// Question 19
// Sum of Even Numbers and Odd Numbers in a array 
// We are solving this question in two methods
// This is 1st method 
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5, 6};
//         int sum_even = 0;
//         int sum_odd = 0;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] %2 == 0){
//                 // sum_even = sum_even + arr[i]; // you create like this or below step follow 
//                 sum_even += arr[i];
//             }
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] %2 != 0){
//                 // sum_odd = sum_odd + arr[i];  // Here also same follow as well as above we said 
//                 sum_odd += arr[i];
//             }
//         }
//         System.out.println(sum_even);
//         System.out.println(sum_odd);
//     }
// }


// Second Method 
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5, 6};
//         int sum_even = 0;
//         int sum_odd = 0;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] %2 == 0){
//                 sum_even += arr[i];
//             }
//             else if(arr[i] %2 != 0){
//                 sum_odd = arr[i];
//             }
//         }
//         System.out.println(sum_even);
//         System.out.println(sum_odd);
//     }
// }




// Question 20 
// Sum of even index and odd index in an array
// In this question also we are using two methods as well as 1st question 
// 1st method
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {10, 20, 30, 40, 50, 60};
//         int even_ind_sum = 0;
//         int odd_ind_sum = 0;

//         for(int i=0; i<arr.length; i++){
//             if(i %2 == 0){
//                 // even_ind_sum = even_ind_sum + arr[i];
//                 even_ind_sum += arr[i];
//             }
//         }

//         for(int i=0; i<arr.length; i++){
//             if(i %2 != 0){
//                 // odd_ind_sum = odd_ind_sum + arr[i];
//                 odd_ind_sum += arr[i];
//             }
//         }

//         System.out.println(even_ind_sum + " " + odd_ind_sum); // you can write like this also single line printing 
//     }
// }


// Second Method
// This method is Senior Steps to be used
// But I will prefer we are use 1st method Bcz loops how it will be working you know clarity 
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {10, 20, 30, 40, 50, 60};
//         int even_ind_sum = 0;
//         int odd_ind_sum = 0;

//         for(int i=0; i<arr.length; i++){
//             if(i %2 == 0){
//                 even_ind_sum += arr[i];
//             }
//             else{
//                 odd_ind_sum += arr[i];
//             }
//         }
//         System.out.println(even_ind_sum + " " + odd_ind_sum);
//     }
// }






// Question 21
// Sum of pairs using single Array
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5,6};
//         int n = arr.length;
//         int sum = 0;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 sum += arr[i] + arr[j];
//             }
//         }
//         System.out.println("Total pair Sum is: " + " " + sum);
//     }
// }




// Question 22 
// Sum of pairs using two Arrays
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr1 = {1, 2, 3};
//         int[] arr2 = {4, 5, 6};

//         int n = arr1.length;
//         int m = arr2.length;
//         int sum = 0;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 sum += arr1[i] + arr2[j];
//             }
//         }
//         System.out.println(sum);
//     }
// }




// Question 23
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr1 = {1, 2, 3, 4};
//         int[] arr2 = {4, 5, 6, 7};

//         int n = arr1.length;
//         int m = arr2.length;

//         int mx_sum = 0;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 int sum = arr1[i] + arr2[j];

//                 // mx_sum = Math.max(mx_sum, sum);  // You can Math.max or you can use if condition

//                 if(sum > mx_sum){
//                     mx_sum = sum;
//                 }
//             }
//         }
//         System.out.println(mx_sum);
//     }
// }



// Question 24
// Triplet Sum in an Array
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4};
//         for(int i=0; i<arr.length-2; i++){
//             for(int j=i+1; j<arr.length-1; j++){
//                 for(int k=j+1; k<arr.length; k++){
//                     int sum = arr[i] + arr[j] + arr[k];
//                     System.out.println(sum);
//                 }
//             }
//         }
//     }
// }




// Question 25
// Count of odd and even triplet sum
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5, 6};
        
//         int even_sum = 0;
//         int odd_sum = 0;

//         for(int i=0; i<arr.length-2; i++){
//             for(int j=i+1; j<arr.length-1; j++){
//                 for(int k=j+1; k<arr.length; k++){
//                     int sum = arr[i] + arr[j] + arr[k];
//                     if(sum % 2 == 0){
//                         even_sum++;
//                     }else{
//                         odd_sum++;
//                     }
//                 }
//             }
//         }
//         System.out.println(even_sum);
//         System.out.println(odd_sum);
//     }
// }




// Question 26
// Count of Distinct Element
// import java.util.*;
// import java.util.Arrays;
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {2, 3, 5, 3, 6, 2};
//         int n = arr.length;
//         boolean[] vis = new boolean[101];
//         Arrays.fill(vis, false);
//         int count = 0;

//         for(int i=0; i<n; i++){
//             if(vis[arr[i]] == false){
//                 count++;
//                 vis[arr[i]] = true;
//             }
//         }
//         System.out.println(count);
//     }
// }



// Question 28
// Prime Numbers Between range
// public class Main{
//     public static void main(String[] args){
//         int n = 20;

//         for(int i=1; i<=n; i++){
//             int count = 0;
//             for(int j=1; j<=i; j++){
//                 if(i % j == 0){
//                     count++;
//                 }
//             }
//             if(count == 2){
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }




// Question 28
// Reverse Numbers sum between Range
// public class Main{
//     public static void main(String[] args){
//         int s = 21;
//         int e = 25;
//         int sum = 0;
//         for(int i=s; i<=e; i++){
//             int rev = 0;
//             int num = i;
//             while(num > 0){
//                 int rem = num % 10;
//                 rev = rev * 10 + rem;
//                 num = num / 10;
//             }
//             sum += rev;
//         }
//         System.out.println(sum);
//     }
// }




// Question 29
// First and Last Index of a target element
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {3, 4, 5, 6, 7, 8, 8, 10};
//         int target = 8;
//         int first_ind = -1;
//         int last_ind = -1;
//         // first index
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 first_ind = i;
//                 break;
//             }
//         }
//         // last index
//         for(int i=arr.length-1; i>=0; i--){
//             if(arr[i] == target){
//                 last_ind = i;
//                 break;
//             }
//         }
//         System.out.println(first_ind);
//         System.out.println(last_ind);
//     }
// }




// Question 30
//count Frequency of each element
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {2, 3, 4, 5, 2, 3};
//         int n = arr.length;
//         boolean[] vis = new boolean [n];
//         Arrays.fill(vis, false);

//         for(int i=0; i<n; i++){
//             if(vis[i] == false){
//                 vis[i] = true;
//                 int count = 1;

//                 for(int j=i+1; j<n; j++){
//                     if(arr[i] == arr[j]){
//                         vis[j] = true;
//                         count++;
//                     }
//                 }
//                 System.out.println(arr[i] + "->" + count);
//             }
//         }
//     }
// }