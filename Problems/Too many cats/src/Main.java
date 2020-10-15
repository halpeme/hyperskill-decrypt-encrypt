class Cat {

    // write static and instance variables
    static int counter = 0;
    private String name;
    private int age;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        counter++;
        if(counter > 5){
            System.out.println("You have too many cats");
        }
        this.age = age;
        this.name = name;

    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}