package local.tiendavirtual.modelos;

import javax.persistence.*;
/*
Modelo Categoria
*/
@Entity
@Table(name = "categorias")
public class Categoria {
    /**
     * atributos de la clase Categoria
     */
    private int id;
    private String descripcion;

    public Categoria() {
    }
    /**
     * Contructor de la clase categoria
     * @param id identificador de la categoria clave principal, dato tipo String
     * @param descripcion Descripcion de la categoria, dato tipo String
     */
    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    /**
     * 
     * @return retorna el id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
/**
 * 
 * @param id Recibe el id de tipo entero 
 */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return retorna la descripcion
     */
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }
/**
 * 
 * @param descripcion Recibe la descripcion
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * Retorna los datos concatenados de la categoria
 */
    @Override
    public String toString() {
        return "Categoria [id=" + id + ",descripcion=" + descripcion + "]";
    }
}