package ch4;

import java.util.Arrays;

public class Ex12_mergeArrays {
    public static void main(String[] args) {
        System.out.println(mergeArrays(new int[]{1,2},new int[]{3,4}));
        System.out.println(Arrays.toString(mergeArrays(new int[]{1,2}, new int[]{3,4})));
        // 두 개의 배열을 입력받아 순서대로 합쳐진 배열을 리턴 -> [1, 2, 3, 4]
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.

        int[] arr3 = new int[arr1.length+arr2.length];  // arr3 배열 길이 arr1+arr2

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);    // arr1 먼저 복사
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);  // arr1 복사 후 arr2 복사

        return arr3;
    }
}

