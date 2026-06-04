package tpEntregaFinal;

import java.util.ArrayList;
import java.util.List;

public class SistemaMP5 {
	private List<Usuario> registroUsuarios = new ArrayList <>();
	
	public Boolean crearUsuario(String nombre, String cuentaRedSocial) {	
		Boolean existeUsuario = validarExistencia(nombre,cuentaRedSocial);
		if (!existeUsuario){
			Usuario nuevoUsuario = new Usuario(nombre,cuentaRedSocial);
			registrarUsuario(nuevoUsuario);
			return true;//usuario creado con exito
		}
		return false;//el usuario ya estaba registrado
	}
	
	private Boolean validarExistencia(String nombre, String cuentaRedSocial) {
		for(int i=0; i<registroUsuarios.size();i++){
			Usuario u = registroUsuarios.get(i);
			String cuentaUsuario = u.getCuentaRedSocial();
			String nombreUsuario = u.getNombre();
			if (nombreUsuario.equals(nombre) && cuentaUsuario.equals(cuentaRedSocial)){
				return true;
			}
		}
		return false;
	}
	
	private void registrarUsuario(Usuario nuevoUsuario) {
		registroUsuarios.add(nuevoUsuario);
	}	
	
	
	public List<Multimedia> filtrarPorPuntaje(int puntaje, List<Registro> listaRegistros){
		Filtrado filtro = new Filtrado();		
		List<Multimedia> multimediaBuscada = filtro.porPuntaje(puntaje, listaRegistros);
		return multimediaBuscada;
	}
	
	public List<Multimedia> filtrarPorPlataforma(Plataforma plataforma, List<Multimedia> listaMultimedia){
		Filtrado filtro = new Filtrado();		
		List<Multimedia> multimediaBuscada = filtro.porPlataforma(plataforma, listaMultimedia);
		return multimediaBuscada;
	}
	
	public void agregarRegistro(Usuario usuario, Multimedia multimedia, int puntaje, String resenia, String fecha){
		Registro nuevoRegistro = new Registro(fecha,puntaje,resenia,multimedia);
		usuario.guardarRegistro(nuevoRegistro);
	}
}









