import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int one = scanner.nextInt();
        int two = scanner.nextInt();


        System.out.println(string.substring(one,two+1));


    }
}