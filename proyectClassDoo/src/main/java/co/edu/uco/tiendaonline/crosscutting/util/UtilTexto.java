package co.edu.uco.tiendaonline.crosscutting.util;

public final class UtilTexto {
	public static final String VACIO="";
	
	private UtilTexto() {
		super();
	}
	
	public static final String obtenerValorDefecto(final String valor,final String valorDefecto) {
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
	}
	
	public static final String aplicarTrim(final String valor) {
		return obtenerValorDefecto(valor).trim();
	}
	
	public static final String obtenerValorDefecto(final String valor) {
		return obtenerValorDefecto(valor, VACIO);
	}
	
	public static final boolean igualSinTrim(final String valor1, final String valor2) {
		return obtenerValorDefecto(valor1).equals(obtenerValorDefecto(valor2));
	}
	
	public static final boolean igualConTrim(final String valor1, final String valor2) {
		return aplicarTrim(valor1).equals(aplicarTrim(valor2));
	}
	
	public static final boolean igualSinTrimIgnoreCase(final String valor1, final String valor2) {
		return obtenerValorDefecto(valor1).equalsIgnoreCase(obtenerValorDefecto(valor2));
	}
	
	public static final boolean igualConTrimIgnoreCase(final String valor1, final String valor2) {
		return aplicarTrim(valor1).equalsIgnoreCase(aplicarTrim(valor2));
	}
	
	
	
}
