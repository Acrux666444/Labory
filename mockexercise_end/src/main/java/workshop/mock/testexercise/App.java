package workshop.mock.testexercise;

import workshop.mock.testexercise.service.GreetService;
import workshop.mock.testexercise.service.ReadService;

public class App {

    private GreetService greetService;
    private ReadService readService;

    public String greetLowerCase(String name) {
        return greetService.hello(name).toLowerCase();
    }
    public String greedLowerCase(String name){ return readService.hello(name).toLowerCase();}
}
