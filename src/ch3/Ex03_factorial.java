package ch3;

public class Ex03_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        // int 타입을 리턴해야 합니다.
        // 1 * 2 * ... * num
        // 반복문(for)문을 사용해야 합니다.
        // factorial(0)은 1로 정의됩니다.
        // 음수 입력은 들어오지 않습니다.
        int total = 1;
        for(int i=1; i<=num; i++){
            total *= i;             // 1*2*3*4*5 -> 120
        }
        return total;
    }
}
