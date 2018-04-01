import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingImplTest {
    private Greeting greeting;
    @Before
    public void setup(){
        System.out.println("Setup");
        greeting =new GreetingImpl();
    }

    @org.junit.Test
    public void greetShouldReturnAValidOutput() {
        System.out.println("greetShouldReturnAValidOutput");
        String result= greeting.greet("Junit");
        assertNotNull(result);
        assertEquals("Hallo Junit",result);
    }

    @Test(expected=IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsNull(){
        System.out.println("greetShouldThrowAnExceptionForNameIsNull");
        greeting.greet(null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsBlank(){
        System.out.println("greetShouldThrowAnExceptionForNameIsBlank");
        greeting.greet("");
    }

    @After
    public void teardown(){
        System.out.println("teardown");
        greeting=null;
    }
}