package entrega2;

import java.util.ArrayList;
import java.util.List;

// Simulación de respuestas del sistema externo "Ingeniería Modenna (IM)".

public class ServicioIM {

    public List<Multimedia> recomendarContenido(Usuario usuario) {

        List<Multimedia> contenidoRecomendado = new ArrayList<>();

        contenidoRecomendado.add(new Multimedia("Avengers: Endgame", "Acción/Aventura", "Película"));
        contenidoRecomendado.add(new Multimedia("Stranger Things", "Ciencia Ficción", "Serie"));
        contenidoRecomendado.add(new Multimedia("Star Wars III","Ciencia Ficción","Película"));

        return contenidoRecomendado;
    }

    public List<Usuario> recomendarAmistades(Usuario usuario) {
        
        List<Usuario> amistadesRecomendadas = new ArrayList<>();

        amistadesRecomendadas.add(new Usuario("Carla Rodriguez", "CarlitaRodri"));
        amistadesRecomendadas.add(new Usuario("Juan Perez", "JuanchiPe"));

        return amistadesRecomendadas;
    }
}