package ch2;

public class Ex13_1_convertScoreToGradeWithPlusAndMinus {
    public static void main(String[] args) {
        System.out.println(convertScoreToGrade(74));
    }
    public static String  convertScoreToGrade(int score) {
        String result;
        if((100<score)||(score<0)){
            result = "INVALID SCORE";
            return result;
        }
        if(score>=90){
            if((score==100)||(score%10>=8)){
                result = "A+";
                return result;
            }else if(score%10<=2){
                result = "A-";
                return result;
            }else{
                result = "A";
                return result;
            }
        }else if(score>=80){
            if(score%10>=8){
                result = "B+";
                return result;
            }else if(score%10<=3){
                result = "B-";
                return result;
            }else{
                result = "B";
                return result;
            }
        }else if(score>=70){
            if(score%10>=8){
                result = "C+";
                return result;
            }else if(score%10<=3){
                result = "C-";
                return result;
            }else{
                result = "C";
                return result;
            }
        }else if(score>=60){
            if(score%10>=8){
                result = "D+";
                return result;
            }else if(score%10<=3){
                result = "D-";
                return result;
            }else{
                result = "D";
                return result;
            }
        }else{
            result = "F";
        }
    return result;
    }
}
