import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char lastchar = input.charAt(0);
        int charCounter = 1;
        String returnString = "";

        for(int i = 1; i < input.length(); i++ ){
            char c = input.charAt(i);
            if(c == lastchar){
                charCounter++;
            }else{
                returnString += lastchar;
                returnString += charCounter;
                lastchar = c;
                charCounter = 1;
            }
            if(i == input.length()-1){
                returnString += lastchar;
                returnString += charCounter;
            }


        }

        if(input.length() == 1){
            returnString = lastchar + "1";
        }

        System.out.println(returnString);


    }
}