import java.util.Scanner;
public class Saluda {

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

}

