package tpSegundaEntrega;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


class RegistroTest {
	
	@Test
	void listaNuevoRegistroMultimedia() {
		
		List<Multimedia> listaMultimedia =
				new ArrayList<>();
		Multimedia m1 =
				new Multimedia("El Hobbit", "Fantasia", "Pelicula");
		Multimedia m2 =
				new Multimedia("Radiohead", "Alt Rock", "Musica");
		Multimedia m3 =
				new Multimedia("Los Juegos Del Hambre", "Distopico", "Novela");
		Multimedia m4 =
				new Multimedia("Kingdom Hearts", "Aventura","Videojuego");
		
		listaMultimedia.add(m1);
		listaMultimedia.add(m2);
		listaMultimedia.add(m3);
		listaMultimedia.add(m4);
		
		List<Registro> registros =
				new ArrayList<>();
		
		registros.add(Registro.crearRegistro("2022-07-22", 10, "Excelente", m4));
		registros.add(Registro.crearRegistro("2016-02-09", 8, "Muy entretenido", m3));
		registros.add(Registro.crearRegistro("2018-11-26", 9, "Muy buena", m2));
		registros.add(Registro.crearRegistro("2016-09-11", 8, "Buenisima", m1));
		
		System.out.println("--Registros--");
		
		for(Registro r : registros) {
			System.out.println(r.getMultimedia().getNombre() + " | " + r.getPuntaje() + " | " + r.getFecha() + "|" + r.getResenia());
		}
		assertEquals(3,registros.size());
		
	}
	
}