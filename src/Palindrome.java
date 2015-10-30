/**
 * Created by Вадик on 30.10.2015.
 */
public class Palindrome {
    public static char first (String str){
        return str.charAt(0);
    }

    public static char last (String str){
        return str.charAt(str.length() - 1);
    }

    public static String middle(String str){
        return str.substring(1, str.length() - 1);
    }

    public static void main(String args[]){

    //    System.out.println(isPalidrome("afffa"));
        System.out.println(isAbecedarian("abc"));
    }

    /*
    Ex. 8.9 Think Java
    *Palindrome checking
     */

    public static boolean isPalidrome(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return true;
        }

        if ((str.length() == 2) && (first(str) == last(str) )) {
            return true;
        }

        if (first(str) == last(str)) {
                return isPalidrome(middle(str));
            }
         return false;

        }

/*
* Ex. 8.10 from Think Java
* Abecederian check*/

    public static boolean isAbecedarian(String str){
        String tempSubstr;

        if(str.length()>1) {
            tempSubstr=str.substring(1,str.length()-1);
        } else return true;

        if(str.charAt(0)<str.charAt(1)){
            return isAbecedarian(tempSubstr);
        }
        return false;

    }

}
