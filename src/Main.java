import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a logic expression:");
        Scanner sc = new Scanner(System.in);
        String expression = sc.next().replaceAll("//s+","");
        Parser parser = new Parser();
        parser.parse(expression);

        //Запуск тестов
        //parser.test(Test.EXPRESSIONS);


    }








}
