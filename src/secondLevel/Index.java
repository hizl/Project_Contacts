package secondLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Index implements Application {

    private HashMap<String, Application> application;
    private Input input;
    private Output output;
    private boolean running = false;


    private List<String> name = new ArrayList<String>();
    private List<String> surname = new ArrayList<String>();
    private List<String> numberPhone = new ArrayList<String>();


    private void setup() {
        this.setupApplication();
    }

    private Index setupApplication() {
        this.application = new HashMap<String, Application>();


        this.application.put("add",
                new Add(this.input, this.name, this.surname, this.numberPhone, this.output));

        this.application.put("exit",
                new Exit(this.output)
        );

        this.application.put("404",
                new NotFound(this.output)
        );
        return this;
    }

    public Index(
            Input input,
            Output output) {
        this.input = input;
        this.output = output;
        this.setup();
    }

    @Override
    public boolean killFlow() {
        return false;
    }

    @Override
    public void run() {
        this.running = true;

        while (this.running) {
            this.output.outFormat("Enter action (add, remove, edit, count, list, exit): ");

            String command = this.input.nextLine();

            if (!this.application.containsKey(command)) {
                this.application.get("404").run();
            } else {
                Application app = this.application.get(command);
                app.run();
                this.running = !app.killFlow();

            }
        }
    }
}