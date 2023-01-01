package ch4;

import java.util.Arrays;

public class Ex16_getAllElementsButLast {
    public static void main(String[] args) {
        System.out.println(getAllElementsButLast(new int[]{1, 2, 3, 4}));
        System.out.println(Arrays.toString(getAllElementsButLast(new int[]{1, 2, 3, 4})));
        // 배열을 입력받아 마지막 요소를 제외한 배열을 리턴 -> [1, 2, 3]
    }
    public static int[] getAllElementsButLast(int[] arr) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.
        // 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
        if(arr.length==0)   return new int[]{};

        int[] result = new int[arr.length-1];

        System.arraycopy(arr, 0, result, 0 , result.length);

        return result;
    }
}

