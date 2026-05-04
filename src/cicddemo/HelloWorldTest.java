package cicddemo;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
	 @Test
	    public void testMessage() {
	        HelloWorld hw = new HelloWorld();
	        String output = "Hello, World!";
	        assertEquals(output, "Hello, World!");
	    }

}
