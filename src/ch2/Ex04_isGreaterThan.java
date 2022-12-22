package ch2;

public class Ex04_isGreaterThan {
    public static void main(String[] args) {
        System.out.println(isGreaterThan(11, 11));
    }
    public static boolean isGreaterThan(int num1, int num2){
        if(num2>num1){
            return true;    // num2가 num1보다 클 경우 true
        }
        return false;       // else문 생략하고 바로 return문 가능
    }
}
