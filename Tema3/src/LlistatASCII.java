import java.util.Scanner;

public class LlistatASCII {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String cadenaLlarga;
		String cadenaCurta;
		
		
		System.out.println("Introdueix la primera cadena:\n");
		cadenaLlarga = in.nextLine();

		
		System.out.println("Introdueix la segona cadena:\n");
		cadenaCurta = in.nextLine();
		
		if (cadenaLlarga.contains(cadenaCurta)) {
			System.out.println("S� que la cont� a partir de la posici� " + (cadenaLlarga.indexOf(cadenaCurta)+1));
		} else {
			System.out.println("La cadena curta no est� continguda dins la cadena llarga");
		}

	}

}
