import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int numbers123 = Character.getNumericValue(number.charAt(0))
                + Character.getNumericValue(number.charAt(1))
                + Character.getNumericValue(number.charAt(2));
        int numbers456 = Character.getNumericValue(number.charAt(3))
                + Character.getNumericValue(number.charAt(4))
                + Character.getNumericValue(number.charAt(5));


        if(numbers123 == numbers456){
            System.out.println("Lucky");
        }else{
            System.out.println("Regular");
        }


    }
}