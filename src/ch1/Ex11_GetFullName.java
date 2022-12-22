package ch1;

public class Ex11_GetFullName {
    public static void main(String[] args) {
        System.out.println(getFullName("Lee", "SangHyup"));
    }
    public static String getFullName(String firstName, String lastName){
        return firstName+" "+lastName;   // 문자열에 +연산자 사용 시 문자열로 만든다.
    }
}
