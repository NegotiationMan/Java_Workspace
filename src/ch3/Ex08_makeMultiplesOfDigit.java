package ch3;

public class Ex08_makeMultiplesOfDigit {
    public static void main(String[] args) {
        System.out.println(makeMultiplesOfDigit(5));    // 3의 배수만 출력 ->
    }
    public static String makeMultiplesOfDigit(int num) {
        // string 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // 숫자(number string) 사이의 구분은 없습니다. ('3691215')
        // 3의 배수가 없을 경우, 빈 문자열을 리턴해야 합니다.
        String str = "";

        for(int i=3; i<=num; i+=3){
            str += i;
        }
        return str;

    }
}
// 3씩 증가 시키기.
/*
    String str = "";

    for(int i=3; i<=num; i+3){
        str += i;
    }
    return str;

 */

// if문을 사용해서 !
/*
    String str = "";

    for(int i=1; i<=num; i++){
        if(i%3==0){
            str += i;
        }
    }
    return str;
 */
