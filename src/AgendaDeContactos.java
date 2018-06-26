import java.util.HashMap;

public class AgendaDeContactos {
	
	/*
	 * Una clase AgendaDeContactos con un atributo “contactos“ de tipo Map<String,
	 * Contacto> y los siguientes métodos: Un constructor que inicialice el atributo
	 * “contactos” con un mapa vacío. void guardarContacto(Contacto contacto), que
	 * guarda un contacto usando como Key del Map el DNI.
	 * 
	 * Contacto buscarContacto(String telefono), que retorna el contacto guardado en
	 * la key “DNI”. En caso de no existir, el método debe lanzar la excepción
	 * ContactNotFoundException.
	 * 
	 * Contacto buscarContacto(Integer dni), que retorna el contacto guardado en la
	 * key “DNI”. En caso de no existir, el método debe lanzar la excepción
	 * ContactNotFoundException.
	 * 
	 * void listarContactos() que liste por la salida estándar la lista de
	 * contactos, llamando al método toString() de cada uno. Tal método deberá ser
	 * redefinido para las instancias de la clase Contacto.
	 */

	private HashMap<String, Contacto> contactos;

	public AgendaDeContactos() {

		this.contactos = new HashMap<>();

	}

	public void guardarContacto(Contacto contacto) {

		this.contactos.put(contacto.getDni(), contacto);

	}

	public Contacto buscarContacto(Integer telefono) {

		for (Contacto contacto : this.contactos.values()) {

			if (contacto.getTelefono().equals(telefono)) {

				return contacto;
			}

		}
		return null; // ContactNotFoundException.

	}

	public Contacto buscarContacto(String dni) {

		if (this.contactos.containsKey(dni)) {

			return this.contactos.get(dni);

		} else {

			return null; // ContactNotFoundException.

		}
	}

	public void listarContactos() {
		for (Contacto contacto : this.contactos.values()) {
			
			System.out.println(contacto);
			
		}

	};

}
