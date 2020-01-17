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
    
    private int id;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int votos;
    private String imagen;
    private int categoria_id;

    public Producto() {
    }

    public Producto(int id, String descripcion, double precio, int cantidad, int votos, String imagen, int categoria_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.votos = votos;
        this.imagen = imagen;
        this.categoria_id = categoria_id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name = "precio")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "votos")
    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Column(name = "imagen")
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Column(name = "categoria_id")
    public int getCategoria_id() {
        return categoria_id;
    }
    
    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    
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