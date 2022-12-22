package ch2;

public class Ex10_followingDay {
    public static void main(String[] args) {
        System.out.println(followingDay("금요일"));
    }
    public static String followingDay(String day) {
        if (day.equals("월요일")) {
            return "월요일";
        } else if (day.equals("화요일")) {
            return "화요일";
        } else if (day.equals("수요일")) {
            return "수요일";
        } else if (day.equals("목요일")) {
            return "목요일";
        } else if (day.equals("금요일")) {
            return "금요일";
        } else if (day.equals("토요일")) {
            return "토요일";
        } else if (day.equals("일요일")) {
            return "일요일";
        }else{
            return "올바른 요일이 아닙니다";
        }
        // switch문으로 만들어 보기
        /* jdk 11 버전에서는 x
        switch(day){
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        case "월요일":
            return "월요일";
        default:
            return "올바른 요일이 아닙니다.";
        }
        */
    }
}
