package local.tiendavirtual.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String roll;
	private String password;
	
	
	public Usuario() {
		
	}

	public Usuario(int id, String nombre, String apellido, String direccion, String telefono, String roll,
			String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.roll = roll;
		this.password = password;
	}


	@Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	
	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return nombre;
	}


	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Column(name = "apellido", nullable = false)
	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Column(name = "direccion", nullable = false)
	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Column(name = "Telefono", nullable = false)
	public String getTelefono() {
		return telefono;
	}


	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Column(name = "roll", nullable = false)
	public String getRoll() {
		return roll;
	}



	public void setRoll(String roll) {
		this.roll = roll;
	}


	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", roll=" + roll + ", password=" + password + "]";
	}
	
	}
