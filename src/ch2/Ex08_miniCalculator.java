package ch2;

public class Ex08_miniCalculator {
    public static void main(String[] args) {
        System.out.println(miniCalculator(2, 2, '+'));
    }
    public static int miniCalculator(int num1, int num2, char operator){
        if(operator=='+'){
            return num1+num2;       // num+num2 값 반환
        }else if(operator=='-'){
            return num1-num2;       // num-num2 값 반환
        }else if(operator=='*'){
            return num1*num2;       // num*num2 값 반환
        }else if(operator=='/'){
            return num1/num2;       // num/num2 값 반환
        }else if(operator=='%'){
            return num1%num2;       // num%num2 값 반환
        }else{
            return 0;               // operator가 +,-,*,/,% 중에 없으면 0값 반환
        }
    }
}
