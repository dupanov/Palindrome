import java.util.Scanner;

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

    //Testing and data i/o
    //    System.out.println(isPalidrome("afffa"));
    //    System.out.println(isAbecedarian("abc"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Input key" );
        int i = sc.nextInt();
        System.out.println(encode("xyz XYZ", i));
        System.out.println(decode(encode("xyz XYZ", i),i));
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

    /*
    * Ex. 8.12 word encoding method
    * */

    public static String encode(String str, int key) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (96 < str.charAt(i) && str.charAt(i) < 123  && str.charAt(i) + key > 122) {
                result += (char) ( str.charAt(i)+key - 122 + 96);
            } else if (64 < str.charAt(i) && str.charAt(i) < 91 && str.charAt(i) + key > 90) {
                result += (char) ( str.charAt(i)+key - 90 + 64);
            } else if ((str.charAt(i)<=96 || str.charAt(i) >= 123) && (str.charAt(i)<=64 || str.charAt(i) >= 91)){
                result+=(char)str.charAt(i);
            } else {
                result += (char) (str.charAt(i) + key);
            }
            }
        return result;
        }

    /*
    * Decode method
    * */
    public static String decode(String str, int key) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (96 < str.charAt(i) && str.charAt(i) < 123  && str.charAt(i) - key < 97) {
                result += (char) (122 - (96 - (str.charAt(i)-key)));
            } else if (64 < str.charAt(i) && str.charAt(i) < 91 && str.charAt(i) - key < 65) {
                result += (char) (90 - (64 - (str.charAt(i)-key)));
            } else if ((str.charAt(i)<=96 || str.charAt(i) >= 123) && (str.charAt(i)<=64 || str.charAt(i) >= 91)){
                result+=(char)str.charAt(i);
            } else {
                result += (char) (str.charAt(i) - key);
            }
        }
        return result;
    }



}
