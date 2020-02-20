package D;

public class Datos {
private Conexiones conexion;

public Datos(Conexiones conexion) {
	super();
	this.conexion = conexion;
}
void getDatos() {
	conexion.getDatos();
}


}
