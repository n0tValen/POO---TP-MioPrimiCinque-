package tpEntregaFinal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UsuarioTest{
	//muestra por consola los registros dentro de wishlist del usuario
	@Test
	void registroWishlistUsuario() {
		Usuario usuario = 
				new Usuario("Anna Rojas", "AnniiR");
		Multimedia m1 =
				new Multimedia("The Boys", "Sci-Fi", "Serie");
		Multimedia m2 =
				new Multimedia("Pappo's Blues", "Rock Nacional", "Musica");
		Multimedia m3 =
				new Multimedia("Obsession", "Thriller", "Pelicula");
		Multimedia m4 =
				new Multimedia("Michael", "Drama/Biografica", "Pelicula");
		
		usuario.agregarAWishlist(m1);
		usuario.agregarAWishlist(m3);
		usuario.agregarAWishlist(m2);
		
		Registro registro =
				Registro.crearRegistro("2026-05-20", 7,"Entretenida", m4);
		usuario.guardarRegistro(registro);
		
		System.out.println("-- Wishlist de "+usuario.getNombre()+" / @" + usuario.getCuentaRedSocial());
		
		for (Multimedia multimedia : usuario.getWishlist()) {
			System.out.println(multimedia.getNombre() + "|" + multimedia.getTipo());
		}
		
		System.out.println("-- Registros--");
		for (Registro r : usuario.getRegistros()) {
			System.out.println(r.getFecha() + "|"+r.getMultimedia().getNombre()+"|"+r.getPuntaje()+ "| '"+ r.getResenia()+ "' |" + r.getMultimedia().getTipo());
		}
		assertEquals(3,usuario.getWishlist().size());
		assertEquals(1,usuario.getRegistros().size());
	}
}