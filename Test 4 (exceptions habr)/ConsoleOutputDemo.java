package homework6.exceptions;

public class ConsoleOutputDemo {

    public static void main(String[] args) {
        incorrectOutput();
    }

    public static void incorrectOutput() {
        System.out.println("sout");
        throw new Error();
    }

    public static void correctOutput() {
        System.err.println("serr");
        throw new Error();
    }

}