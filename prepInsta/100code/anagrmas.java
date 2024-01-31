import java.util.*;
public class anagrmas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first string:- ");
        String word = sc.next();
        System.out.println("Write the second string:- ");
        String anagram = sc.next();
        System.out.println("Is the given anagram is :- " + isAnagram(word, anagram));

    }
    public static boolean isAnagram(String word,String anagram){
        if(word.length() != anagram.length())
        return false;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index+1,anagram.length());
            }else
            return false;
        }
        return anagram.isEmpty();
    } 
}