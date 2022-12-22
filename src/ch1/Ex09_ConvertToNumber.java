package ch1;

public class Ex09_ConvertToNumber {
    public static void main(String[] args) {
        System.out.println(convertToNumber('1'));
    }
    public static int convertToNumber(char character){
        int result;
        result = Character.getNumericValue(character); // char -> int
//        result = (int)(character-'0');               // char '1'의 값은 49-'0' 은 1
        return result;
    }
}
