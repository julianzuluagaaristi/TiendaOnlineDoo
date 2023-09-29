package co.edu.uco.tiendaonline.data.entity.support;

public class CorreoElectronicoClienteEntity {
	private String correoElectronico;
	private boolean correoElectronicoConfirmado;

	public CorreoElectronicoClienteEntity(final String correoElectronico,final boolean correoElectronicoConfirmado) {
		setCorreoElectronico(correoElectronico);
		setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
	}
	
	public static final CorreoElectronicoClienteEntity crear(final String correoElectronico,final boolean correoElectronicoConfirmado) {
		return new CorreoElectronicoClienteEntity(correoElectronico, correoElectronicoConfirmado);
	}

	public final String getCorreoElectronico() {
		return correoElectronico;
	}

	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}

	private final void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	private final void setCorreoElectronicoConfirmado(boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
	}
	
	
}