package ch4;

import java.util.Arrays;

public class Ex05_getAllWords {
    public static void main(String[] args) {
        System.out.println(getAllWords("Radagast the Brown"));  // 주소 정보를 담고 있다.
        System.out.println(Arrays.toString(getAllWords("Radagast the Brown")));     // 배열 문자열 형식으로 출력
        // 문자열을 입력받아 문자열을 구성하는 각 단어를 요소로 갖는 배열을 리턴 -> ["Radagast", "the", "Brown"]
    }
    public static String[] getAllWords(String str){
        // String 타입을 요소로 가지는 배열을 리턴
        // 반복문(for, while) 사용은 금지
        // 단어는 공백 한 칸으로 구분
        // 연속된 공백은 없다고 가정

        //  다시 공부
        String[] arr = {};
        if (str.isEmpty()) {
            return arr;
        }else{
            arr = str.split(" ");
            return arr;
        }
    }
}

