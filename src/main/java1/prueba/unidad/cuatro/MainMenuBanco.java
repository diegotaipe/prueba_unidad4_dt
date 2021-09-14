package prueba.unidad.cuatro;

import java.util.Scanner;

public class MainMenuBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		int montoTransferir;
		int saldoDisponible = 2500;
		int saldo;
		String claveIngreso;
		final String clave = "85DB";
		boolean bandera = true;
		String cuentaDestino;
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		do {
			System.out.println("Ingrese clave");
			claveIngreso = lectorString.nextLine();
			bandera = clave.equals(claveIngreso);
			System.out.println(bandera);
			if (claveIngreso == "-1") {
				// bandera=false;
				System.out.println("Gracias por preferirnos");
				break;
			}
		} while (bandera == false);

		do {
			System.out.println();
			System.out.println("*########################");
			System.out.println("BANCO PICHINCHA, elija una opción:");
			System.out.println("1. Consultar pagos ");
			System.out.println("2. Realizar transferencia ");
			System.out.println("3. SALIR ");
			System.out.println("#########################");
			opcion = lectorInt.nextInt();

			if (opcion == 1) {
				System.out.println("***** Consulta pagos *****");
				System.out.println("No tiene ningún pago pendiente");
			}
			if (opcion == 2) {
				System.out.println("***** Realizar transferencia *****");
				System.out.println("Ingrese la cuenta de destino: ");
				cuentaDestino = lectorString.nextLine();
				System.out.println("Ingrese monto a transferir: ");
				montoTransferir = lectorInt.nextInt();
				saldo = saldoDisponible - montoTransferir;
				System.out.println("Su nuevo saldo es: " + saldo);
			}
		} while (opcion != 3);
		System.out.println("Gracias por preferirnos");
	}

}
