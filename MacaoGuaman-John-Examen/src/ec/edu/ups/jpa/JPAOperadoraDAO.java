package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.modelo.Operadora;
import ec.edu.ups.modelo.Tipo;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora, Integer> implements OperadoraDAO {
	
	public JPAOperadoraDAO() {
		super(Operadora.class);
	}
	
	
	public Operadora buscarOperNombre(String nombre_oper) {
		String jpql = "SELECT o FROM Operadora o WHERE o.oper= '" + nombre_oper + "'";
		Operadora oper = (Operadora) em.createQuery(jpql).getSingleResult(); 

		return oper;
	}
	
	
	public Operadora buscarO(int id_oper) {
		String jpql = "SELECT o FROM Operadora o WHERE o.id=" + id_oper ;
		Operadora oper = (Operadora) em.createQuery(jpql).getSingleResult();
		return oper;
	}
	

}
