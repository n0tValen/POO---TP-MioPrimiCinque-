package tpSegundaEntrega;

import java.util.ArrayList;
import java.util.List;
//import multimedia.Multimedia;

public class Plataforma {
	  
    private String nombre;
    private List<Multimedia> contenidosDisponibles;


    public Plataforma(String nombre) {
        this.setNombre(nombre);
        this.contenidosDisponibles = new ArrayList<>();
    }

    public List<Multimedia> getMultimediaDisponible() {
        return contenidosDisponibles;
    }


    public void asociar(Multimedia m) {
        this.contenidosDisponibles.add(m);
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
