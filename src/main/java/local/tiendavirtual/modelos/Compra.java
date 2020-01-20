package local.tiendavirtual.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * Clase Compras
 *
 */
@Entity
@Table(name = "compras")
public class Compra {
	/**
	 * atributos de la clase Compra
	 */

    private int id;
    private String cliente_id;
    private int producto_id;
    private int cantidad;

    public Compra() {
    }
/**
 * 
 * @param id identificador de la clase, de tipo entero
 * @param cliente_id identifocador de la clase cliente de tipo entero
 * @param producto_id identificador de la clase producto de tipo entero
 * @param cantidad cantidad de compra  de tipo entero
 */
    public Compra(int id, String cliente_id, int producto_id, int cantidad) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
    }
    /**
     * 
     * @return Retorna el identificador de tipo String
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
     * @return Retorna el identificador de la clase Usuario
     */
    @Column(name = "cliente_id")
    public String getCliente_id() {
        return cliente_id;
    }
    /**
     * 
     * @param cliente_id Recibe de parametro el identificador de la clase Usuario
     */

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }
/**
 * 
 * @return Retorna el identificador de la clase Poducto de tipo entero 
 */
    @Column(name = "producto_id")
    public int getProducto_id() {
        return producto_id;
    }
    /**
     * 
     * @param producto_id Recibe el identificador de la clase Producto de tipo entero
     */
    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }
/**
 * 
 * @return Retorna la cantidad de la compra de tipo entero 
 */
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }
/**
 * 
 * @param cantidad Recibe la catidad de compra de tipo entero
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}