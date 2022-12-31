package ch3;

public class Ex05_makeDigits {
    public static void main(String[] args) {
        System.out.println(makeDigits(3));
    }
    public static String makeDigits(int num){
        // string 타입을 리턴해야 합니다
        // 반복문(for)문을 사용해야 합니다.
        // 숫자(number string) 사이의 구분은 없습니다. ('1234567')
        String str = "";
        for(int i=1; i<=num; i++){
            // String 타입의 값과 int타입의 값을 더해주는 경우, 자동으로 int타입의 값은 String으로 변환되어 저장됩니다.
            // "123"+1 -> 1231, 1+"123" -> 1123
            str += i;
        }
        return str;
    }
}
