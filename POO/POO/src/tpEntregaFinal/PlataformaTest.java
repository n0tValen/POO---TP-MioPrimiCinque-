package tpEntregaFinal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class PlataformaTest {

    @Test
    void testConstructorYInicializacion() {
        Plataforma p = new Plataforma("Netflix");
        
        assertEquals("Netflix", p.getNombre(), "El nombre de la plataforma no se asignó correctamente.");
        
        assertNotNull(p.getMultimediaDisponible(), "La lista de contenidos disponibles no debería ser null.");
        assertTrue(p.getMultimediaDisponible().isEmpty(), "La lista de contenidos debería arrancar vacía.");
    }

    @Test
    void testAsociarMultimedia() {

        Plataforma p = new Plataforma("Spotify");
        Multimedia m1 = new Multimedia("Maneskin", "Rock", "Musica");
        

        p.asociar(m1);
        
        List<Multimedia> lista = p.getMultimediaDisponible();
        
        assertEquals(1, lista.size(), "La lista debería tener 1 elemento después de asociar.");
        assertEquals("Maneskin", lista.get(0).getNombre(), "El elemento en la lista no coincide con el asociado.");
        
        Multimedia m2 = new Multimedia("Avatar", "Fantasia", "Pelicula");
        p.asociar(m2);
        
        assertEquals(2, p.getMultimediaDisponible().size(), "La lista debería tener 2 elementos tras agregar el segundo.");
    }

    @Test
    void testSetNombre() {
        Plataforma p = new Plataforma("HBO");
     
        p.setNombre("Max");
        
        assertEquals("Max", p.getNombre(), "setNombre no modificó el nombre de la plataforma correctamente.");
    }
}
