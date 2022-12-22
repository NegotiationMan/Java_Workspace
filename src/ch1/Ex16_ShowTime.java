package ch1;

public class Ex16_ShowTime {
    public static void main(String[] args) {
        System.out.println(showTime(3, 23, 30));
    }
    public static String showTime(int hour, int min, int sec){
        return String.format("현재 시각은 %d시 %d분 %d초 입니다",hour, min, sec);
    }
}
