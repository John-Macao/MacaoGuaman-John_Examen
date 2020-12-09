package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity
@Table(name="telefono")

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String tel;
	
	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn
	private Operadora operadora;
	
	public Telefono(int id, String tel, Usuario usuario, Tipo tipo, Operadora operadora) {
		super();
		this.id = id;
		this.tel = tel;
		this.usuario = usuario;
		this.tipo = tipo;
		this.operadora = operadora;
	}
	
	public Telefono() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public Operadora getOperadora() {
		return operadora;
	}


	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
   
}
