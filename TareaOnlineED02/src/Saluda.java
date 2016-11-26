import java.util.Scanner;
public class Saluda {
	static String nombre = null;
	public Saluda () {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String nombre;
		System.out.println ("Por favor, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println ("Buenos días: "+ nombre);
		System.out.println ("Por favor, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println ("Buenos días: "+ nombre);
		
		
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Saluda.nombre = nombre;
	}

}

