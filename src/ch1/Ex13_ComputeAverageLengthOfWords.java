package ch1;

public class Ex13_ComputeAverageLengthOfWords {
    public static void main(String[] args) {
        System.out.println(computeAverageLengthOfWords("hello", "world"));
    }
    public static int computeAverageLengthOfWords(String word1, String word2){
        int length1 = word1.length();
        int length2 = word2.length();
        int lengthMean = (length1+length2)/2; // 연산자의 우선 순위 생각 !

        return lengthMean;
//        return (word1.length()+word2.length())/2;   // 따로 변수 생성하지 않고 바로 return
    }
}
