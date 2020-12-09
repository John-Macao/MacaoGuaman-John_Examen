package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}
	
	public int buscarIDU(int id) {
		String jpql = "SELECT t.usuario.id FROM Telefono t WHERE t.id=" + id;
		int user_id = (int) em.createQuery(jpql).getSingleResult();
		return user_id;
	}
	
	public int buscarIDT(int id_tel, int id_user) {
		String jpql = "SELECT t.tipo.id FROM Telefono t WHERE t.id=" + id_tel + " AND t.usuario.id=" + id_user;
		int tipo_id = (int) em.createQuery(jpql).getSingleResult();
		return tipo_id;
	}
	
	public int buscarIDO(int id_tel, int id_user) {
		String jpql = "SELECT t.operadora.id FROM Telefono t WHERE t.id=" + id_tel + " AND t.usuario.id=" + id_user;
		int oper_id = (int) em.createQuery(jpql).getSingleResult();
		return oper_id;
	}
	
	
	public Telefono buscarTelefono(int id_user, int id_tel) {
		String jpql = "SELECT t FROM Telefono t WHERE t.usuario.id= " + id_user + " AND t.id= " + id_tel;  
		Telefono telefono = (Telefono) em.createQuery(jpql).getSingleResult();
		return telefono;
	}
	
}
