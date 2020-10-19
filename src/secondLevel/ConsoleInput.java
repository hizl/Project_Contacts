package secondLevel;

import java.util.Scanner;

class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String next() {
        return this.scanner.next();
    }

    @Override
    public String nextLine() {
        return this.scanner.nextLine();
    }
}