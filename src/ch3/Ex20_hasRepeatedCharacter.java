package ch3;

public class Ex20_hasRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(hasRepeatedCharacter("aba"));
        // 문자열을 입력받아 해당 문자열에 중복된 문자(letter)가 존재하는지 여부를 리턴
    }
    public static boolean hasRepeatedCharacter(String str) {
        // boolean 타입을 리턴해야 합니다.
        // 이중 반복문(double for loop)을 사용해야 합니다.
        // 빈 문자열을 입력받은 경우에는 false을 리턴해야 합니다.

        for (int i=0; i < str.length()-1; i++) {        // 중복 문자 맨 마지막은 x
            for (int j = i+1; j < str.length(); j++) {  // charAt(i) == charAt(i+1) 비교
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}