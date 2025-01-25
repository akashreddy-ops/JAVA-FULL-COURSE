

 // +++++++++++++++++++++ Even Or Odd Number ++++++++++++++++++++++++++++++++
// import java.util.*;
// public class EvenOrOdd {
//     public static void main(String[] args){
//         int n;
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         n = SC.nextInt();
//         if(n%2==0){
//             System.out.println("It is a Even Number");
//         }
//         else{
//             System.out.println("It is a Odd Number");
//         }
//     }
// }



// ++++++++++++++++++++++++++++ Person is Young or Not young ++++++++++++++++++++++++++++++++
import java.util.*;

public class EvenOrOdd{
    public static void main(String[] args){
        int age;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        age = SC.nextInt();
        if (age >=15 && age <= 55){
            System.out.println("You are a Young");
        }
        else{
            System.out.println("You are not a Young");
        }
    }
}
