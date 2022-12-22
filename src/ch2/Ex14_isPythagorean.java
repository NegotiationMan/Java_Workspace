package ch2;

public class Ex14_isPythagorean {
    public static void main(String[] args) {
        System.out.println(isPythagorean(3, 4, 5));
    }
    // 직각삼각형은 가장 큰 변(빗변)의 제곱이 나머지 두 변 각각의 제곱의 합과 동일합니다. (피타고라스의 정리)
    // Math.pow(거듭제곱 하려는 수 ,지수) -> 거듭제곱 !!, Math.pow()는 Double형 반환
    public static boolean  isPythagorean(int side1, int side2, int side3) {
        int pow1 = (int)Math.pow(side1, 2);  // side1의 2제곱 -> int로 강제 형 변환
        int pow2 = (int)Math.pow(side2, 2);  // side2의 2제곱 -> int로 강제 형 변환
        int pow3 = (int)Math.pow(side3, 2);  // side3의 2제곱 -> int로 강제 형 변환

        if((pow1==pow2+pow3)||(pow2==pow1+pow3)||(pow3==pow1+pow2)){
            return true;
        }else{
            return  false;
        }

    }
}
