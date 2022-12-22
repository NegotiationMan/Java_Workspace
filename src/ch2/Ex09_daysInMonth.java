package ch2;

public class Ex09_daysInMonth {
    public static void main(String[] args) {
        System.out.println(daysInMonth(4));
    }
    public static int daysInMonth(int month){
            switch(month)
            {
                case 1: case 3: case 5: case 7:  case 8: case 10: case 12:  // 1,3,5,7,8,10,12월은 31일까지
                    return 31;
                case 4: case 6: case 9: case 11:                            // 4, 6, 9, 11월은 30일까지
                    return 30;
                default:                                                    // 나머지 2월은 28일까지
                    return 28;
            }
    }
}
