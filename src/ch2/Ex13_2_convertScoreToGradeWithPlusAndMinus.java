package ch2;

public class Ex13_2_convertScoreToGradeWithPlusAndMinus {
    public static void main(String[] args) {
        System.out.println(convertScoreToGrade(100));
    }
    // reference 참조
    public static String  convertScoreToGrade(int score) {
        String result;
        if((100<score)||(score<0)){
            result = "INVALID SCORE";
            return result;
        }
       if(score>=90){
           result = "A";
       }else if(score>=80){
           result = "B";
       }else if(score>=70){
           result = "C";
       }else if(score>=60){
           result = "D";
       }else{
           result = "F";
           return result;
       }
       if(!(result.equals("F"))){
           int extra = score%10;
           if(score ==100){
               return result+"+";   // 100이라면 A+ 반환
           }
           if(extra>=8){        // 8, 9
               result += "+";
           }else if(extra<=2){
               result += "-";   // 0, 1, 2
           }
       }
       return result;
    }
}
