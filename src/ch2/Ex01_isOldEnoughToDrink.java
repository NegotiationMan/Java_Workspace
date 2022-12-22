package ch2;

public class Ex01_isOldEnoughToDrink {
    public static void main(String[] args) {
        System.out.println(isOldEnoughToDrink(17));
    }
    public static boolean isOldEnoughToDrink(int age){
        boolean result = false;
        if(age>=18){
            result = true;
        }
        return result;

    }
}
