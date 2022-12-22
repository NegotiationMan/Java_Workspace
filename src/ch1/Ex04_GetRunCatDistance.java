package ch1;

public class Ex04_GetRunCatDistance {
    public static void main(String[] args) {
        System.out.println("runcat이 이동한 거리는 "+getRunCatDistance(2,4)+" 입니다.");
    }

    public static int getRunCatDistance(int speed, int time){
        int distance;
        distance = speed*time;
        return distance;
    }
}
