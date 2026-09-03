import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    
    @Test
    void testCountDigitsWithThreeDigits(){
        assertEquals(3, Main.countDigits("abc123"));
    }

    @Test
    void testCountDigitsWithNoDigits(){
        assertEquals(0, Main.countDigits("Hello"));
    }

    @Test
    void testCountDigitsWithAllDigits(){
        assertEquals(5, Main.countDigits("12345"));
    }

    @Test
    void testValidPassword(){
        assertTrue(Main.isValidPassword("Vanier123"));
    }

    @Test
    void testPasswordTooShort(){
        assertFalse(Main.isValidPassword("Vanier1"));
    }

    @Test
    void testPasswordWithoutLowercase(){
        assertFalse(Main.isValidPassword("VANIER123"));
    }

    @Test
    void testPasswordWithoutDigit(){
        assertFalse(Main.isValidPassword("VanierABC"));
    }

    @Test
    void testGenerateCodeHasLengthFour(){
        String code = Main.generateCode();
        assertEquals(4, code.length());
    }

    /*@Test
    void testGenerateCodeUsesAllowedCharacters(){
        String code = Main.generateCode();
        for (int = 0; i < code.length(); i++){
            char c = code.charAt(i);
            assertTrue(c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E');
        }    FINISH */
    }

