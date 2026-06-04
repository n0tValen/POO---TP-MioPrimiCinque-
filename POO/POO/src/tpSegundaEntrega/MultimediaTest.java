package tpSegundaEntrega;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MultimediaTest {

    @Test
    void testConstructorYGetters() {
        
        Multimedia m = new Multimedia("Avatar", "Fantasia", "Pelicula");
        
        assertEquals("Avatar", m.getNombre(), "El nombre no se asignó correctamente en el constructor.");
        assertEquals("Fantasia", m.getGenero(), "El género no se asignó correctamente en el constructor.");
        assertEquals("Pelicula", m.getTipo(), "El tipo no se asignó correctamente en el constructor.");
    }

    @Test
    void testSetters() {
        Multimedia m = new Multimedia("Maneskin", "Rock", "Musica");
        
        m.setNombre("Jurassic Park");
        m.setGenero("Sci-Fi");
        m.setTipo("Pelicula");
        
        assertEquals("Jurassic Park", m.getNombre(), "setNombre no modificó el valor esperado.");
        assertEquals("Sci-Fi", m.getGenero(), "setGenero no modificó el valor esperado.");
        assertEquals("Pelicula", m.getTipo(), "setTipo no modificó el valor esperado.");
    }
}
