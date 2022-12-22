package ch1;

public class Ex17_ComputeDifference {
    public static void main(String[] args) {
        System.out.println(computeDifference(3,7));
    }
    public static String computeDifference(int num1, int num2){
        int data = Math.abs(num1-num2);
        return String.format("%d, %d의 차이는 %d입니다.",num1, num2, data);
    }
}
