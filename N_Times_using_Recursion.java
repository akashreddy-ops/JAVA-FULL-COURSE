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

