class Problem {
    public static void main(String[] args) {
        int i = 0;
        for (String string : args){
            if(string.equals("test")){
                System.out.println(i);
                return;
            }


            if (args.length == i+1){
                System.out.println(-1);
                return;
            }
            i++;
        }

    }
}