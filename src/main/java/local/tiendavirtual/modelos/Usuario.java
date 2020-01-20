package local.tiendavirtual.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String clave;
    private String roll;

    public Usuario() {
    }
    /**
     * Contructor para la clases usuario
     * @param nombre recibe el nombre del usuario
     * @param apellido recibe el apellido del usuario
     * @param direccion recibe el direccion del usuario
     * @param telefono recibe el telefono del usuario
     * @param correo recibe el correo del usuario
     * @param clave recibe el clave del usuario
     * @param roll recibe el roll del usuario
     */
    public Usuario(String nombre, String apellido, String direccion,
            String telefono, String correo, String clave, String roll) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
        this.roll = roll;
    }
    /**
     *Get del atributo nombre
     * @return Retorna un String 
     */
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }
    /**
     *Set del atributo nombre
     * @param nombre Recibe un string 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *Get del atributo apellido
     * @return Retorna un String 
     */
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }
    /**
     *Set del atributo apellido
     * @param apellido Recibe un string 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     *Get del atributo direccion
     * @return Retorna un String 
     */
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }
    /**
     *Set del atributo apellido
     * @param direccion Recibe un string 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     *Get del atributo telefono
     * @return Retorna un String 
     */
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }
    /**
     *Set del atributo telefono
     * @param telefono Recibe un string 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     *Get del atributo roll
     * @return Retorna un String 
     */
    @Column(name = "roll")
    public String getRoll() {
        return roll;
    }
    /**
     *Set del atributo roll
     * @param roll Recibe un string 
     */
    public void setRoll(String roll) {
        this.roll = roll;
    }
    /**
     *Get del atributo correo
     * @return Retorna un String 
     */
    @Id
    @Column(name = "correo")
    public String getCorreo() {
        return correo;
    }
    /**
     *Set del atributo correo
     * @param correo Recibe un string 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     *Get del atributo clave
     * @return Retorna un String 
     */
    @Column(name = "clave")
    public String getClave() {
        return clave;
    }
    /**
     *Set del atributo clave
     * @param clave Recibe un string 
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    /**
     *metodo toString para mostrar los datos del usuario
     *  @return Retorna un string con los datos de Usuario
     */
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", "
                + "apellido=" + apellido + ", "
                + "direccion=" + direccion + ", "
                + "telefono=" + telefono + ", "
                + "correo=" + correo + ", "
                + "clave=" + clave;
    }
}
