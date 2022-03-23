import static org.junit.jupiter.api.Assertions.*;

class ZahlenTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(150, Zahlen.add(125,25));
    }

    @org.junit.jupiter.api.Test
    void greater100() {
        assertTrue(Zahlen.greater100(101));
        assertFalse(Zahlen.greater100(100));
    }
}