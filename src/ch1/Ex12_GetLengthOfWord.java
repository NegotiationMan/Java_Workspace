package ch1;

public class Ex12_GetLengthOfWord {
    public static void main(String[] args) {
        System.out.println(getLengthOfWord("안녕"));
    }
    public static int getLengthOfWord(String word){
        return  word.length();  // 문자열 길이
    }
}
