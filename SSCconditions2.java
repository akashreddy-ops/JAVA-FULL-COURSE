
import java.util.*;
public class SSCconditions2 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String num;
        System.out.println("Enter a Number: ");
        num = SC.nextLine();
        if (num.matches("[01]+")){
            System.out.println("Binary Radix = 2");
        }
        else if (num.matches("[0-7]+")){
            System.out.println("Octal Radix = 8");
        }
        else if (num.matches("[0-9]+")){
            System.out.println("Decimal Radix = 10");
        }
        else if (num.matches("[0-9A-F]+")){
            System.out.println("Hexa Radix = 16");
        }
        else {
            System.out.println("Not a Number");
        }
    }
    
}
