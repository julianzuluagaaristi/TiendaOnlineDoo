package co.edu.uco.tiendaonline.data.dao.daofactory;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.dao.daofactory.concrete.SQLServerDAOFactory;

public abstract class DAOFactory {
	
	public static final DAOFactory obtenerDAOFactory(final TipoDAOFactory factoria) {
		switch (factoria) {
		case SQLSERVER: {
			return new SQLServerDAOFactory();
		}
		case POSTGRESSQL:{
			//TODO: Falta mejorar el manejo de excepciones customizadas
			throw new RuntimeException("Factoria no soportada");
		}
		case MYSQL:{
			//TODO: Falta mejorar el manejo de excepciones customizadas
			throw new RuntimeException("Factoria no soportada");
		}
		case ORACLE:{
			//TODO: Falta mejorar el manejo de excepciones customizadas
			throw new RuntimeException("Factoria no soportada");
		}
		default:
			throw new RuntimeException("Factoria no soportada");
		}
	}
	
	protected abstract void abrirConexion();
	
	public abstract void cerrarConexion();
	
	public abstract void IniciarTransaccion();
	
	public abstract void confirmarTransaccion();
	
	public abstract void cancelarTransaccion();

	public abstract ClienteDAO obtenerClienteDAO();
	
	public abstract TipoIdentificacionDAO obtenerTipoIdentificacionDAO();
	
}
