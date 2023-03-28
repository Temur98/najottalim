package project;


public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> run();

    }

    private static void run() {
        System.out.println("HI");
    }
}
