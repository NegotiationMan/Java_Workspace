package ch3;

public class Ex12_getMaxNumberFromString {
    public static void main(String[] args) {
        System.out.println(getMaxNumberFromString("14357")); // 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴
    }
    public static int getMaxNumberFromString(String str) {
        // int 타입을 리턴해야 합니다.
        // str.split 사용은 금지됩니다.
        // 빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
        int result = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.getNumericValue(str.charAt(i))>result){
                result = Character.getNumericValue(str.charAt(i));  // char to int 꼭 외우기 !
            }
        }
        return result;
    }
}