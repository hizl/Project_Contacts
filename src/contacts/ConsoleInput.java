package contacts;


import java.util.Scanner;



class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String next() {
        return this.scanner.next();
    }

}