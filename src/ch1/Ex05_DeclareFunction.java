package ch1;

public class Ex05_DeclareFunction {
    public static void main(String[] args) {
        System.out.println("2 x 8="+multipleBy2(8));
        System.out.println("2 / 8="+devideBy2(8));
    }
    public static int multipleBy2(int input){
        input *= 2;
        return input;
    }
    public static int devideBy2(int input){
        input /= 2;
        return input;
    }
}
