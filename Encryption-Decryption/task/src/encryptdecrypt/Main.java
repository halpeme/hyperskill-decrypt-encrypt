package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //abcdefghijklmnopqrstuvwxyz
        //String[] test1 = {"-mode","enc","-data","road_to_treasure.txt","","protected.txt","-key","5"};
        String alg = "shift";
        String mode = "";
        String key = "0";
        String data = "";
        String in = "";
        String out = "";
        int i = 0;

        for(String arg : args){
            switch (arg){
                case "-mode":
                    mode = args[i+1];
                    break;
                case "-key":
                    key = args[i+1];
                    break;
                case "-data":
                    data = args[i+1];
                    break;
                case "-in":
                    in = args[i+1];
                    break;
                case "-out":
                    out = args[i+1];
                    break;
                case "-alg":
                    alg = args[i+1];
            }

            i++;
        }

        if(data.equals("")){
            data = readFileAsString(in);
        }

        String returnString = "";

        int shift = Integer.parseInt(key);

        if(alg.equals("unicode")){
            returnString = UnicodeAlg.doAlg(data,shift,mode);
        }else{
            returnString = ShiftAlg.doAlg(data,shift,mode);
        }

        if(out.equals("")){
            System.out.println(returnString);

        } else {
            FileWriter writer = new FileWriter(out);
            try{
                writer.write(returnString);
                writer.close();
            }catch (IOException e){
                System.out.println(e.getMessage() + "Error");
            }
        }


    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
