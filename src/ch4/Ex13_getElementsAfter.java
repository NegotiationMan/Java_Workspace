package ch4;

import java.util.Arrays;

public class Ex13_getElementsAfter {
    public static void main(String[] args) {
        System.out.println(getElementsAfter(new int[]{1,3,5,7,9}, 2));
        System.out.println(Arrays.toString(getElementsAfter(new int[]{1,3,5,7,9}, 2)));
        // 배열과 인덱스를 입력받아 주어진 인덱스 이후의 요소들을 갖는 새로운 배열을 리턴 -> [5, 7, 9]
    }
    public static int[] getElementsAfter(int[] arr, int n) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.
        if (n>= arr.length) return new int[]{};
//        int[] result = new int[arr.length-n];
        int[] result = Arrays.copyOfRange(arr, n, arr.length);
//        System.arraycopy(arr, n, result, 0, result.length);  //



        return result;
    }
}

