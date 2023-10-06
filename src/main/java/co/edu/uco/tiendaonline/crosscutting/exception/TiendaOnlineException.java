package co.edu.uco.tiendaonline.crosscutting.exception;

import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.lugarException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;

public class TiendaOnlineException extends RuntimeException {
	
	
	private static final long serialVersionUID = -551425372694998396L;
	private lugarException lugar;
	private Throwable exceptionRaiz;
	private String mensajeUsuario;
	private String mensajeTecnico;
	private boolean tieneExcepcionRaiz;
	
	protected TiendaOnlineException(final lugarException lugar,final Throwable exceptionRaiz,final String mensajeUsuario,final
			String mensajeTecnico) {
		setLugar(lugar);
		setExceptionRaiz(exceptionRaiz);
		setMensajeUsuario(mensajeUsuario);
		setMensajeTecnico(mensajeTecnico);
	}

	private final void setLugar(final lugarException lugar) {
		this.lugar = UtilObjeto.obtenerValorDefecto(lugar, lugarException.GENERAL);
	}
	
	private final void setExceptionRaiz(final Throwable exceptionRaiz) {
		setTieneExcepcionRaiz(!(UtilObjeto.esNulo(exceptionRaiz)));
		this.exceptionRaiz = UtilObjeto.obtenerValorDefecto(exceptionRaiz, new Exception());
	}
	
	private final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = UtilTexto.aplicarTrim(mensajeUsuario);
	}
	
	private final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = UtilTexto.aplicarTrim(mensajeTecnico);
	}
	
	
	private final void setTieneExcepcionRaiz(boolean tieneExcepcionRaiz) {
		this.tieneExcepcionRaiz = tieneExcepcionRaiz;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public lugarException getLugar() {
		return lugar;
	}
	
	public Throwable getExceptionRaiz() {
		return exceptionRaiz;
	}
	
	public String getMensajeUsuario() {
		return mensajeUsuario;
	}
	
	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public final boolean isTieneExcepcionRaiz() {
		return tieneExcepcionRaiz;
	}
	

}
