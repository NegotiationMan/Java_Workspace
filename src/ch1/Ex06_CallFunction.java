package ch1;

public class Ex06_CallFunction {
    public static void main(String[] args) {
        String word;
        word = returnWordWithJoy("i love coding");
        System.out.println(word);
    }
    public static String returnWordWithJoy(String str){
        if(str.equals("")) return  "empty value";   // 공백이면 empty value 출력
        else return  str+"!";                       // 공백이 아닐시 문자열+!
    }
}
