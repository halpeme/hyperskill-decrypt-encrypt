import java.util.Scanner;
import java.util.function.Consumer;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numbers2 = numbers.split("\\s+");
        for(String number : numbers2){
            System.out.println(number);
        }
    }
}