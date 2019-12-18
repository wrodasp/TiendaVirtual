package local.tiendavirtual.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Comparable<Producto>{
    
    private int id;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int votos;
    private String imagen;

    public Producto() {
    }

    public Producto(int id, String descripcion, double precio, int cantidad, String imagen) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.votos = 0;
        this.imagen = imagen;
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

    @Override
    public String toString() {
        return "Producto [id=" + id + "," +
                         "descripcion=" + descripcion + "," +
                         "precio=" + precio + "," +
                         "cantidad=" + cantidad + "," +
                         "votos=" + votos + "," +
                         "imagen=" + imagen;
    }

    @Override
    public int compareTo(Producto o) {
        if (this.getDescripcion().compareTo(o.getDescripcion()) > 0) {
            return 1;
        } else if (this.getDescripcion().compareTo(o.getDescripcion()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}