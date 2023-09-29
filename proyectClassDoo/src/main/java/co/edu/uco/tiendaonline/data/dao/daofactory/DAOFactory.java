package co.edu.uco.tiendaonline.data.dao.daofactory;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;

public abstract class DAOFactory {
	
	protected abstract void abrirConexion();
	
	public abstract void cerrarConexion();
	
	public abstract void IniciarTransaccion();
	
	public abstract void confirmarTransaccion();
	
	public abstract void cnacelarTransaccion();

	public abstract ClienteDAO obtenerClienteDAO();
	
	public abstract TipoIdentificacionDAO obtenerTipoIdentificacionDAO();
}
