
/**
 * We can write
 *
 * @author (Linda Domingez)
 * @version (2/6/23)
 * 
 */
public class FunWithStrings
{
        /**
     * Makes new String from s1, that's reversed
     *
     * @param  String 1
     * @return returns reversed s1
     */
    public static String reverseString(String s1){
        int length = s1.length();
        int i;
        StringBuilder s2 = new StringBuilder();
        // char characterAt = s1.charAt(i);
        if (length<1){
            return s1;
        }

        for (i = length -1; i>= 0; i--){
            s2.append(s1.charAt(i));
        }
        return s2.toString();
    }

        /**
     * Uses method to determine whether strings are the same back and forth
     *
     * @param  String s1, String s2
     * @return   whether strings are the same back and forth
     */public static int areTheSame(String s1, String s2){
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len == s2Len){
            for (int i =0;i<s1Len; i++){
                // if (s1.charAt(i) != s2.charAt(i)){
                // return s1.charAt(i);
                // }
                if (s1.charAt(i) != s2.charAt(i)) {
                    return i;
                }
            }
            if (s1.length() != s1.length()) {
                return s1Len;
            }

        }
        return -1;
    }

    /**
     * Uses boolean to tell whether s1 and reversed s1 are the same
     *
     * @param  String s1
     * @return   true or false
     */
    public static boolean sameBackandForth(String s1){
        int len = s1.length();
        String s2 = reverseString(s1);

        int i;
        for (i = 0; len>i; i++){
            if (s1.charAt(i) == s2.charAt(i)){
                return true;
            }

        } 
        return false;
    }

    /**
     * Uses all methods on an input string
     *
     * @param  String s1
     * @return   uses the methods defined to determine: 
     * a new String 2(String 1 reversed), whether the strings 
     * have the same characters, and if the strings are the 
     * same back and forth
     */

    //given a string, figure out whether it reads the 
    //same back and forth//
    public static void main(String args[]){

        String input;
        input = "dad";System.out.println(input + 
            "? Expect:TRUE");
        System.out.println(FunWithStrings.sameBackandForth(input));

        input = "123456";System.out.println(input + 
            "? Expect:False");
        System.out.println(FunWithStrings.sameBackandForth(input));
        
                input = "1234567";System.out.println(input + 
            "? Expect:True");
        System.out.println(FunWithStrings.sameBackandForth(input));
        
        input = "heytgere";System.out.println(input + 
            "? Expect:False");
        System.out.println(FunWithStrings.sameBackandForth(input));
        
                input = "wineskam";System.out.println(input + 
            "? Expect:False");
        System.out.println(FunWithStrings.sameBackandForth(input));

    }
}
