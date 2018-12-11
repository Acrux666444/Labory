package workshop.mock.testexercise.service;

public class ReadService {

    private String readService = "Hello Mock!";

    public String hello(String name) {
        return name == null ? readService: "Hello Read  " + name;
    }
}
