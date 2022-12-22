package ch1;

public class Ex10_ConvertToChar {
    public static void main(String[] args) {
        System.out.println(convertToChar(4));
        char c = '0';
        System.out.println((int)c);
    }
    public static char convertToChar(int num){
        char result;
        result = Character.forDigit(num, 10); // int -> char
//        result = (char)(num+'0');                 // char '0'을 int로 변환하면 48 값
        return result;
    }
}
