package ch.maxant.demo.springboottests;

public class SomeServiceImpl implements SomeService {


    @Override
    public String doSomething(String s) {
        return "Hello " + s;
    }
}
