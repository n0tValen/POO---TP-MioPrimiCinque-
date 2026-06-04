package tpSegundaEntrega;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ServicioIMTest{
	//devuelve una lista de contenido recomendado de un usuario nuevo
	@Test
	void recomendarContenidoLista() {
		ServicioIM servicio = new ServicioIM();
		
		Usuario usuario =
				new Usuario ("Anna Rojas", "AnniiR");
		
		List<Multimedia> recomendaciones =
				servicio.recomendarContenido(usuario);
		System.out.println("--Contenido recomendado para "+ usuario.getNombre()+ "--");
		
		for (Multimedia multimedia : recomendaciones) {
			System.out.println(multimedia.getNombre());
		}
		assertEquals(3, recomendaciones.size());
	}
	//devuelve una lista de recomendaciones de amistades para un usuario
	@Test
	void recomendarAmistadesLista() {
		ServicioIM servicio = new ServicioIM();
		
		Usuario usuario =
				new Usuario ("Anna Rojas", "AnniiR");
		
		List<Usuario> amistades =
				servicio.recomendarAmistades(usuario);
		System.out.println("\n--Sugerencias de Amistad--");
		
		for (Usuario amistad : amistades) {
			System.out.println(amistad.getNombre() + " @"+ amistad.getCuentaRedSocial());
			
		}
		assertEquals(2,amistades.size());
	}
}