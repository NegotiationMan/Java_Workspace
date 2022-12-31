package ch3;

public class Ex15_computePower {
    public static void main(String[] args) {
        System.out.println(computePower(2,3)); // 밑(base)과 지수(exponent)를 입력받아 밑의 거듭제곱 리턴 -> 8

    }
    public static int computePower(int base, int exponent) {
        // int 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // Math.pow, 거듭제곱 연산자 사용은 금지됩니다. (거듭제곱은 자바에서 제공하는 Math를 통해 쉽게 구할 수 있습니다.)

        int result = 1;
        for(int i=0; i<exponent; i++){
            result *= base;                 // result = result * 2;
        }
        return  result;

    }
}