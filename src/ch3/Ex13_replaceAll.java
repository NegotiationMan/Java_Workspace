package ch3;

public class Ex13_replaceAll {
    public static void main(String[] args) {
        System.out.println(replaceAll("loop",'o','q')); // str 문자열 중 from 문자를 to 문자로 변환
    }
    public static String replaceAll(String str, char from, char to) {
        // String 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==from){
                result += to;
            }
            else{
                result += str.charAt(i);
            }
        }
        return result;
    }
}