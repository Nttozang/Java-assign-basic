package Lc;

public class SolutionMergs {
    public static void main(String[] args) {
        String result = mergeAlternately("abc","pqr");
        System.out.println(result);
    }
   public static String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder();
       int i = 0;
       int j = 0;
       while (i < word1.length() && j < word2.length()){
           sb.append(word1.charAt(i++));
           sb.append(word2.charAt(j++));
       }

       while (i < word1.length()){
           sb.append(word1.charAt(i++));
       }

       while (j < word2.length()){
           sb.append(word2.charAt(j++));
       }
       return sb.toString();
    }
}


