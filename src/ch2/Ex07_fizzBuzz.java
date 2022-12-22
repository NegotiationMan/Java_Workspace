package ch2;

public class Ex07_fizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(0));
    }
    public static String fizzBuzz(int num){
            if((num%3==0)&&(num%5==0)){
                return "FizzBuzz";      // 3과 5로 모두 나누어지는 경우
            } else if(num%3==0) {
                return "Fizz";          // 3으로만 나누어지는 경우
            } else if(num%5==0) {
                return "Buzz";          // 5로만 나누어지는 경우
            }else{
                return "No FizzBuzz";   // 3과 5로 모두 나누어지지 않는 경우
            }
    }
}
