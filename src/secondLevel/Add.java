package secondLevel;

import java.util.ArrayList;
import java.util.List;

class Add implements Application {
    private Input input;
    private Output output;
    private List<String> name = new ArrayList<String>();
    private List<String> surname = new ArrayList<String>();
    private List<String> number = new ArrayList<String>();


    public Add(Input input, List<String> name, List<String> surname, List<String> number, Output output) {
        this.input = input;
        this.name = name;
        this.output = output;
        this.surname = surname;
        this.number = number;

    }

    @Override
    public boolean killFlow() {
        return false;
    }


    public Add readName() {
        this.output.output("Enter the name: ");
        String name = this.input.next();
        this.name.add(name);

        return this;
    }

    public Add readSurname() {
        this.output.output("Enter the surname:");
        String surname = this.input.next();
        this.surname.add(surname);
        return this;
    }

    public Add readNumber() {
        String regexNumber = "\\\\d(-\\\\d{3}){3}";
        this.output.output("Enter the number:");
        String number = this.input.next();

        if (!regexNumber.matches(number)) {
            this.number.add(number);
            this.output.output("Wrong number format! \n The record added.");

        } else {
            this.number.add(number);
            this.output.output("The record added.");
        }

        return this;
    }


    @Override
    public void run() {

        //TODO write code

        this.readName()
                .readSurname()
                .readNumber();


        System.out.println(surname);
        System.out.println(name);
        System.out.println(number);
    }
}