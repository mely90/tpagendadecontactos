
public class Programa {
	
	
    public static void main (String [ ] args) {
    	
    	AgendaDeContactos agenda = new AgendaDeContactos();
    	Contacto contacto1 = new Contacto("33345678", "JOSE", "GOMEZ", 44576789, 1523452314, "jose@gmail.com", "av benitez 1237");
    	Contacto contacto2 = new Contacto("12345673", "ANA", "ARIAS", 44574568, 1523452310, "ana@gmail.com", "austria 3437");
    	Contacto contacto3 = new Contacto("40345674", "MARIA", "AGUIRRE", 68586789, 1523452311, "aguirremaria@gmail.com", "venezuela 5657");
    	Contacto contacto4 = new Contacto("15345677", "ROMINA", "MUÑIZ", 42086789, 1523452312, "romi@gmail.com", "maipu 876");
    	Contacto contacto5 = new Contacto("20345679", "ARIEL", "VILLALBA", 46936789, 1523452313, "ariel@gmail.com", "av belgrano 5712");
    	Contacto contacto6 = new Contacto("25345632", "HUGO", "ROLDAN", 44572459, 1523452316, "hugo90@gmail.com", "av santa fe 213");
    	Contacto contacto7 = new Contacto("38345633", "CLAUDIA", "LUNA", 44455789, 1523452319, "clau75@gmail.com", "paso 4567");
    	Contacto contacto8 = new Contacto("11345689", "DINA", "VITTO", 44574578, 1523452318, "vitto_dina@gmail.com", "alberti 8354");
    	Contacto contacto9 = new Contacto("28345623", "ENZO", "DIAZ", 74185296, 1523425896, "diazenzi@gmail.com", "lima 3456");
    	Contacto contacto10 = new Contacto("24345609", "LUCIA", "GONZALEZ", 79461385, 1523454568, "lugonz@gmail.com", "jujuy 4790");

    	agenda.guardarContacto(contacto10);
    	agenda.guardarContacto(contacto9);
    	agenda.guardarContacto(contacto8);
    	agenda.guardarContacto(contacto7);
    	agenda.guardarContacto(contacto6);
    	agenda.guardarContacto(contacto5);
    	agenda.guardarContacto(contacto4);
    	agenda.guardarContacto(contacto3);
    	agenda.guardarContacto(contacto2);
    	agenda.guardarContacto(contacto1);
    	
    	agenda.listarContactos();
    	
    	
//    	System.out.println("El contacto es: " + agenda.buscarContacto("12345673").getNombre());
    	//System.out.println("El contacto es: " + agenda.buscarContacto(44455789));

    	
/*
1-Una clase Programa, que incluya un método main() que Cree la agenda 
2-Llene la agenda con (al menos, mínimo) 5 contactos
3-Pruebe los métodos de los puntos b. iii. y iv.

En todos los casos, suministrar los modificadores de acceso más convenientes, para métodos y atributos. (public, protected, private).
*/
    
    
    }

}
