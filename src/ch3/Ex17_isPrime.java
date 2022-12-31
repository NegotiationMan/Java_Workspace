package ch3;

public class Ex17_isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7)); // 1 이상의 자연수를 입력받아 소수(prime number)인지 여부를 리턴 -> 소수면 true
    }
    public static boolean isPrime(int num) {
        // boolean 타입을 리턴해야 합니다.

        if(num==1){
            return false;                   // 1은 소수가 아니다
        }

       for(int i=2; i<num; i++){
           if(num%i==0){
               return false;                // 2부터 자기자신 전까지 나누어 떨어지면 소수 x -> false
           }
       }
       return true;                         // 위 조건에 걸리지 않았으면 true
    }
}
// Math 제곱근 메서드를 이용해서 문제 풀어보기
/*

 */