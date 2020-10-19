package secondLevel;

class NotFound implements Application {

    private Output output;

    public NotFound(Output output) {
        this.output = output;
    }

    @Override
    public boolean killFlow() {
        return false;
    }

    @Override
    public void run() {
        this.output.output("Command not found \n");
    }
}