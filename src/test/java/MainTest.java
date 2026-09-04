package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.java.Main;
import main.java.StudentAccessValidator;


public class MainTest {

    @Test
    void countDigits() {
        assertEquals(3, Main.countDigits("van123"));
        assertEquals(5, Main.countDigits("74513"));
        assertEquals(0, Main.countDigits("abcdef"));
    }

    @Test
    void isValidPassword() {
        assertTrue(Main.isValidPassword("Passw0rd!"));
        assertTrue(Main.isValidPassword("Ab1!Ab!"));
        assertFalse(Main.isValidPassword("password"));
    }

    @Test
    void countUppercase() {
        assertEquals(2, Main.countUppercase("HelloWorld"));
        assertEquals(3, Main.countUppercase("ABC"));
        assertEquals(0, Main.countUppercase("hello"));
    }

    @Test
    void generateCode() {
        String code = StudentAccessValidator.generateAccessCode();
        assertNotNull(code);
        assertEquals(4, code.length());
    }
}
