import java.util.Random;
import java.util.Scanner;
//Homework 3 Level 1
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        startGame(random,scanner);
    }
    public static void startGame(Random random, Scanner scanner){
        System.out.println("Попробуйте угадать число от 0 до 9 с трех попыток.");
        checkNumber(random,scanner);
        restartGame(scanner,random);
    }

    public static void checkNumber(Random random, Scanner scanner){
        int secretNumber = random.nextInt(10);
        int attempt = 1;

        while (attempt<4){
            System.out.println("Введите число:");
            int number=scanner.nextInt();

            while(number<0||number>9){
                System.out.println("Число выходит за заданные границы. Попытайтесь снова");
                number = scanner.nextInt();
            }

            if (number==secretNumber){
            System.out.println("Вы угадали число! Поздравляем с выигрышем!");
            break;
            }
            if (number>secretNumber){
            System.out.println("Введенное число больше загаданного. Попытайтесь угадать число снова");
            }
            if (number<secretNumber){
            System.out.println("Введенное число меньше загаданного. Попытайтесь угадать число снова");
            }
            attempt++;
        }
           if (attempt>3){
               System.out.println("К сожалению, Вы проиграли, загаданное число = " + secretNumber);
           }
    }
    public static void restartGame(Scanner scanner, Random random){

            while(true){
            String answer = scanner.nextLine();
            if (answer.equals("y")) {
                startGame(random, scanner);
                break;
            }
            if (answer.equals("n")) {
                break;
            }
                System.out.println("Повторить игру еще раз? y - да, n - нет");
         }

        }
    }

