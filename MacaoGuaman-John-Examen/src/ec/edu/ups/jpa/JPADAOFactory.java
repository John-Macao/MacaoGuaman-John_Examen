package ec.edu.ups.jpa;


import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.DAOFactory;

public class JPADAOFactory extends DAOFactory {
	
	public UsuarioDAO getUsuarioDAO() {
		return new JPAUsuarioDAO();
	}

	public TelefonoDAO getTelefonoDAO() {
		return new JPATelefonoDAO();
	}

	public TipoDAO getTipoDAO() {
		return new JPATipoDAO();
	}

	public OperadoraDAO getOperadoraDAO() {
		return new JPAOperadoraDAO();
	}

}
