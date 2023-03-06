
/**
 * Make a RandomPassword.
 *
 * @ Linda Dominguez
 * @2/10/23
 */
import java.util.Random;
import java.util.Scanner;

public class RandomPasswords
{
    //Returns True if char is lower-case 
    // vowel(a,e,i,o,u), false otherwise

    public static boolean isVowel(char ch) {
        return (ch == 'A') || (ch == 'E') || (ch == 'I') 
        ||(ch == 'O') || (ch == 'U');
    }

    public static boolean isEven(int n){
        return (n % 2) == 0;
    }

    public static char makeVowel() {
        Random letter = new Random();
        String letters = "AEIOU";
        int newLetter = letter.nextInt(letters.length());
        char chosen = letters.charAt(newLetter);
        return chosen;
    }

    public static String generateRandomPassword(int n){
        // int length = String.valueOf(n).length();
        Random randomAnything = new Random ();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int newIndex = randomAnything.nextInt(letters.length());
        String nonV = Character.toString(makeVowel());

        String letterReturn = "";
        
        for (int i = 0; n >i; i++){
            if(isEven(i)){
                if (isVowel(letters[newIndex])){
                    letterReturn += letters[newIndex];                   
                }
                else {letterReturn += nonV;}
            }
            letterReturn += newIndex;
        }
        // int randomletter 
        // char letterRandom = random.next
        System.out.println(letterReturn);
    }
    //returns number of vowels in String s
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length");
        int passLength = sc.nextInt();
        // generateRandomPassword(passLength);

        System.out.println(generateRandomPassword(passLength));
    }}
