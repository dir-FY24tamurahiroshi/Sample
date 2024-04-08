package sample;

public class MethodSample {

    public static void main(String[] args) {
        var number1 = 100;
        var number2 = 10;
        
        
        sumMethod1(number1,number2);
        
        
        //-----追記（ここから）-----
        var result2 = sumMethod2(number1, number2);
        System.out.println("sumMethod2の結果は" + result2);
        //-----追記（ここまで）-----
    }
    public static void sumMethod1(int num1, int num2) {
        var result = num1 + num2;
        System.out.println("sumMethodの結果は" + result);
    }
    //-----追記（ここから）-----
    public static int sumMethod2(int num1,int num2) {
        var result = num1 + num2;
        return result;
        
    }
    //-----追記（ここから）-----

}
