package local.tiendavirtual.modelos;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    private int id;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "Categoria [id=" + id + ",descripcion=" + descripcion + "]";
    }
}