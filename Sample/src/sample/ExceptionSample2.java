package sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionSample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        
        try {
           
            // ここに例外が発生する可能性のあるコードを書きます
            System.out.println("割り算開始");
            int a = divide(10,0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            // ArithmeticExceptionが発生した場合の処理を書きます
            System.out.println("ArithmeticException caught:" + e.getMessage());
        }finally {
            //例外の有無にかかわらず、実行されるコードを書きます（オプション）
            System.out.println("割り算終了");
            
        }
        
        
        System.out.println("処理終了");
        
    }
        public static int divide(int a,int b) throws ArithmeticException{
            if(b == 0) {
                //
                throw new ArithmeticException("ゼロ除算エラーです");
            }
            return a / b;


    }

}
