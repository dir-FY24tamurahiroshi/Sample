package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59; //成績
        
        
        //and:scoreが４０以上、かつ５０以下
        System.out.print("scoreが４０以上、かつ５０以下:");
        System.out.println(score >= 40 && score <= 50);
        
        //or:scoreが４０以上、または５０以下
        System.out.print("scoreが４０以上、または５０以下:");
        System.out.println(score >= 40 || score <= 50);
        
        //not:scoreが６０以上ではない
        System.out.print("scoreが６０以上ではない:");
        System.out.println(!(score >=60));

    }

}
