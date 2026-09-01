
import java.util.Scanner;
//BRUTE FORCE => SORTING time => O(nlogn) and space =>O(n)
/* 
public class ValidAnagram{
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first string:");
    String s = sc.nextLine();
    System.out.println("enter second string");
    String t = sc.nextLine();
    boolean result = isAnagram(s,t);
    System.out.println("Is Anagram: "+ result);
    sc.close();
}
}*/
public class ValidAnagram{
    public static boolean isAnagram(String s,String t)

    {
        if (s.length() != t.length()) {
            return false;
        }

        int [] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;

        }
        for(int num:count){
            if(num!=0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);

        sc.close();
}
}