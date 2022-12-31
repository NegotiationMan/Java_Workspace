package ch3;

public class Ex11_countCharacter {
    public static void main(String[] args) {
        System.out.println(countCharacter("I love you", 'o'));
    } // letter 등장 횟수 리턴
    public static int countCharacter(String str, char letter) {
        // int 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // 빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==letter){
                count++;                // 문자열에 같은 문자 확인 시 count++
            }
        }
        return count;
    }
}