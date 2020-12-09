package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadora
 *
 */
@Entity
@Table(name="operadora")

public class Operadora implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String oper;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "operadora")
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	
	public Operadora(int id, String oper) {
		super();
		this.id = id;
		this.oper = oper;
	}

	public Operadora() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}


	public void setTelefono(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefonos(Telefono telefono) {
		this.telefonos.add(telefono);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
