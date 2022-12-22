package ch2;

public class Ex02_isGreaterThan30 {
    public static void main(String[] args) {
        System.out.println(isGreaterThan30(29));
    }
    public static String isGreaterThan30(int temp){
        if(temp>=30){
            return "에어컨을 켜야겠다!";
        }else {
            return "여름이 매우 덥네요";
        }
    }
}
