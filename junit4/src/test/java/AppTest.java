import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {


    @Test
    public void getHello() {
        App app = new App();
        Assert.assertEquals("Hello", app.getHello());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}