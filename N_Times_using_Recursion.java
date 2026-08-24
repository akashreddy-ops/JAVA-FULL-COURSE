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


// Print 1 To N using Recursion
