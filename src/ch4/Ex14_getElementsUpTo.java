package ch4;

import java.util.Arrays;

public class Ex14_getElementsUpTo {
    public static void main(String[] args) {
        System.out.println(getElementsUpTo(new int[]{1, 3, 5, 7, 9}, 2));
        System.out.println(Arrays.toString(getElementsUpTo(new int[]{1, 3, 5, 7, 9}, 2)));
        // 배열과 인덱스를 입력받아 주어진 인덱스 이전의 요소들을 갖는 새로운 배열을 리턴  -> [1, 3]
    }

    public static int[] getElementsUpTo(int[] arr, int n) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 반복문(for, while) 사용은 금지됩니다.
        // 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
        // 배열의 길이 이상의 인덱스를 입력받은 경우, 빈 배열을 리턴해야 합니다.
        if (arr.length == 0 || n >= arr.length) return new int[]{};

        int[] result = new int[]{};

        result = Arrays.copyOfRange(arr, 0, n);

        return result;
    }
}

