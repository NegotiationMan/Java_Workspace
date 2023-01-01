package ch4;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex11_addToBack {
    public static void main(String[] args) {
        System.out.println(addToBack(new int[]{1,2},3));
        System.out.println(Arrays.toString(addToBack(new int[]{1,2},3)));
        // 배열과 요소를 입력받아 주어진 요소를 배열의 맨 뒤에 추가하고 해당 배열을 리턴  -> [1, 2, 3]
    }
    public static int[] addToBack(int[] arr, int el) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.

//        int[] arr2 = new int[arr.length+1];
        //System.arraycopy(arr, 0, arr2, 0, arr.length);  // 배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length+1);
        arr2[arr.length] = el;      // 마지막 인덱스에 el 넣기

        return arr2;
    }
}

