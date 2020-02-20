package I;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coches coche=new Coches();
		System.out.println("coches");
		System.out.println("consumo del coche "+coche.consumo());
		System.out.println("numero de puertas "+coche.numeropuertas());
		System.out.println("numero de ruedas "+coche.numeroruedas());
		System.out.println("--------------------------");
		Moto moto=new Moto();
		System.out.println("coches");
		System.out.println("consumo de la moto "+moto.consumo());
		System.out.println("precio del casco "+moto.preciocasco());
		System.out.println("numero de ruedas "+moto.numeroruedas());
		System.out.println("---------------------------");
	}

}
