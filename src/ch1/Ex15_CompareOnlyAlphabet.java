package ch1;

public class Ex15_CompareOnlyAlphabet {
    public static void main(String[] args) {
        System.out.println(compareOnlyAlphabet("hi","Hi"));
    }
    public static boolean compareOnlyAlphabet(String str1, String str2){
        return  str1.toLowerCase().equals(str2.toLowerCase());
//        return  str1.equalsIgnoreCase(str2);      // 대소문자 구분 x
//        return str1.equals(str2);                 // str1.equals(str2) (o)  str1 == str2 (x) 문자열 비교, 대소문자 구분
    }
}
