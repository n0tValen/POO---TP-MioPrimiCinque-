package tpSegundaEntrega;

public class Multimedia {

    private String nombre;
    private String genero;
    private String tipo;
	
 
    public Multimedia(String nombre, String genero, String tipo) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
    }
   
   //Métodos getters
    public String getNombre() {
        return nombre;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    //Metodos setters
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }
}
