package contacts;




public class Main {
    public static void main(String[] args) {

        ConsoleInput consoleInput = new ConsoleInput();
        ConsoleOutput consoleOutput = new ConsoleOutput();

        Application application = new Application(consoleInput, consoleOutput);
        application.run();
    }

}