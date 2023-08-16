package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resusable.BrowserInvoke;

import java.io.IOException;

public class Hooks {

    @Before()
    public void setUp() throws IOException {
        System.out.println("--Starting the Browser----");
        BrowserInvoke.launchApp();
    }

    @After()
    public void tearDown(){
        System.out.println("end");
    }

}
