package secondLevel;

class ConsoleOutput implements Output {
    @Override
    public void output(String massage) {
        System.out.print(massage);
    }

    @Override
    public void outFormat(String pattern, Object... args) {
        System.out.printf(pattern, args);
    }
}
