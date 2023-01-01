package ch4;

public class Ex08_getLongestWord {
    public static void main(String[] args) {
        System.out.println(getLongestWord("Hello World!"));
        // 문자열을 입력받아 문자열에서 가장 긴 단어를 리턴 -> "World!"
    }
    public static String getLongestWord(String str){
        // String 타입을 리턴해야 합니다.
        // 단어는 공백 한 칸으로 구분
        // 가장 긴 단어가 2개 이상이면 첫번째로 등장하는 단어를 리턴
        String[] arr = str.split(" ");
//        String max = arr[0];
        String max = "";

        for(String s : arr){
            if(s.length()>max.length()) max = s;
        }
        return max;
    }
}

