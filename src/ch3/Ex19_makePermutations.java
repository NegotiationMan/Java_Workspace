package ch3;

public class Ex19_makePermutations {
    public static void main(String[] args) {
        System.out.println(makePermutations("ab"));
        // 문자열을 입력받아 해당 문자열에 등장하는 각 문자(letter)를 가지고 만들 수 있는 길이 2의 문자열들을 리턴해야 합니다.
    }
    public static String makePermutations(String str) {
        // String 타입을 리턴해야 합니다.
        //  입력받은 문자열의 각 문자를 0, 1, 2, ..., n이라고 할 경우, 00,01,02,...,nn 형식으로 리턴해야 합니다.
        // 이중 반복문(double for loop)을 사용해야 합니다.
        // 빈 문자열을 입력받은 경우에는 빈 문자열을 리턴해야 합니다.

        String result = "";
        if(str.isEmpty()) {
            return "";
        }
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                result = result + str.charAt(i)+str.charAt(j)+",";
                // 왜 result += str.charAt(i)+str.charAt(j)+","; 는 안될까 ?           o
                // result += Character.toString(str.charAt(i))+str.charAt(j)+",";   x
                // 문자 먼저 더해져서 값이 이상하게 나온듯 하다. 문자열로 변환하니까 잘 됨
            }
        }
        return result.substring(0, result.length() -1); // .substring()이 빠지면 마지막 쉼표까지 나옴.
                                                        // .lenth()-1은 마지막 문자열 인덱스 의미.
    }
}