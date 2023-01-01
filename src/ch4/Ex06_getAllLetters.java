package ch4;

public class Ex06_getAllLetters {
    public static void main(String[] args) {
        System.out.println(getAllLetters("Hello"));
        // 문자열을 입력받아 문자열을 구성하는 각 문자를 요소로 갖는 배열을 리턴 -> ['H','e','l','l','o']
    }
    public static char[] getAllLetters(String str){
        // char 타입의 요소를 가지는 배열을 리턴
        // str.split 사용은 금지
        // 빈 문자열을 입력받은 경우, 빈 배열을 리턴
        char[] arr = new char[str.length()];    // 문자열 길이만큼 char 배열 생성
        if(str.isEmpty()) return arr;           // 빈 배열 리턴

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);             // arr 배열에 문자 한개씩 넣기
        }
        return arr;
    }
}

