package ch3;

public class Ex16_getSumOfFactors {
    public static void main(String[] args) {
        System.out.println(getSumOfFactors(8)); // 수를 입력받아 약수(factor)의 합을 리턴해야 합니다. -> 15 (1+2+4+8)
    }
    public static int getSumOfFactors(int num) {
        // int 타입을 리턴해야 합니다.

        int result = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                result += i;        // i로 나누었을 때 나머지가 없을 경우 -> 약수 -> result에 추가
            }
        }
        return result;
    }
}