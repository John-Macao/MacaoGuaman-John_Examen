package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Operadora;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
	}
	
	
	public Usuario buscarCedula(String cedula) {
		String jpql = "SELECT u FROM Usuario u WHERE u.cedula= '" + cedula + "'";
		Usuario user = (Usuario) em.createQuery(jpql).getSingleResult(); 

		return user;
	}
	
	public Usuario buscarU(int id_user) {
		String jpql = "SELECT u FROM Usuario u WHERE u.id=" + id_user ;
		Usuario user = (Usuario) em.createQuery(jpql).getSingleResult();
		return user;
	}


	public List<Usuario> listaUser(String cedula) {
		String jpql = "SELECT u FROM Usuario u WHERE u.cedula= '" + cedula + "' ";
		List<Usuario> user = em.createQuery(jpql).getResultList();
		return user;
	}
	
	
}
