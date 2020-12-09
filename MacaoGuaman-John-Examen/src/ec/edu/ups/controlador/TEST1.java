package ec.edu.ups.controlador;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Operadora;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Tipo;
import ec.edu.ups.modelo.Usuario;

public class TEST1 {

	public static void main(String[] args) {
		
		TipoDAO tipDAO = DAOFactory.getFactory().getTipoDAO();
		Tipo tip = new Tipo(0, "Movil");
		tipDAO.create(tip);
				
		OperadoraDAO operDAO = DAOFactory.getFactory().getOperadoraDAO();
		Operadora oper = new Operadora(0, "Movistar");
		operDAO.create(oper);
		
		UsuarioDAO userDAO = DAOFactory.getFactory().getUsuarioDAO();
		Usuario user = new Usuario(0, "098766777", "Michael", "Macao", "jmacao@est.ups.edu.ec", "macao123");
		userDAO.create(user);
		
		
		TelefonoDAO telDAO = DAOFactory.getFactory().getTelefonoDAO();
		Telefono tel = new Telefono(0, "0987654321", user, tip, oper);
		
		telDAO.create(tel);
		
		
	}
}
