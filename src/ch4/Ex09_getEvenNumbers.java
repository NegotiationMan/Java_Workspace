package ch4;

import java.util.Arrays;

public class Ex09_getEvenNumbers {
    public static void main(String[] args) {
        System.out.println(getEvenNumbers(new int[]{1, 2, 3, 4}));
        System.out.println(Arrays.toString(getEvenNumbers(getEvenNumbers(new int[]{1, 2, 3, 4}))));
        // int 타입를 요소로 갖는 배열을 입력받아 짝수만을 요소로 갖는 배열을 리턴 -> [2, 4]
    }

    public static int[] getEvenNumbers(int[] arr) {
        // int 타입을 요소로 가지는 배열을 리턴해야 합니다.
        // 짝수가 없는 경우, 빈 배열을 리턴해야 합니다.

        int[] concatArray = new int[]{};

        if (arr.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                concatArray = Arrays.copyOf(concatArray, concatArray.length + 1);   // result 배열의 크기 1 증가
                concatArray[concatArray.length - 1] = arr[i];                                  // 증가된 마지막 인덱스에 짝수 값
            }
        }
        return concatArray;
    }
}

// 짝수의 개수만큼의 크기를 가진 배열을 선언한 후, 하나씩 입력하는 방법
 /*
        int count = 0;

        if(arr.length==0) return new int[]{};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) count++;
        }
        int[] index = new int[count];
        count = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[j]%2==0){
                index[count] = arr[j];
                count++;
            }
        }
        return index;
*/
