package Practise;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "level";
        String temp=word;
        int n = word.length();
        String r = ""; // no space

        for (int i = n - 1; i >= 0; i--) { // fix the condition
            r = r + word.charAt(i);
        }
        System.out.println(r); //reverse the String

        if (temp.equals(r)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's Not a Palindrome"); 
        }
    }
}