import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaRegistroTest {

    /** */
    @Test
    public void testSetDniValido() {
        Persona persona = new Persona();
        assertTrue(persona.setDni("12345678"));
    }

    @Test
    public void testSetDniInvalido() {
        Persona persona = new Persona();
        assertFalse(persona.setDni("1234567")); // Menos de 8 dígitos
        assertFalse(persona.setDni("123456789")); // Más de 8 dígitos
        assertFalse(persona.setDni("abcdefgh")); // Letras en lugar de dígitos
    }

    @Test
    public void testSetEdadValida() {
        Persona persona = new Persona();
        assertTrue(persona.setEdad(18)); // Edad mínima válida
        assertTrue(persona.setEdad(25)); // Edad válida
    }

    @Test
    public void testSetEdadInvalida() {
        Persona persona = new Persona();
        assertFalse(persona.setEdad(17));
        assertFalse(persona.setEdad(-5)); 
    }
}
