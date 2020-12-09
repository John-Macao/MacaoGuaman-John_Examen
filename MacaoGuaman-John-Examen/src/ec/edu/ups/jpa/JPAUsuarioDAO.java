package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
	}
	
	
}
