package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name="usuario")

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String cedula;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido;
	@Column(nullable=false)
	private String correo;
	@Column(nullable=false)
	private String contrasena;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	
	public Usuario(int id, String cedula, String nombre, String apellido, String correo, String contrasena) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public Usuario() {
		
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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
