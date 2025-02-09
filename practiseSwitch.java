// ************************ Practise Switch case  By using Int ************************

// public class practiseSwitch {
//     public static void main(String[] args){
//         int n = 2;
//         switch(n){
//             case 1: System.out.println("One");
//                     break;
//             case 2: System.out.println("Two");
//                     break;
//             case 3: System.out.println("Three");
//                     break;
//             default : System.out.println("Invalid");
//         }
//     }
// }


// ++++++++++++++++++++++++ Practise Switch case By using String ++++++++++++++++++++++++++++


// public class practiseSwitch {
//     public static void main(String[] args){
//         String str = "Two";
//         switch(str){
//             case "One": System.out.println("One");
//                     break;
//             case "Two": System.out.println("Two");
//                     break;
//             case "Three": System.out.println("Three");
//                     break;
//             default : System.out.println("Invalid");
//         }
//     }
// }




// ++++++++++++++++++++++++ Display name of a day based on number +++++++++++++++++++
//import java.util.*;
// public class practiseSwitch{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter a day number: ");
//         int day = SC.nextInt();
//         switch(day){
//             case 1: System.out.println("Monday");
//                     break;
//             case 2: System.out.println("Tuesday");
//                     break;
//             case 3: System.out.println("Wednesday");
//                     break;
//             case 4: System.out.println("Thursday");
//                     break;
//             case 5: System.out.println("Friday");
//                     break;
//             case 6: System.out.println("Saturday");
//                     break;
//             case 7: System.out.println("Sunday");
//                     break;
//             default: System.out.println("Invalid Day Number");
//                     break;
//         }

//     }
// }








// ++++++++++++++++++++++ Display type of website ++++++++++++++++++++

// import java.util.*;
// public class practiseSwitch{
//     public static void main(String[] args){
//         Scanner SC = new Scanner(System.in);
//         System.out.println("Enter Domain name: ");
//         String domain = SC.nextLine();
//         String ext = domain.substring(domain.lastIndexOf(".") + 1);
//         switch(ext){
//             case "com": System.out.println("Commercial Website");
//                       break;
//             case "org": System.out.println("Organization Website");
//                       break;
//             case "net": System.out.println("Networking Website");
//                       break;
//             case "edu": System.out.println("Educational Website");
//                       break;
//             case "gov": System.out.println("government Website");
//             default: System.out.println("Unknown Website");
//                       break;
//         }
//     }
// }




// ++++++++++++++ Make a menu driven program for arithmetic operation ++++++++++++++++++

import java.util.*;
public class practiseSwitch{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter Two Numbers");
        int x = SC.nextInt();
        int y = SC.nextInt();
        SC.nextLine();
        System.out.println("Enter option in Words");
        String option = SC.nextLine();
        option = option.toUpperCase();
        switch(option){
            case "ADD": System.out.println("Sum is "+(x+y));
                        break;
            case "SUB": System.out.println("Difference is "+(x-y));
                        break;
            case "MUL": System.out.println("Product is "+(x*y));
                        break;
            case "DIV": System.out.println("Ratio is "+(x/y));

            default : System.out.println("Invalid option");
                      break;
        }
    }
}

