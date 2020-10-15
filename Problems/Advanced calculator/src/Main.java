/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int result = 0;

        switch(args[0]){
            case("MAX"):
                for (int i = 1; i < args.length; i++){
                    if(Integer.parseInt(args[i]) > result) {
                        result = Integer.parseInt(args[i]);
                    }
                }

                break;
            case("MIN"):
                result = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++){
                    if(Integer.parseInt(args[i]) < result) {
                        result = Integer.parseInt(args[i]);
                    }
                }

                break;
            case("SUM"):
                for (int i = 1; i < args.length; i++){
                        result += Integer.parseInt(args[i]);
                }
                break;

        }

        System.out.println(result);



    }


    }
