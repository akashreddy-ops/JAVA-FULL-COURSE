import java.util.*;
public class LeapYear{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Leap Year: ");
        int year = SC.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0){
                    System.out.println("Its a Leap Year");
                }
                else
                    System.out.println("Not a Leap Year");
            }
            else
            {
                System.out.println("Its a Leap Year: ");
            }
        }
    }
}
   
