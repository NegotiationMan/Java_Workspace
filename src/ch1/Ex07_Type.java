package ch1;

public class Ex07_Type {
    public static void main(String[] args) {
        int num;
        char thing;

        num = 3;        // num에 숫자(int) 3을 할당
        thing = 'A';    // thing 문자(char) A를 할당
        System.out.println(goCheck(num, thing));
    }

    public  static String goCheck(int num, char thing){
        return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
    }
}
