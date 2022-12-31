package ch3;

public class Ex01_sum {
    public static void main(String[] args) {
        System.out.println(sumTo(3));
    }
    public static int sumTo(int num){
        int total = 0;
        for(int i=1; i<=num; i++){      // for문으로 총합 구하기 !
            total += i;                 // 0+1+2+3 -> 6
        }
        return total;
    }

}
