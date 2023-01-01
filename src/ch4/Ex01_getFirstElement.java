package ch4;

public class Ex01_getFirstElement {
    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[]{1,2,3}));  // 배열을 입력받아 배열의 첫번째 요소를 리턴  -> 1
    }
    public static int getFirstElement(int arr[]){
        // 배열의 요소를 리턴
        // 빈 배열을 입력받은 경우, -1를 리턴
        if(arr.length==0){              // 빈 배열 입력받은 경우
            return -1;
        }
        return arr[0];                  // 배열의 첫번째 요소 리턴
    }
}
