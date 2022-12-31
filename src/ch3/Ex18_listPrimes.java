package ch3;

public class Ex18_listPrimes {
    public static void main(String[] args) {
        System.out.println(listPrimes(12)); // 2 이상의 자연수를 입력받아 2부터 해당 수까지의 소수(prime number)들을 리턴
    }
    public static String listPrimes(int num) {
        // String 타입을 리턴해야 합니다.
        // 2-3-5-7의 형식으로 리턴해야 합니다.
        // 이중 반복문(double for loop)을 사용해야 합니다.
        int count = 0;
        String result = "";
        for(int i=2; i<=num; i++){
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                if(i==2){
                    result += i;
                }else{
                    result += "-"+i;
                }
            }

            count = 0;
        }
        return result;
    }
}
/*
String result = "2";
for (int candi = 3; candi <= num; candi += 2) {
    boolean isPrime = true;
	int sqrt = (int) Math.sqrt(candi);
	for (int divider = 3; divider <= sqrt; divider += 2) {
	    if (candi % divider == 0) {
		    isPrime = false;
		    break;
		}
	}

	if (isPrime) {
	    result = result + "-" + candi;
	}
}
return result;
 */

/*
String str = "2";
        for(int i=0; i<=num; i++){
            for(int j=2; j<=i; i++){
                if(i%j==0){
                    break;
                }else{
                    str += "-"+ i;
                }
            }
        }
        return str;

 */