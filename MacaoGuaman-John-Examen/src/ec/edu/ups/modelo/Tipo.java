package ec.edu.ups.modelo;

import java.io.Serializable;
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
	
	@OneToOne
	private Telefono telefono;
	
	public Tipo(int id, String tip, Telefono telefono) {
		super();
		this.id = id;
		this.tip = tip;
		this.telefono = telefono;
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


	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
