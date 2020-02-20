package nofunciona.L;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Muebles [] arrayMuebles= {
		new armarioespañol(),
		new armarioholandes(),
		new armariosuizo()
};
	}
public static void imprimirNumAsientos(Muebles[] arraymuebles){  
    for (Muebles mueble : arraymuebles) {
        if(mueble instanceof armarioespañol)
            System.out.println(precioarmario(mueble));
        if(mueble instanceof armarioholandes)
            System.out.println(precioarmario(mueble));
        if(mueble instanceof armariosuizo)
            System.out.println(precioarmario(mueble));
    }
}
private static char[] precioarmario(Muebles mueble) {
	// TODO Auto-generated method stub
	return null;
}



}
