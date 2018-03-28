import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	// Constructor

	// Metodos
	public static void menuPrincipal() throws NumberFormatException, IOException, ClassNotFoundException {
		Contrasena c1 = new Contrasena();
		MetodosGenerales mg=new MetodosGenerales();
		String contra = null, servir = null;
		int n = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("-------------------------------------------");
		System.out.println("Bienvenido!!" + "\n�Quieres generar una contrase�a?" + "\n1.Generar Contrase�a"
				+ "\n2.Mostrar Contrase�as" + "\n3.Eliminar contrase�a");
		System.out.println("-------------------------------------------");
		n = Integer.parseInt(teclado.readLine());
		switch (n) {
		case 1:// Generar Contrase�a
			System.out.println("-------------------------------------------");
			System.out.println("�De que tipo quieres generar la contrase�a?"
					+ "\n1.Contrase�a corta con letras y numeros" + "\n2.Contrase�a larga con letras y numeros"
					+ "\n3.Contrase�a corta solo con numeros" + "\n4.Contrase�a larga solo con numeros"
					+ "\n5.Contrase�a corta solo con letras" + "\n6.Contrase�a larga solo con letras");
			System.out.println("-------------------------------------------");
			n = Integer.parseInt(teclado.readLine());
			switch (n) {
			case 1:// Generar mezcla corta
				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContrasenaLetrasYNumeros(TipoContrasena.corta);
					c1 = new Contrasena(servir, TipoContrasena.corta, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					System.out.println(mg.listado.size());
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con numeros y letras corta");
				}
				break;
			case 2:// Generar mezcla larga
				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContrasenaLetrasYNumeros(TipoContrasena.larga);
					c1 = new Contrasena(servir, TipoContrasena.larga, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con numeros y letras larga");
				}
				break;
			case 3: // Generar numeros corta
				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContrasenaNumeros(TipoContrasena.corta);
					c1 = new Contrasena(servir, TipoContrasena.corta, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con numeros corta");
				}
				break;
			case 4: // generar numeros larga
				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContrasenaNumeros(TipoContrasena.larga);
					c1 = new Contrasena(servir, TipoContrasena.larga, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con numeros larga");
				}
				break;
			case 5:// Generar letras corta

				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine();
					contra = MetodosGenerales.GenerarContrasenaLetras(TipoContrasena.corta);
					c1 = new Contrasena(servir, TipoContrasena.corta, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con letras corta");
				}

				break;
			case 6:// Generar letras larga
				try {
					System.out.println("�Para que servir� la contrase�a?");
					servir = teclado.readLine(); 
					contra = MetodosGenerales.GenerarContrasenaLetras(TipoContrasena.larga);
					c1 = new Contrasena(servir, TipoContrasena.larga, contra);
					System.out.println(c1.print());
					mg.guardarContrasena(c1, contra);
					mg.guardarDatos();
				} catch (NullPointerException e) {
					System.out.println("Ha habido un error en el proceso de generar la contrase�a con letras larga");
				}

				break;
			default:
				System.out.println("Has cometido un error");
				break;
			}

			break;
		case 2:// Mostrar Contrase�as
			mg.leerDatos();
			break;
		case 3: // Eliminar Contrase�as
			mg.leerDatos();
			System.out.println("Escribe la contrase�a que quieras eliminar");
			String key=teclado.readLine();
			mg.eliminarContrasena(key);
			mg.guardarDatos();
			break;
		default:
			System.out.println("Has cometido un error");
			break;
		}
		}while(n!=10);
	}
}
