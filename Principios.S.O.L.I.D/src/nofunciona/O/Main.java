package nofunciona.O;

public class Main {
public static void main(String[] args) {
	Muebles[] arraymuebles= {
		new Muebles("armarioespañol"),
		new Muebles("armarioholandes")
	};
	preciomuebles(arraymuebles);
}
public static void preciomuebles(Muebles[] arraymuebles) {
	for(Muebles mueble:arraymuebles) {
		if(mueble.nombre.equals("armarioespañol")) System.out.println(200);
		if(mueble.nombre.equals("armarioholandes")) System.out.println(400);
		
		
	}
}
}
