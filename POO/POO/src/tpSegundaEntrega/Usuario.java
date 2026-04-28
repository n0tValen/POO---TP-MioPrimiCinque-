package tpSegundaEntrega;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String cuentaRedSocial;
	private List<Registro> registros;
	private List<Multimedia> wishlist;
	
    public Usuario(String nombre, String cuentaRedSocial) {
        this.nombre = nombre;
        this.cuentaRedSocial = cuentaRedSocial;
        this.registros = new ArrayList<>();
        this.wishlist = new ArrayList<>();
    }
    
//Metodos getters
    
    public String getNombre() {
        return nombre;
    }

    public String getCuentaRedSocial() {
        return cuentaRedSocial;
    }
 
 //Metodos setters
    public void setNombre(String nombre) {
    	this.nombre =nombre;
    }
    
    public void setCuentaRedSocial(String cuentaRedSocial) {
    	this.cuentaRedSocial = cuentaRedSocial;
    }
    
 //Devuelve una copia de la lista de registros
    public List<Registro> getRegistros() {
        return new ArrayList<>(registros);
    }
    
//Devuelve una copia de la lista de multimedia
    public List<Multimedia> getWishlist() {
        return new ArrayList<>(wishlist);
    }

//Controla que no hayan repetidos ni nulos en la lista
    public void agregarAWishlist(Multimedia multimedia) {
        if (multimedia != null && !wishlist.contains(multimedia)) {
            wishlist.add(multimedia);
        }
    }

    public List<Multimedia> obtenerUltimosVistos(String fecha, int max) {
        List<Multimedia> resultado = new ArrayList<>();

        for (int i = registros.size() - 1; i >= 0 && resultado.size() < max; i--) {
            Registro r = registros.get(i);

            // compara fechas como String en estricto formato AAAA-MM-DD
            if (r.fecha().compareTo(fecha) <= 0) {
                resultado.add(r.multimedia());
            }
        }

        return resultado;
    }

    public void guardarRegistro(Registro registro) {
        registros.add(registro);
    }
}
