package CODE_IO_JAVA_BASIC_OOPS;

public class LetterCount {
        public static void main(String[] args) {
         String word="Code IO";
         System.out.println(word);

         int count=0;
         for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i)))
            count++;
         }
         System.out.println("Letter count: " + count);
        }   
}
