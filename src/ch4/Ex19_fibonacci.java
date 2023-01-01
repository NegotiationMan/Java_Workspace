package ch4;

import java.util.Arrays;

public class Ex19_fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(Arrays.toString(fibonacci(8)));
        // 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1, 그 다음 2번째 피보나치 수부터는 바로 직전의 두 피보나치 수의 합으로 정의
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
    }

    public static int[] fibonacci(int num) {
        // int 타입을 요소로 가지는 배열을 리턴
        // 반복문(for)문을 사용
        // 피보나치 수열은 0번부터 시작
        int[] array = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i <= 1) {
                array[i] = i;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        return array;
    }
}

