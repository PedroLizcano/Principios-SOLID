package S;
//Principio de responsabilidad única significa que una clase solo debe ser responsable de una cosa
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

}
