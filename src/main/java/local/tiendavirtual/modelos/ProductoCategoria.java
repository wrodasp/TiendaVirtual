package local.tiendavirtual.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "productos_categorias")
public class ProductoCategoria {
	private int id;
	private int producto_id;
	private int categoria_id;


	public ProductoCategoria(int id, int producto_id, int categoria_id) {
		super();
		this.id = id;
		this.producto_id = producto_id;
		this.categoria_id = categoria_id;
	}

	public ProductoCategoria() {

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
	@Column(name = "producto_id")
	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
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
		return "ProductoCategoria [id=" + id + ", producto_id=" + producto_id + ", categoria_id=" + categoria_id + "]";
	}


	

}
