package co.edu.uco.tiendaonline.data.entity.support;

public class NumeroTelefonoClienteEntity {
	private String numeroTelefonoMovil;
	private boolean numeroTelefonicoConfirmado;

	public NumeroTelefonoClienteEntity(final String numeroTelefonoMovil,final boolean numeroTelefonicoConfirmado) {
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setNumeroTelefonicoConfirmado(numeroTelefonicoConfirmado);
	}
	
	public static final NumeroTelefonoClienteEntity crear(final String numeroTelefonoMovil,final boolean numeroTelefonicoConfirmado) {
		return new NumeroTelefonoClienteEntity(numeroTelefonoMovil, numeroTelefonicoConfirmado);				
	}

	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}

	public final boolean isNumeroTelefonicoConfirmado() {
		return numeroTelefonicoConfirmado;
	}

	private final void setNumeroTelefonoMovil(String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
	}

	private final void setNumeroTelefonicoConfirmado(boolean numeroTelefonicoConfirmado) {
		this.numeroTelefonicoConfirmado = numeroTelefonicoConfirmado;
	}
	
	
	
}
