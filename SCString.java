// public class SCString {
//     public static void main(String[] args){
//         String str = "programmer@gmail.com";
//         int i=str.indexOf("@");
//         String uname=str.substring(0,i);
//         String domain=str.substring(i+1, str.length());
//         System.out.println("Username : "+uname);
//         System.out.println("Domain : "+domain);
//         System.out.println(domain.startsWith("gmail"));

//         int j=domain.indexOf(".");
//         String name=domain.substring(0,j);
//         System.out.println(name.equals("gmail"));
//     }
    
// }





// ++++++++++++++++++++++++++++ Checking Binary number or not +++++++++++++++++++++++++++++++++++++++
// public class SCString{
//     public static void main(String[] args){
//         int b = 1000110;
//         String str = String.valueOf(b);
//         System.out.println(str.matches("[01]+"));
//     }
// }





// ++++++++++++++++++++++++++ Checking a Number is Hexa Decimal or not +++++++++++++++++++++++++++++++

// public class SCString{
//     public static void main(String[] args){
//         String str = "B234A";
//         System.out.println(str.matches("[0-9A-F]+"));
//     }
// }




// +++++++++++++++++++++++++++++++++++ Remove Special characters from String +++++++++++++++++++++++++++++
// import java.util.*;
// public class SCString{
//     public static void main(String[] args){
//         String str = "a!B@c#1$2%3";
//         System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
//     }
// }



// +++++++++++++++++++++++++++++++++++Remove Extra Spaces from String +++++++++++++++++++++++++++++++++++
// public class SCString{
//     public static void main(String[] args){
//         String str = "    abc      def    gh    ijk        ";
//         System.out.println(str.replaceAll("\\s+", " ").trim());
//     }
// }








// +++++++++++++++++++++++++ Number of words in string ++++++++++++++++++++++++++++++++
public class SCString{
    public static void main(String[] args){
        String str = "   abc    def    gh    ijk     ";
        str = str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
}