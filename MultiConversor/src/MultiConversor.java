import java.util.Scanner;		//IMPORTAR SCANNER PARA teclado
public class MultiConversor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		
		System.out.println("1) Milla - Km.");		//MUESTRA DE OPCIONES
		System.out.println("2) Km - Yarda.");
		System.out.println("3) Libra - Kg.");
		
		System.out.print("Introduzca d�gito: ");		//SOLICITA SELECCI�N
		byte Conversor = teclado.nextByte();		//ALMACENA SELECCI�N EN Conversor
		
		if (Conversor ==  1) {		//CONDICI�N: SI Conversor == 1 (MILLA - KM)
			System.out.println("Ha elegido la conversi�n 1) Milla - Km.");		//CONFIRMACI�N DE LA SELECCI�N
			System.out.print("Introduzca las millas: ");		//SOLICITA MILLAS
			double input = teclado.nextDouble();		//ALMACENA MILLAS EN input
			double output = input * 1.60934;		//CALCULA KM Y ALMACENA EN output
			System.out.printf("Las millas introducidas son equivalentes a %f Km.",output);		//MUESTRA output
		}
		
		if (Conversor ==  2) {		//CONDICI�N: SI Conversor == 2 (KM - YARDA)
			System.out.println("Ha elegido la conversi�n 2) Km - Yarda.");		//CONFIRMACI�N DE LA SELECCI�N
			System.out.print("Introduzca los Km: ");		//SOLICITA KM
			double input = teclado.nextDouble();		//ALMACENA KM EN input
			double output = input * 1093.61;		//CALCULA YARDAS Y ALMACENA EN output
			System.out.printf("Los Km introducidas son equivalentes a %f yardas.",output);		//MUESTRA output
		}
		
		if (Conversor ==  3) {		//CONDICI�N: SI Conversor = 3 (LIBRA - KG)
			System.out.println("Ha elegido la conversi�n 3) Libra - Kg.");		//CONFIRMACI�N DE LA SELECCI�N
			System.out.print("Introduzca las libras: ");		//SOLICITA LIBRAS
			double input = teclado.nextDouble();		//ALMACENA LIBRAS EN input
			double output = input * 0.453592;		//CALCULA KG Y ALMACENA EN output
			System.out.printf("Las libras introducidas son equivalentes a %f Kg.",output);		//MUESTRA output
		}
		
	}

}
