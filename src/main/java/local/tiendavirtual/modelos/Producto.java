package local.tiendavirtual.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    /**
     * Atributos de la clase Producto
     */
    private int id;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int votos;
    private String imagen;
    private int categoria_id;

    public Producto() {
    }
/**
 * 
 * @param id identificador de la clase Producto
 * @param descripcion Descripcion del producto
 * @param precio Precio del producto
 * @param cantidad Cantodad del producto
 * @param votos Votos del producto
 * @param imagen URL de la imagen del producto
 * @param categoria_id Identificador de la clase Categoria
 */
    public Producto(int id, String descripcion, double precio, int cantidad, int votos, String imagen, int categoria_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.votos = votos;
        this.imagen = imagen;
        this.categoria_id = categoria_id;
    }
/**
 * 
 * @return Retorna el Identoficador de tipo entero
 */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
/**
 * 
 * @param id Recibe el identificador de la clase
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return Retorna la descripcion del producto de tipo String
 */
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }
/**
 * 
 * @param descripcion Recibe la descripcion de tipo String
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * 
     * @return Retorna el precio de tipo double
     */
    @Column(name = "precio")
    public double getPrecio() {
        return precio;
    }
/**
 * 
 * @param precio Recibe el precio del producto de tipo double
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return Retorna la catidad del producto de tipo entero
     */
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }
/**
 * 
 * @param cantidad Recibe la cantidad del producto de tipo entero
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
/**
 * 
 * @return Retorna los votos del producto de tipo entero
 * 
 */
    @Column(name = "votos")
    public int getVotos() {
        return votos;
    }
/**}
 * 
 * @param votos Recibe los votos del producto de tipo entero
 */
    public void setVotos(int votos) {
        this.votos = votos;
    }
/**
 * 
 * @return Retona la url de la imagen del producto de tipo String
 */
    @Column(name = "imagen")
    public String getImagen() {
        return imagen;
    }
/**
 * 
 * @param imagen Recibe la url de la imagen del producto
 */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
/**
 * 
 * @return Retona El identificador de la clase categoria
 */
    @Column(name = "categoria_id")
    public int getCategoria_id() {
        return categoria_id;
    }
    /**
     * 
     * @param categoria_id Recibe el identificador de la clase Categoria
     */
    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    /**
     * Retorna los datos concatenados de Producto
     */
    @Override
    public String toString() {
        return "Producto [id=" + id + "," +
                         "descripcion=" + descripcion + "," +
                         "precio=" + precio + "," +
                         "cantidad=" + cantidad + "," +
                         "votos=" + votos + "," +
                         "imagen=" + imagen + "," +
                         "categoria_id=" + categoria_id + "]";
    }
}