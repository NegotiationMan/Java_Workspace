package ch2;

public class Ex15_or {
    public static void main(String[] args) {
        System.out.println(or(false, false));
    }
    // || 없이 or 만들기 !
    // or는 false | false 일때만 false
    public static boolean or(boolean expression1, boolean expression2) {
        boolean result = true;
        if(expression1 == false && expression2 == false){
            result = false;
        }
        return result;
    }
}
