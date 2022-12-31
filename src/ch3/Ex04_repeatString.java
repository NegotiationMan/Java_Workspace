package ch3;

public class Ex04_repeatString {
    public static void main(String[] args) {
        System.out.println(repeatString("code",3));
    }
    public static String repeatString(String str,int num){
        // string 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // 0을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
        String result = "";
        // str이 빈 경우는 ? // str.isEmpty()
        // num이 0인 경우는 ?

        for(int i=0; i<num; i++){
            result += str;
        }
        return result;
    }
}
