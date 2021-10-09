package se.systementor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        var lab9 = new Lab9();
        lab9.run();

        var lab4 = new Lab4();
        lab4.run();


        var lab3 = new Lab3();
        lab3.run();


        var lab1 = new Lab1();
        lab1.run();
        System.out.println("Hello World!");
    }
}
