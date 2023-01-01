package ch4;

import java.util.Arrays;

public class Ex18_createPhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{0, 1, 0, 5, 9, 1, 2, 1, 6, 6, 1}));
        // 0-9 사이의 정수를 요소로 갖는 배열을 입력받아 전화번호 형식의 문자열을 리턴 -> "(010)5912-1661"
    }

    public static String createPhoneNumber(int[] arr) {
        String head = "010";
        int len = arr.length;
        String bodyArr = Arrays.toString(Arrays.copyOfRange(arr, len - 8, len - 4));
        String body = bodyArr
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
        String tailArr = Arrays.toString(Arrays.copyOfRange(arr, len - 4, len));
        String tail = tailArr
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");

        if (len == 11) {
            String headArr = Arrays.toString(Arrays.copyOfRange(arr, 0, 3));
            head = headArr
                    .replaceAll(" ", "")
                    .replaceAll(",", "")
                    .replace("[", "")
                    .replace("]", "");
        }
        return String.format("(%s)%s-%s", head, body, tail);
    }
}

