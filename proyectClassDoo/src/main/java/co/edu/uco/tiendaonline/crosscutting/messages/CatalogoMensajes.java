package co.edu.uco.tiendaonline.crosscutting.messages;

import java.util.HashMap;
import java.util.Map;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrosscuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.messages.enumerator.CategoriaMensaje;
import co.edu.uco.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.uco.tiendaonline.crosscutting.messages.enumerator.TipoMensaje;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;

public final class CatalogoMensajes {
	
	private static final Map<CodigoMensaje, Mensaje> MENSAJES = new
			HashMap<CodigoMensaje, Mensaje>();
	
	static {
		cargarMensajes();
	}
	
	private CatalogoMensajes(){
		super();
	}
	
	private static final void cargarMensajes() {
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000001,TipoMensaje.TECNICO,CategoriaMensaje.FATAL,
				"No se recibio el codigo del mensaje que se iba a crear,"
				+ " no es posible continuar con el proceso "));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000002, TipoMensaje.TECNICO,CategoriaMensaje.FATAL,
				"No existe un mensaje con el codigo indicado. "
				+ "No es posible continuar con el proceso.."));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000003, TipoMensaje.TECNICO,CategoriaMensaje.FATAL,
				"No es posible obtener un mensaje con un codigo vacio o nulo."
				+ "No es posible continuar con el proceso.."));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000004, TipoMensaje.USUARIO,CategoriaMensaje.FATAL,
				"Se ha presentado un problema inesperado tratando de llevar a cabo la operacion deseada."
				+ "por favor intente de nuevo y si el problema persiste por favor contacte al administrador"
				+ "de la aplicacion "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000005, TipoMensaje.TECNICO,CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de verificar si la conexion SQL estaba abierta"
				+ "se presentó una exception de tipo SQLException, por favor verifique la traza completa"
				+ "del error presentado, para así poder diagnosticar con mayor certeza que sucedio "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000006, TipoMensaje.TECNICO,CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de verificar si la conexion SQL estaba abierta"
				+ "se presentó una excepcion generica de tipo exception, por favor verifique la traza completa"
				+ "del error presentado, para así poder diagnosticar con mayor certeza que sucedio "));
		
		}
	
	private static void agregarMensaje(final Mensaje mensaje) {
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}
	
	public static final Mensaje obtenerMensaje(final CodigoMensaje codigo) {
		
		if (UtilObjeto.esNulo(codigo)) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M00000004);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M00000001);		
			throw CrosscuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
		}
		
		if(!MENSAJES.containsKey(codigo)) {
			var mensajeUsuario = obtenerMensaje(CodigoMensaje.M00000004).getContenido();
			var mensajeTecnico = obtenerMensaje(CodigoMensaje.M00000002).getContenido();		
			throw CrosscuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
		}
		
		return MENSAJES.get(codigo);
	
	}
	public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}

}
