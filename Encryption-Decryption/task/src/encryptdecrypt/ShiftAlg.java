package encryptdecrypt;

public class ShiftAlg implements AlgMethod {

    public static String doAlg(String data, int key, String mode) {
        String returnString = "";


        if (mode.equals("enc")) {
            for (char c : data.toCharArray()) {

                if (c >= 'a' && c <= 'z') {
                    if (c + key <= 'z') {
                        c = (char) (c + key);
                    } else {
                        c = (char) (c + key - 'z');
                        c = (char) (c + 'a'- 1);
                    }
                }

                if (c >= 'A' && c <= 'Z') {
                    if (c + key <= 'Z') {
                        c = (char) (c + key);
                    } else {
                        c = (char) (c + key - 'Z');
                        c = (char) (c + 'A' - 1);
                    }
                }

                returnString = returnString + c;

            }

            return returnString;
        } else if(mode.equals("dec")){
            for (char c : data.toCharArray()) {

                if (c >= 'a' && c <= 'z') {
                    if (c - key >= 'a') {
                        c = (char) (c - key);
                    } else {
                        c = (char) (c - key + 26);
                    }
                }

                if (c >= 'A' && c <= 'Z') {
                    if (c - key >= 'A') {
                        c = (char) (c - key );
                    } else {
                        c = (char) (c - key + 26);

                    }
                }

                returnString = returnString + c;



            }
            return returnString;
        }
        return null;
    }
}
