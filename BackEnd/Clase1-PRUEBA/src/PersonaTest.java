import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test
    void mostrarNombre() {
        Persona persona = new Persona("Jose","Allende","blabla",18);
        assertEquals("Jose Allende", persona.mostrarNombre());
    }

    @org.junit.jupiter.api.Test
    void esMayor() {
        Persona persona = new Persona("Jose","Allende","blabla",18);
        assertTrue(persona.esMayor());
    }
}