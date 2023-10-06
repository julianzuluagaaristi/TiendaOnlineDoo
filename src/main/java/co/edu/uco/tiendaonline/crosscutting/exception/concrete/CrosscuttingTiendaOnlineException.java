package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.lugarException;

public class CrosscuttingTiendaOnlineException extends TiendaOnlineException{
	
	private static final long serialVersionUID = 1L;

	protected CrosscuttingTiendaOnlineException(final Throwable exceptionRaiz,final String mensajeUsuario,
			final String mensajeTecnico) {
		super(lugarException.CROSSCUTTING, exceptionRaiz, mensajeUsuario, mensajeTecnico);
	}

	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario,final String mensajeTecnico) {
		return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario,final String mensajeTecnico,
			final Throwable exceptionRaiz ) {
		return new CrosscuttingTiendaOnlineException(exceptionRaiz, mensajeUsuario, mensajeTecnico);
	}
}
