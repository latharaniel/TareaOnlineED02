import java.util.Scanner;
public class Saluda {
	static String nombre = null;
	private Scanner sc;
	public Saluda () {
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String nombre;
		System.out.println ("Por favor, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println ("Buenos días: "+ nombre);
		System.out.println ("Por favor, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println ("Buenos días: "+ nombre);
		
		
	}
	
	public String pideNombre(String nombre){
		
		sc = new Scanner (System.in);
		System.out.println ("Por favor, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println ("Buenos días: "+ nombre);
		return nombre;
		
		
	}
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Saluda.nombre = nombre;
	}

}

