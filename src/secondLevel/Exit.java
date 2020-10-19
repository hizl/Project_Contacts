package secondLevel;

class Exit implements Application {
    private Output output;

    public Exit(Output output) {
        this.output = output;
    }

    @Override
    public boolean killFlow() {
        return true;
    }

    @Override
    public void run() {
        this.output.output("Exit program ");
    }
}