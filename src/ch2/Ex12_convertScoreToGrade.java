package ch2;

public class Ex12_convertScoreToGrade {
    public static void main(String[] args) {
        System.out.println(convertScoreToGrade(101));
    }
    public static char  convertScoreToGrade(int score) {
        char result;
        if((100<score)||(score<0)){
            result = 'X';
            return result;
        }
        if(score>=90){
            result = 'A';
        }else if(score>=80){
            result = 'B';
        }else if(score>=70){
            result = 'C';
        }else if(score>=60){
            result = 'D';
        }else{
            result = 'F';
        }
    return result;
    }
}
