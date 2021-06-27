import java.util.Scanner;
public class Game {


        public static void main(String[] args){
            // Генерируем случайное число
            int number = (int)(Math.random()*100);

            while(true){
                // Вводим число с клавиатуры
                Scanner sc = new Scanner(System.in);

                System.out.print("Введите число от 0 до 100");

                int myNumber = sc.nextInt();
                // Сравниваем с правильным числом
                if(myNumber > number){

                    System.out.println("Cлишком большое");

                }else if(myNumber < number){

                    System.out.println("Слишком маленькое");

                }else {

                    System.out.println("Ура, ты угадал!");

                    break;
                }
            }
        }
    }

