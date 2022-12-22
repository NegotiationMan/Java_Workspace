package ch2;

public class Ex05_isEven {
    public static void main(String[] args) {
        System.out.println(isEven(10));
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;        // 짝수면 true 반환
        }
        return false;           // 홀수면 false 반환
    }
}
