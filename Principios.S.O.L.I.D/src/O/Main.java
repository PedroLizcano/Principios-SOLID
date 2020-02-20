package O;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Muebles [] arrayMuebles= {
		new armarioespañol(),
		new armarioholandes(),
		new armariosuizo()
};
for(Muebles mueble:arrayMuebles) {
	System.out.println(mueble.precioarmario());
}
	}

}
