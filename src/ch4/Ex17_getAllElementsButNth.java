package ch4;

import java.util.Arrays;

public class Ex17_getAllElementsButNth {
    public static void main(String[] args) {
        System.out.println(getAllElementsButNth(new int[]{1, 2, 3}, 1));
        System.out.println(Arrays.toString(getAllElementsButNth(new int[]{1, 2, 3}, 1)));
        // 배열과 인덱스를 입력받아 해당 인덱스의 요소를 제외한 배열을 리턴 -> [1, 3]
    }

    public static int[] getAllElementsButNth(int[] arr, int n) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 배열의 길이보다 큰 인덱스를 입력받은 경우, 배열 그대로를 리턴해야 합니다.
        // 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
        if (n >= arr.length) return arr;
        if (arr.length == 0) return new int[]{};

        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                continue;
            }
            result[index] = arr[i];
            index++;
        }
        return result;
    }
}

