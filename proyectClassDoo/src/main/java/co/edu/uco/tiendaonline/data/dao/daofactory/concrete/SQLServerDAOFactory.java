package co.edu.uco.tiendaonline.data.dao.daofactory.concrete;

import java.sql.Connection;
import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.dao.concrete.sqlserver.ClienteSQLServerDAO;
import co.edu.uco.tiendaonline.data.dao.concrete.sqlserver.TipoIdentificacionSQLServerDAO;
import co.edu.uco.tiendaonline.data.dao.daofactory.DAOFactory;

public final class SQLServerDAOFactory extends DAOFactory {

	private Connection conexion;
	
	public SQLServerDAOFactory() {
		abrirConexion();
	}
	@Override
	protected final void abrirConexion() {
		// TODO your homework will be obtain connection with SQL server database
		conexion = null;
	}

	@Override
	public final void cerrarConexion() {
		// TODO your homework will be to close connection
		
	}

	@Override
	public final void IniciarTransaccion() {
		// TODO your homework will be to init transaction
		
	}

	@Override
	public final void confirmarTransaccion() {
		// TODO your homework will be to commit the transaction
		
	}

	@Override
	public final void cancelarTransaccion() {
		// TODO your homework will be to rollback  transaction
		
	}

	@Override
	public  ClienteDAO obtenerClienteDAO() {
		return new ClienteSQLServerDAO(conexion);
	}

	@Override
	public TipoIdentificacionDAO obtenerTipoIdentificacionDAO() {
		return new TipoIdentificacionSQLServerDAO(conexion); 
	}
			
}
