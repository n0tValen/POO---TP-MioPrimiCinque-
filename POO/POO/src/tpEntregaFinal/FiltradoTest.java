package tpEntregaFinal;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FiltradoTest {

    @Test
    void filtrarPorPuntaje() {

        Filtrado filtro = new Filtrado();

        Multimedia m1 =
                new Multimedia("Avatar", "Fantasia", "Pelicula");
        Multimedia m2 =
                new Multimedia("The Boys", "Sci-Fi", "Serie");

        List<Registro> registros = new ArrayList<>();

        registros.add(
                Registro.crearRegistro("2026-01-10", 10, "Excelente", m1));

        registros.add(
                Registro.crearRegistro("2026-01-15", 8, "Muy buena", m2));

        List<Multimedia> resultado =
                filtro.porPuntaje(10, registros);

        assertEquals(1, resultado.size());
        assertEquals("Avatar", resultado.get(0).getNombre());
    }

    @Test
    void filtrarPorPlataforma() {

        Filtrado filtro = new Filtrado();

        Plataforma netflix = new Plataforma("Netflix");

        Multimedia m1 =
                new Multimedia("Avatar", "Fantasia", "Pelicula");
        Multimedia m2 =
                new Multimedia("The Boys", "Sci-Fi", "Serie");
        Multimedia m3 =
                new Multimedia("Dark", "Sci-Fi", "Serie");

        netflix.asociar(m1);
        netflix.asociar(m3);

        List<Multimedia> listaMultimedia = new ArrayList<>();
        listaMultimedia.add(m1);
        listaMultimedia.add(m2);
        listaMultimedia.add(m3);

        List<Multimedia> resultado =
                filtro.porPlataforma(netflix, listaMultimedia);

        assertEquals(2, resultado.size());
        assertEquals("Avatar", resultado.get(0).getNombre());
        assertEquals("Dark", resultado.get(1).getNombre());
    }
}