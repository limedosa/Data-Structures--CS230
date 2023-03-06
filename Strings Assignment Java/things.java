import java.util.Scanner;

// import java.io.*;
/**
 * Write a description of class FunWithStrings here.
 *
 * @author ()
 * @version ()
 */
public class things
{
    private String one;
    private String two;
    
    public static String reverseString(String s1){
        String string2 = "";
        char ch;
        for (int i = 0; i< s1.length(); i++){
            ch = s1.charAt(i);
            string2 = ch+string2;
        }
        return string2;
    }

    public static int areTheSame(String s1,String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        int i;
        for (i=0; i < length1 && i< length2;i++){
            if (s1.charAt(i) == s2.charAt(i)){
                return -1;
             }
             else{
                 return i;
             }
         }
         return 0;
        
     }
    
    // public static boolean sameBackAndForth(String s1){
        
     // }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to be reversed: ");
        String enter = sc.next();
        reverseString(enter);
        
        String reverse = reverseString(enter);
        System.out.println(reverse);
    }
}