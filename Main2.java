
//Basic code of 2d Arrays
// public class Main2 {
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
//         System.out.println(arr.length);
//         System.out.println(arr[0].length);
//     }
// }

// ++++++++++++++++++++++ (or) This Method ++++++++++++++++++++

// public class Main2{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//         int row = arr.length;
//         int col = arr[0].length;

//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// Question 31
// Left_diagonal and Right_diagonal with repeating and without repeating
// public class Main2{
//     public static void main(String[] args){
//         int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//         int row = mat.length;
//         int col = mat[0].length;
//         int left_sum = 0;
//         int right_sum = 0;
//                 // Left diagonals
//         System.out.println("Left Diagonals Elements is: ");
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(i == j){
//                     System.out.print(mat[i][j] + " ");
//                     left_sum += mat[i][j];
//                 }
//             }
//         }
//         System.out.println();

//                 // Right Diagonals
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(i+j == row - 1 && i != j){
//                     System.out.print(mat[i][j] + " ");
//                     right_sum += mat[i][j];
//                 }
//             }
//         }
//         System.out.println();

//         // Differenece b/w right_dig and left_dig

//         System.out.println("Diff b/w Summation of Left_dig and Right_dig is: ");

//         if(left_sum > right_sum){
//             System.out.print(left_sum - right_sum);
//         }else{
//             System.out.print(right_sum - left_sum);
//         }
//     }
// }




// Question 32
// // Print The Boundary Elements
// public class Main2{
//     public static void main(String[] args){
//         int [][] arr={{1,2,3,4},{5,6,7,8},{6,7,8,9}};
//         int row= arr.length;
//         int col= arr[0].length;
    
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i==0 || j==0 || i==row-1 || j==col-1){
//                     System.out.print(arr[i][j]+" ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }



// Question 33
// Print the elements in Z form
// public class Main2{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3,4},{5,6,7,8},{4,5,6,7},{6,7,8,9}};
//         int row = arr.length;
//         int col = arr[0].length;

//         //First Row
//         int i = 0;
//         for(int j=0; j<col-1; j++){
//             System.out.print(arr[i][j] + " ");
//         }

//         // Right Diagonal
//         for(int m=0; m<row; m++){
//             for(int n=0; n<row; n++){
//                 if(m+n == row-1){
//                     System.out.print(arr[m][n] + " ");
//                 }
//             }
//         }
//         // Last Digit
//         i = row - 1;
//         for(int j=0; j<row; j++){
//             System.out.print(arr[i][j] + " ");
//         }
//     }
// }



// Question 34
// Transpose of Matrix
// public class Main2{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int row = arr.length;
//         int col = arr[0].length;
//         int[][] arr2 = new int[row][col];
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 arr2[i][j] = arr[j][i];
//             }
//         }
//         for(int i=0; i<arr2.length; i++){
//             for(int j=0; j<arr2.length; j++){
//                 System.out.print(arr2[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// Using one for loop  This is same Question ans for the above
// public class Main2{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
//         int row = arr.length;
//         int col = arr[0].length;
//         int[][] arr2 = new int[row][col];

//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 arr2[i][j] = arr[j][i];
//                 System.out.print(arr2[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }