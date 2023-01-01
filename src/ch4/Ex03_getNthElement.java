package ch4;

public class Ex03_getNthElement {
    public static void main(String[] args) {
        System.out.println(getNthElement(new int[]{1,2,3},2));
        // 배열과 수를 입력받아 수가 인덱스로 가리키는 배열의 요소를 리턴 -> 3
    }
    public static int getNthElement(int arr[], int index){
        // 배열의 요소를 리턴
        // 빈 배열을 입력받은 경우, -1를 리턴
        // 배열의 길이를 벗어나는 수를 입력받은 경우, '-2'를 리턴해야 합니다.
        if(arr.length==0) {              // 빈 배열 입력받은 경우 먼저 조건문 넣지 않으면 -2 반환 x
            return -1;
        }
        else if(index>=arr.length) {     // 배열의 길이를 벗어나는 수 입력
            return -2;
        }
        return arr[index];      // 배열의 index 요소 반환
    }
}
