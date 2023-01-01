package ch4;

import java.util.Arrays;

public class Ex10_addToFront {
    public static void main(String[] args) {
        System.out.println(addToFront(new int[]{1,2},3));
        System.out.println(Arrays.toString(addToFront(new int[]{1,2},3)));
        // 배열과 요소를 입력받아 주어진 요소를 배열의 맨 앞에 추가하고 해당 배열을 리턴 -> {3, 1, 2}
    }
    public static int[] addToFront(int[] arr, int el) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.
        int[] arr2 = new int[arr.length+1];

        arr2[0] = el;   // 0번째 인덱스에 el 넣기

        System.arraycopy(arr, 0, arr2, 1, arr.length);  // 배열 복사
        /*
        - 첫번째 인자 : 복사할 배열
        - 두번째 인자 : 복사를 시작할 배열의 위치
        - 세번째 인자 : 붙여넣을 배열
        - 네번째 인자 : 복사된 배열값들이 붙여질 시작위치 (차례대로 붙여 넣어진다)
        - 다섯번째 인자 : 지정된 길이만큼 값들이 복사된다.
        */

        return arr2;
    }
}

