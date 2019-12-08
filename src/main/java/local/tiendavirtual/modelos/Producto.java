package local.tiendavirtual.modelos;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author andres
 *
 */
@Entity
@Table(name = "productos")
public class Producto {
private int id;
private String nombre;
private String descripcion;
private double precio;
private int cantidad;
private int votos;
private String imagen;
private List<Categoria> categoria;


public Producto(int id, String nombre, String descripcion, double precio, int cantidad, int votos, String imagen,
		List<Categoria> categoria) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.cantidad = cantidad;
	this.votos = votos;
	this.imagen = imagen;
	this.categoria = categoria;
}
public Producto() {
	
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
@Column(name = "descripcion", nullable = false)
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
@Column(name = "precio", nullable = false)
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
@Column(name = "cantidad", nullable = false)
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
@Column(name = "votos", nullable = false)
public int getVotos() {
	return votos;
}
public void setVotos(int votos) {
	this.votos = votos;
}
@Column(name = "imagen", nullable = false)
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
@OneToMany(cascade = {CascadeType.ALL})
@JoinColumn(name="productos", referencedColumnName = "id", nullable = false)
public List<Categoria> getCategoria() {
	return categoria;
}
public void setCategoria(List<Categoria> categoria) {
	this.categoria = categoria;
}
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
			+ ", cantidad=" + cantidad + ", votos=" + votos + ", imagen=" + imagen + ", categoria=" + categoria + "]";
}


}
