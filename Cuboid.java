import java.lang.*;
import java.util.*;
public class Cuboid {
    public static void main(String[] args){
        Scanner SC  = new Scanner(System.in);
        int length,breadth,height;
        int totalarea,volume;
        System.out.println("Enter the values of length breadth and height:");
        length = SC.nextInt();
        breadth = SC.nextInt();
        height = SC.nextInt();
        totalarea = 2*(length*height+breadth*height+length*breadth);
        volume = length*breadth*height;
        System.out.println("Total area is "+totalarea);
        System.out.println("Volume is "+volume);
    }
    
}
