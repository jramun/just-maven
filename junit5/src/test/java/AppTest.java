import org.junit.jupiter.api.Assertions;

class AppTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getHello() {
        App app = new App();
        Assertions.assertEquals("Hello", app.getHello());
    }
}