package ch3;

public class Ex09_makeMultiplesOfDigit2 {
    public static void main(String[] args) {
        System.out.println(makeMultiplesOfDigit2(2, 2));
    } // 8, 10, 12 -> 3
    public static int makeMultiplesOfDigit2(int num1, int num2) {
        // int 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // num1이 num2보다 작지 않을 수도 있습니다.
        // 0은 2의 배수가 아니라고 가정합니다.
        int count = 0;
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        } else if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        } else if (num1 == num2) {
            if (num1 > 0) {
                if (num1 % 2 == 0) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        return count;
    }
}
// reference
/*
    int count = 0;
    int start = num1;
    int end = num2;

    if(num1 > num2){
        start = num2; // num2가 작으면 num2 먼저
        end = num1;
    }

    if(start == 0){
        start = 1;  //  시작이 0이라면 1부터
    }

    for(int i=start; i<=end; i+=){
        if(i%2==0){
            count += 1;
        }
    }
    return count;
 */