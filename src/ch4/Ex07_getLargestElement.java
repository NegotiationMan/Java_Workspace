package ch4;

public class Ex07_getLargestElement {
    public static void main(String[] args) {
        System.out.println(getLargestElement(new int[]{1,7,3})); // 배열을 입력받아 가장 큰 요소를 리턴 -> 7
    }
    public static int getLargestElement(int[] arr){
        // int 타입을 리턴
//        int largeInt = 0;                   // 만약 음수가 들어온다면 ? --> x
        int max = arr[0];                // 첫번째 원소값으로 비교 !
        for(int a : arr){
            if(a>max)  max = a;     // largeInt보다 값이 크면 largeInt에 그 값을 넣어주기
        }
        /*
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        */
        return max;
    }
}

