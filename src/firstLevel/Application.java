package firstLevel;

class Application {
    private Store store;
    private Input input;
    private Output output;

    private Application keepNameToStorage() {
        this.output.output("Enter the name of the person:");
        String name = this.input.next();
        store.setName(name);
        return this;
    }

    private Application keepSurnameToStorage() {
        this.output.output("Enter the surname of the person:");
        String surname = this.input.next();
        store.setSurname(surname);
        return this;
    }

    private Application keepPhoneBookToStorage() {
        this.output.output("Enter the number:");
        String number = this.input.next();
        store.setPhoneNumber(number);
        return this;
    }

    private Application checkName() {
        if (store.getName() != null) {
            this.output.output("A record created!");
        }
        return this;
    }

    private Application checkSurname() {
        if (store.getSurname() != null && store.getPhoneNumber() != null) {
            this.output.output("A Phone Book with a single record created!");
        }
        return this;
    }

    public Application(Input input, Output output) {
        this.store = new Store();
        this.output = output;
        this.input = input;
    }


    public void run() {
        this.keepNameToStorage()
                .keepSurnameToStorage()
                .keepPhoneBookToStorage()
                .checkName()
                .checkSurname();
    }

}