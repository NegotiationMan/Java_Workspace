package ch2;

public class Ex11_isEitherEvenAndLessThan9 {
    public static void main(String[] args) {
        System.out.println(isEitherEvenAndLessThan9(3, 8));
    }
    public static boolean isEitherEvenAndLessThan9(int num1, int num2) {
        if((num1%2==0)||(num2%2==0)){   // 둘 중 하나라도 짝수면 true
            if((num1<9)&&(num2<9)){     // 둘 다 9보다 작아야 됨
                return true;            // 두 조건 다 만족하면 true
            }
            return false;               // 둘 중 하나 짝수지만 둘 다 9보다 작지않음
        }
        return false;                   // 짝수도 없고 9보다 작지도 않음
    }
}
