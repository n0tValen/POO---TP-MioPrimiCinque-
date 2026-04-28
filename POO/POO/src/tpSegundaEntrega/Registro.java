package tpSegundaEntrega;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    private String fecha; //Fecha en estricto formato AAAA-MM-DD
    private int puntaje;
    private String resenia;
    private Multimedia multimedia;

    public Registro(String fecha, int puntaje, String resenia, Multimedia multimedia) {
        this.fecha = fecha;
        this.puntaje = puntaje;
        this.resenia = resenia;
        this.multimedia = multimedia;
    }
    
    //Métodos getters
    public String getFecha() {
        return fecha;
    }
    
    public int getPuntaje() {
    	return puntaje;
    }

    public String getResenia() {
    	return resenia;
    }
    
    public Multimedia getMultimedia() {
    	return multimedia;
    }

	public static Registro crearRegistro(String fecha, int puntaje, String resenia, Multimedia multimedia) {
           return new Registro(fecha, puntaje, resenia, multimedia);
        }

    public Boolean existeRegistro(String fecha, Multimedia multimedia) {
        List<Registro> registroDoble = new ArrayList<> ();
         for (int i=0; i< registroDoble.size(); i++) {
			 Registro r = registroDoble.get(i);
			 String fechaRegistro = r.getFecha();
			 Multimedia multimediaRegistro = r.getMultimedia();
			 if(fechaRegistro.equals(fecha) && multimediaRegistro.equals(multimedia)){
				 return true; //si es true, crea el registro
			 }
		 }
		 return false;
		 }
   }