package tpEntregaFinal;

import java.util.ArrayList;
import java.util.List;

public class Filtrado {

	public List<Multimedia> porPlataforma(Plataforma plataforma, List<Multimedia> listaMultimedia){
		List<Multimedia> contenidosPlataforma = plataforma.getMultimediaDisponible();
		List<Multimedia> multimediaBuscada = new ArrayList <>();
		
		for (int i=0; i<listaMultimedia.size(); i++) {
			Multimedia multimedia = listaMultimedia.get(i);
			String nombreMultimedia = multimedia.getNombre();
			Boolean encontrado = false;
			for(int j=0; j<contenidosPlataforma.size() && !encontrado; j++){		
				Multimedia contenido = contenidosPlataforma.get(j);
				if(nombreMultimedia.equalsIgnoreCase(contenido.getNombre())){
					multimediaBuscada.add(multimedia);
					encontrado = true; 
				}
			}
		}
		return multimediaBuscada;
	}
	
	
	public List<Multimedia> porPuntaje(int puntaje, List<Registro> listaRegistros){
		List<Multimedia> multimediaBuscada = new ArrayList <>();
		
		for(int i=0; i<listaRegistros.size(); i++) {
			Registro r = listaRegistros.get(i);
			int puntajeRegistro = r.getPuntaje();
			if(puntajeRegistro == puntaje){	
				multimediaBuscada.add(r.getMultimedia());
			}	
		}
		return multimediaBuscada;
	}
	
	
}
