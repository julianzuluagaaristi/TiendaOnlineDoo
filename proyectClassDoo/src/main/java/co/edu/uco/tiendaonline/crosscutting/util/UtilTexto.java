package co.edu.uco.tiendaonline.crosscutting.util;


public final class  UtilTexto {
	
	public static final String VACIO = "";
	private static final String PATTERN_SOLO_DIGITOS = "\\d+";
	private static final String PATTERN_SOLO_LETRAS = "^[A-Za-záéíóúÁÉÍÓÚ]+$";
	private static final String PATTERN_SOLO_LETRAS_DIGITOS = "^[0-9A-Za-záéíóúÁÉÍÓÚ]+$";
	private static final String PATTERN_SOLO_LETRAS_DIGITOS_ESPACIOS = "^[0-9A-Za-záéíóúÁÉÍÓÚ ]+$";
	private static final String PATTERN_SOLO_LETRAS_DIGITOS_ARROBA_DOMINIO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	
	private UtilTexto() {
		super();
	}
	
	public static final String obtenerValorDefecto(final String valor, final String valorDefecto) {
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
	}
	
	public static final String aplicarTrim(final String valor){
		return obtenerValorDefecto(valor).trim();
		
	}
	
	public static final String obtenerValorDefecto(final String valor) {
		return obtenerValorDefecto(valor, VACIO);
	}
	
	public static final boolean igualSinTrim(final String primerValor, final String segundoValor) {
		return obtenerValorDefecto(primerValor).equals(obtenerValorDefecto(segundoValor));
	}
	
	public static final boolean igualConTrim(final String primerValor, final String segundoValor) {
		return aplicarTrim(primerValor).equals(aplicarTrim(segundoValor));
	}
	
	public static final boolean igualSinTrimIgnorandoCase(final String primerValor, final String segundoValor) {
		return obtenerValorDefecto(primerValor).equalsIgnoreCase(obtenerValorDefecto(segundoValor));
	}
	
	public static final boolean igualConTrimIgnoreCase(final String primerValor, final String segundoValor) {
		return aplicarTrim(primerValor).equalsIgnoreCase(aplicarTrim(segundoValor));
	}
	public static final boolean estaNulo(final String valor) {
		return UtilObjeto.esNulo(valor);
	}
	public static final boolean estaVacio(final String valor) {
		return igualConTrim(valor, VACIO);
	}
	public static final boolean longitudMinimaValida(final String valor, final int longitudMinima) {
		return aplicarTrim(valor).length()>= longitudMinima;
	}
	public static final boolean longitudMaximaValida(final String valor, final int longitudMaxima) {
		return aplicarTrim(valor).length() <= longitudMaxima;
	}
	public static final boolean longitudValida(final String valor, final int longitudMinima, final int longitudMaxima) {
		return longitudMinimaValida(valor, longitudMinima) && longitudMaximaValida(valor, longitudMaxima);
	}
	public static boolean contieneSoloLetras(final String valor) {
	    return aplicarTrim(valor).matches(PATTERN_SOLO_LETRAS);
	}
	public static boolean contieneSoloLetrasDigitosEspacios(final String valor) {
	    return aplicarTrim(valor).matches(PATTERN_SOLO_LETRAS_DIGITOS_ESPACIOS);
	}
	public static boolean contieneSoloLetrasDigitosArrobaDominio(final String valor) {
		return aplicarTrim(valor).matches(PATTERN_SOLO_LETRAS_DIGITOS_ARROBA_DOMINIO);
	}
	public static final boolean contieneSoloDigitos(final String valor) {
		return aplicarTrim(valor).matches(PATTERN_SOLO_DIGITOS);
	}
	public static final boolean contieneSoloLetrasDigitos(final String valor) {
		return aplicarTrim(valor).matches(PATTERN_SOLO_LETRAS_DIGITOS);
	}
}
