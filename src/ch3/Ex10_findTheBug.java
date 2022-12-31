package ch3;

public class Ex10_findTheBug {
    public static void main(String[] args) {
        System.out.println(findTheBug("#Hello"));
    } // # 위치 알아내기
    public static int findTheBug(String word) {
        // int 타입을 리턴해야 합니다.
        // 반복문(for)문을 사용해야 합니다.
        // '#' 기호가 없는 경우 -1을 리턴해야 합니다.
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#') {        // 문자열에서 한가지 문자타입의 값을 사용하려면 .charAt() 메서드 사용
                return i;
            }
        }
        return -1;
    }
}