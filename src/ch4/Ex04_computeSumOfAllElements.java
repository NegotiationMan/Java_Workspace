package ch4;

public class Ex04_computeSumOfAllElements {
    public static void main(String[] args) {
        System.out.println(computeSumOfAllElements(new int[]{1,2,3}));
        // 배열을 입력받아 배열의 모든 요소의 합을 리턴r -> 6
    }
    public static int computeSumOfAllElements(int arr[]){
        // 입력받은 배열이 빈 배열인 경우, 0을 리턴
        int sum = 0;
        if(arr.length==0) {
            return 0;
        }
        for(int a : arr){               // 향상된 for문 사용하면 더욱 쉽게 풀 수 있다
            sum += a;                   // 요소 더하기
        }
        /*
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        */
        return sum;
    }
}
