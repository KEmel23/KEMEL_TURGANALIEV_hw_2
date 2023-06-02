import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String black;
        final int NUM = 23;
        String word= "Метр!";
        black = word + NUM;
        System.out.println(black);

         if (NUM < 0 ) {
             System.out.println("Отрицательное число !");
         }else if  (NUM > 0 ) {
             System.out.println("Положительное число !");
         }else {
             System.out.println("Ноль");
         }
        System.out.println("Введите ваше имя");
        Scanner name = new Scanner(System.in);
        String YOURname = name.nextLine();
        System.out.println("HEllO "+ YOURname + "!");

             }
         }

