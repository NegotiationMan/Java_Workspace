package ch2;

public class Ex16_addOneSecond {
    public static void main(String[] args) {
        System.out.println(addOneSecond(2, 59, 59));
    }
    // String 타입을 리턴해야 합니다.
    // 1초 뒤에 {hour}시 {minute}분 {second}초 입니다 형식으로 리턴해야 합니다.
    public static String addOneSecond(int hour, int minute, int second) {
        second += 1;
        if(second>=60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour > 24) {
                    hour = 0;
                }
            }
        }
        return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour, minute, second);
    }
}
// reference
    /*
    if (second == 59) {
	    minute += 1;
		second = 0;
    }else{
		second += 1;
	}

	if (minute == 60) {
	    hour += 1;
		minute = 0;
	}

	if (hour == 24) {
	    hour = 0;
	}

	return "1초 뒤에 " + hour + "시 " + minute + "분 " + second + "초 입니다";
*/
