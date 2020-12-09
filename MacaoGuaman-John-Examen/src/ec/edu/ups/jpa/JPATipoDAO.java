package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.modelo.Tipo;

public class JPATipoDAO extends JPAGenericDAO<Tipo, Integer> implements TipoDAO {
	
	public JPATipoDAO() {
		super(Tipo.class);
	}
	
	public Tipo buscarTipoNombre(String nombre_tipo) {
		String jpql = "SELECT t FROM Tipo t WHERE t.tip= '" + nombre_tipo + "'";
		Tipo tipo = (Tipo) em.createQuery(jpql).getSingleResult(); 

		return tipo;
	}
	

}
