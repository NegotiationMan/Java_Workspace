package ch1;

public class Ex14_ComputeAverageLengthOfWords2 {
    public static void main(String[] args) {
        System.out.println(computeAverageLengthOfWords2("Hello","World"));
    }
    public static int computeAverageLengthOfWords2(String word1, String word2){
        double meanLength = (word1.length()+word2.length())/2;
        return (int)Math.floor(meanLength);     // 자바 내림 Math.floor
    }
}
