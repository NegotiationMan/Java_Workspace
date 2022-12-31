package ch3;

public class Ex14_characterAndNumber {
    public static void main(String[] args) {
        System.out.println(characterAndNumber("hello")); // 각 문자 뒤에 인덱스 표시하기 -> h0e1l2l3o4
    }
    public static String characterAndNumber(String word) {
        // String 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // 빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.

        String result = "";
        for(int i=0; i<word.length(); i++){
            result += String.valueOf(word.charAt(i)) + i;       // String.ValueOf() : String 으로 변환
            // result += word.charAt(i) + String.valueOf(i);    // null 값 들어오면 null 반환
        }
        return  result;
    }
}