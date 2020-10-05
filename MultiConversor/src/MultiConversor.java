import java.util.Scanner;		//IMPORTAR SCANNER PARA teclado
public class MultiConversor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		
		System.out.println("1) Milla - Km.");		//MUESTRA DE OPCIONES
		System.out.println("2) Km - Yarda.");
		System.out.println("3) Libra - Kg.");
		
		System.out.print("Introduzca dígito: ");		//SOLICITA SELECCIÓN
		byte Conversor = teclado.nextByte();		//ALMACENA SELECCIÓN EN Conversor
		
		if (Conversor ==  1) {		//CONDICIÓN: SI Conversor == 1 (MILLA - KM)
			System.out.println("Ha elegido la conversión 1) Milla - Km.");		//CONFIRMACIÓN DE LA SELECCIÓN
			System.out.print("Introduzca las millas: ");		//SOLICITA MILLAS
			double input = teclado.nextDouble();		//ALMACENA MILLAS EN input
			double output = input * 1.60934;		//CALCULA KM Y ALMACENA EN output
			System.out.printf("Las millas introducidas son equivalentes a %f Km.",output);		//MUESTRA output
		}
		
		if (Conversor ==  2) {		//CONDICIÓN: SI Conversor == 2 (KM - YARDA)
			System.out.println("Ha elegido la conversión 2) Km - Yarda.");		//CONFIRMACIÓN DE LA SELECCIÓN
			System.out.print("Introduzca los Km: ");		//SOLICITA KM
			double input = teclado.nextDouble();		//ALMACENA KM EN input
			double output = input * 1093.61;		//CALCULA YARDAS Y ALMACENA EN output
			System.out.printf("Los Km introducidas son equivalentes a %f yardas.",output);		//MUESTRA output
		}
		
		if (Conversor ==  3) {		//CONDICIÓN: SI Conversor = 3 (LIBRA - KG)
			System.out.println("Ha elegido la conversión 3) Libra - Kg.");		//CONFIRMACIÓN DE LA SELECCIÓN
			System.out.print("Introduzca las libras: ");		//SOLICITA LIBRAS
			double input = teclado.nextDouble();		//ALMACENA LIBRAS EN input
			double output = input * 0.453592;		//CALCULA KG Y ALMACENA EN output
			System.out.printf("Las libras introducidas son equivalentes a %f Kg.",output);		//MUESTRA output
		}
		
	}

}
