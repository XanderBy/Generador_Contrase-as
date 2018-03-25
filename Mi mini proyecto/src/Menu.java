import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	// Constructor

	// Metodos
	public static void menuPrincipal() throws NumberFormatException, IOException {
		Contraseña c1 = new Contraseña();
		MetodosGenerales mg=new MetodosGenerales();
		String contra = null, servir = null;
		int n = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("-------------------------------------------");
		System.out.println("Bienvenido!!" + "\n¿Quieres generar una contraseña?" + "\n1.Generar Contraseña"
				+ "\n2.Mostrar Contraseñas" + "\n3.Eliminar contraseña");
		System.out.println("-------------------------------------------");
		n = Integer.parseInt(teclado.readLine());
		switch (n) {
		case 1:// Generar Contraseña
			System.out.println("-------------------------------------------");
			System.out.println("¿De que tipo quieres generar la contraseña?"
					+ "\n1.Contraseña corta con letras y numeros" + "\n2.Contraseña larga con letras y numeros"
					+ "\n3.Contraseña corta solo con numeros" + "\n4.Contraseña larga solo con numeros"
					+ "\n5.Contraseña corta solo con letras" + "\n6.Contraseña larga solo con letras");
			System.out.println("-------------------------------------------");
			n = Integer.parseInt(teclado.readLine());
			switch (n) {
			case 1:// Generar mezcla corta
				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContraseñaLetrasYNumeros(TipoContraseña.corta);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.corta, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
					System.out.println(mg.listado.size());
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con numeros y letras corta");
				}
				break;
			case 2:// Generar mezcla larga
				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContraseñaLetrasYNumeros(TipoContraseña.larga);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.larga, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con numeros y letras larga");
				}
				break;
			case 3: // Generar numeros corta
				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContraseñaNumeros(TipoContraseña.corta);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.corta, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con numeros corta");
				}
				break;
			case 4: // generar numeros larga
				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContraseñaNumeros(TipoContraseña.larga);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.larga, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con numeros larga");
				}
				break;
			case 5:// Generar letras corta

				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContraseñaLetras(TipoContraseña.corta);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.corta, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con letras corta");
				}

				break;
			case 6:// Generar letras larga
				try {
					System.out.println("¿Para que servirá la contraseña?");
					servir = teclado.readLine(); 
					contra = MetodosGenerales.GenerarContraseñaLetras(TipoContraseña.larga);
					System.out.println(contra);
					c1 = new Contraseña(servir, TipoContraseña.larga, contra);
					System.out.println(c1.print());
					mg.guardarContraseña(c1, contra);
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contraseña con letras larga");
				}

				break;
			default:
				System.out.println("Has cometido un error");
				break;
			}

			break;
		case 2:// Mostrar Contraseñas
			break;
		case 3: // Eliminar Contraseñas
			break;
		default:
			System.out.println("Has cometido un error");
			break;
		}
		}while(n!=10);
	}
}
