package ch2;

public class Ex03_equalsTen {
    public static void main(String[] args) {
        System.out.println(equalsTen(11));
    }
    public static boolean equalsTen(int num){
        if(10==num){
            return true;    // num이 10이면 true 반환
        }else{
            return false;   // num이 10이 아니면 false 반환
        }
//        return 10==num    // 조건문 없이 간단하게
    }
}
