
public class Contacto {
/*	
	DNI (usar Integer)
	Nombre
	Apellido
	Teléfono 
	Móvil
	Mail
	Dirección
*/
    
	private String dni;
	private String nombre;
	private String apellido;
	private Integer telefono;
	private Integer movil;
	private String mail;
	private String direccion;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public Integer getMovil() {
		return movil;
	}
	public void setMovil(Integer movil) {
		this.movil = movil;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Contacto(String dni, String nombre, String apellido, Integer telefono, Integer movil, String mail,
			String direccion) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.movil = movil;
		this.mail = mail;
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Contacto [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", movil=" + movil + ", mail=" + mail + ", direccion=" + direccion + "]";
	}
	
	
}
