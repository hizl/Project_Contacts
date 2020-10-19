package firstLevel;

class ConsoleOutput implements Output {
    @Override
    public void output(String massage) {
        System.out.print(massage);
    }


}