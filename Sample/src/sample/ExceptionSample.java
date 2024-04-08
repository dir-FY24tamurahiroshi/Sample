package sample;

public class ExceptionSample {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            // ここに例外が発生する可能性のあるコードを書きます
            int a = 10 / 0;
            System.out.println("割り算開始");
        } catch (ArithmeticException e) {
            // ArithmeticExceptionが発生した場合の処理を書きます
            System.out.println("ArithmeticExceptionが発生" + e.getMessage());
        }finally {
            // 例外の有無にかかわらず実行されるコードを書きます（オプション）
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");

    }

}
