package nofunciona.S;



public class Persona {
String nombre;

public Persona(String nombre) {
	super();
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public static void verpersona(Persona persona) {
	System.out.println(persona);
}

}
