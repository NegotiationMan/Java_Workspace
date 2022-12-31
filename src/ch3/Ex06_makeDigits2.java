package ch3;

public class Ex06_makeDigits2 {
    public static void main(String[] args) {
        System.out.println(makeDigits2(5));
    }
    public static String makeDigits2(int num){
        // string 타입을 리턴해야 합니다
        // 반복문(while)문을 사용해야 합니다.
        // 숫자(number string) 사이를 '-'로 구분합니다. ('1-2-3-4-5')
        int i = 1;
        String str = "";

        while (i<=num){
            if(i==1){
                str += i;
            }else{
                str += "-"+i;
            }
            i++;
        }
        return str;
    }
}

/*
    String str = "1"    // 그냥 시작을 1로 시작 !
    int index = 2;      // index는 2로 시작

    while(index<=num){
        result += "-"+index;
        index++;
    }
    return result;
 */
