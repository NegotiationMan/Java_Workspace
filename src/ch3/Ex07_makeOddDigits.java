package ch3;

public class Ex07_makeOddDigits {
    public static void main(String[] args) {
        System.out.println(makeOddDigits(5));
    }
    public static String makeOddDigits(int num){
        // string 타입을 리턴해야 합니다
        // 반복문(while)문을 사용해야 합니다.
        // 숫자(number string) 사이의 구분은 없습니다. ('13579')
        int i = 0;
        String str = "";

        while(i<num){
            str += 1+(2*i); // 1, 3, 5, 7 홀수 만들기 !
            i++;
        }
        return str;
    }
}
/*
    // 그냥 따로 홀수값 만들어서 더해주기
    int i = 1;
    int count = 0;
    String str = "";

    while(count<num){
    str += i;
    i += 2;
    count++;
    }
    return str;
 */