package encryptdecrypt;

public class UnicodeAlg implements AlgMethod {

    public static String doAlg(String data, int key, String mode) {
        String returnString = "";
        /*
        if(mode.equals("enc")||mode.isEmpty()){

        }else{
            key = key * -1;
        }

         */


        for (char c : data.toCharArray()){

            if (mode.equals("enc") || mode.isEmpty()){
                c = (char) (c + key);
            } else if (mode.equals("dec")){
                c = (char) (c - key);
            }
            returnString = returnString + c;

        }
        return returnString;
    }
}
