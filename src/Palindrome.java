/**
 * Created by Вадик on 30.10.2015.
 */
public class Palindrome {
    public static char first (String str){
        return str.charAt(0);
    }

    public static char last (String str){
        return str.charAt(str.length()-1);
    }

    public static String middle(String str){
        return str.substring(1, str.length() - 1);
    }

    public static void main(String args[]){
        System.out.println(middle("as"));
        System.out.println(isPalidrome("арозвупаланалапуазора"));
    }

    public static boolean isPalidrome(String str){
        if(middle(str).length()==1 || middle(str).length()==0){
            return true;
        } else if(Palindrome.middle(str).length()==2){
            if(middle(str).charAt(0)==middle(str).charAt(1)){
                return true;
            } else return false;
        } else if(first(str) == last(str)) {
            return(isPalidrome(middle(str)));
        } else {return false;}
    }
}
