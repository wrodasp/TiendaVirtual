package local.tiendavirtual.modelos;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    private int id;
    private String descripcion;

    public Categoria() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}