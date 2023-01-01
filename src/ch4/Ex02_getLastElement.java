package ch4;

public class Ex02_getLastElement {
    public static void main(String[] args) {
        System.out.println(getLastElement(new int[]{1,2,3}));  // 배열를 입력받아 배열의 마지막 요소를 리턴 -> 3
    }
    public static int getLastElement(int arr[]){
        // 배열의 요소를 리턴
        // 빈 배열을 입력받은 경우, -1를 리턴
        if(arr.length==0){              // 빈 배열 입력받은 경우
            return -1;
        }
        return arr[arr.length-1];      // 배열의 마지막 요소 리턴
    }
}
