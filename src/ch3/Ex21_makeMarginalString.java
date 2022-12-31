package ch3;

public class Ex21_makeMarginalString {
    public static void main(String[] args) {
        System.out.println(makeMarginalString("abc"));  // aababc
        // 문자열을 입력받아 해당 문자열을 처음부터 한 글자(letter)씩 다시 작성
    }
    public static String makeMarginalString(String str) {
        // String 타입을 리턴해야 합니다.
        // 이중 반복문(double for loop)을 사용해야 합니다.
        // str.split, str.substring 사용은 금지됩니다.
        // 빈 문자열을 입력받은 경우에는 빈 문자열을 리턴해야 합니다.
        String result = "";

        for(int i=0; i<str.length(); i++){      // 첫번째 문자부터 마지막 문자까지
            for(int j=0; j<=i; j++){
                result += str.charAt(j);        // a ab abc -> 3번 반복
            }
        }
        return result;
    }
}
