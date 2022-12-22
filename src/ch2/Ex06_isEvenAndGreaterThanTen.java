package ch2;

public class Ex06_isEvenAndGreaterThanTen {
    public static void main(String[] args) {
        System.out.println(isEvenAndGreaterThanTen(10));
    }
    public static boolean isEvenAndGreaterThanTen(int num){
        if((10<num)&&(num%2==0)){
            return true;        // num이 10보다 크고 짝수면 true 반환 -> and
        }
        return  false;
    }
}
