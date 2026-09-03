import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @org.junit.jupiter.api.Test
    void countDigits() {
        assertEquals(3, Main.countDigits("abc123"));
        assertEquals(5, Main.countDigits("13579"));
        assetEquals(0, Main.countDigits("abcdef"));
    }

    @org.junit.jupiter.api.Test
    void isValidPassword() {
        assertTrue(Main.isValidPassword("Passw0rd!"));
        assertTrue(Main.isValidPassword("Ab1!Ab!"));
        assertFalse(Main.isValidPassword("password"));
    }

    @org.junit.jupiter.api.Test
    void countUppercase() {
        assertEquals(2, Main.countUppercase("HelloWorld"));
        assertEquals(3, Main.countUppercase("ABC"));
        assertEquals(0, Main.countUppercase("hello"));
    }

    @org.junit.jupiter.api.Test
    void generateCode() {
        String code = StudentAccessValidator.generateAccessCode();
        assertNotNull(code);
        assertEquals(4, code.length());

        

    }
}
