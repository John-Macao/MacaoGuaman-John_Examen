package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity
@Table(name="tipo")

public class Tipo implements Serializable {



	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String tip;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	public Tipo(int id, String tip) {
		super();
		this.id = id;
		this.tip = tip;
	}

	
	public Tipo() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
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
