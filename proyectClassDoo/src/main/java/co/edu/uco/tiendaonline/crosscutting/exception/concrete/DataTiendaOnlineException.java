package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.lugarException;

public class DataTiendaOnlineException extends TiendaOnlineException {
	
	private static final long serialVersionUID = -9177484194126685659L;
	
	protected DataTiendaOnlineException(final Throwable exceptionRaiz,final String mensajeUsuario,
			final String mensajeTecnico) {
		super(lugarException.DATA, exceptionRaiz, mensajeUsuario, 
				mensajeTecnico);
	}

	
	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario,final String mensajeTecnico) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario,final String mensajeTecnico,
			final Throwable exceptionRaiz ) {
		return new DataTiendaOnlineException(exceptionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
