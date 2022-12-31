package ch3;

public class Ex02_isOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(17));
    }
    public static boolean isOdd(int num){
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        // while문 사용, 나눗셈.나머지 사용불가, 0은 짝수
        /*
        while(true){                // 무한반복문
            if((num&1)==1){         // 비트 연산자로 홀수 구분, 마지막이 1이면 무조건 홀수 !
                return true;        // 홀수 -> true값 반환
            }else{
                return false;       // 짝수 -> false값 반환
            }
        }
        */
        // 음수는 양수로
        if(num<0){
            num = -num;
        }
        // 반복문으로 홀수인지 확인
        while(num>0){

        }
        return false;
    }
}
