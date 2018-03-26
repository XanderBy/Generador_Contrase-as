import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MetodosGenerales {
	Map<String, Contrasena> listado = new HashMap<String, Contrasena>();

	public void guardarContrase�a(Contrasena c, String contra) {
		listado.put(contra, c);
	}

	public void guardarDatos() {
		Contrasena c = new Contrasena();
		try {
			FileOutputStream fos = new FileOutputStream("C:\\miproyecto\\guardar.txt");
			try {
				System.out.println("1");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				java.util.Iterator<String> it = listado.keySet().iterator();
				while (it.hasNext()) {
					String key = it.next();

					Contrasena c1 = new Contrasena(listado.get(key).getServir(), listado.get(key).getTipo(), key);
					oos.writeObject(c1);

				}
				if (oos != null) {
					oos.close();
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unused")
	public void leerDatos() throws IOException, ClassNotFoundException {
		
		File f = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		f = new File("C:\\miproyecto\\guardar.txt");
		System.out.println("hola");
		try {
		if (f.exists()) {
			System.out.println("hola2");
				fis = new FileInputStream(f);
					ois = new ObjectInputStream(fis);
					while (true) {
						System.out.println("hola3");
						Contrasena c1 = null;
							c1 = (Contrasena) ois.readObject();
							System.out.println(c1.print());
							
							String contrasena = c1.getContrasena();
							Contrasena contra = c1;
							listado.put(contrasena, contra);
					}
		}
				if (ois != null) {
						ois.close();
						fis.close();
				}
		}catch(EOFException e) {
			System.out.println("");
		}
			
		
		
	}

	public static String GenerarContrase�aLetras(TipoContrasena tipo) {
		String abecedario = "abcdefghijklmn�opqrstuvwxyz";
		int numero = 0;
		String contrase�a = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContrasena.corta) {
			for (int i = 0; i < 8; i++) {
				caracter = abecedario.charAt(r.nextInt(abecedario.length()));
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = Character.toUpperCase(caracter);
				}

				contrase�a = contrase�a + caracter;
			}
		} else {
			for (int i = 0; i < 14; i++) {
				caracter = abecedario.charAt(r.nextInt(abecedario.length()));
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = Character.toUpperCase(caracter);
				}

				contrase�a = contrase�a + caracter;
			}
		}
		return contrase�a;
	}

	public static String GenerarContrase�aNumeros(TipoContrasena tipo) {
		String contrase�a = "";
		int numero;
		if (tipo == TipoContrasena.corta) {
			for (int i = 0; i < 8; i++) {
				numero = (int) ((Math.random() * 9) + 1);
				contrase�a = contrase�a + numero;
			}

		} else {
			for (int i = 0; i < 14; i++) {
				numero = (int) ((Math.random() * 9) + 1);
				contrase�a = contrase�a + numero;
			}
		}
		return contrase�a;
	}

	public static String GenerarContrase�aLetrasYNumeros(TipoContrasena tipo) {
		String abecedario = "abcdefghijklmn�opqrstuvwxyz";
		int numero = 0;
		String contrase�a = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContrasena.corta) {
			for (int i = 0; i < 8; i++) {
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = abecedario.charAt(r.nextInt(abecedario.length()));
					numero = (int) ((Math.random() * 2) + 1);
					if (numero == 1) {
						caracter = Character.toUpperCase(caracter);
					}
					contrase�a = contrase�a + caracter;
				} else {

					numero = (int) ((Math.random() * 9) + 1);
					contrase�a = contrase�a + numero;

				}

			}
		} else {
			for (int i = 0; i < 14; i++) {
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = abecedario.charAt(r.nextInt(abecedario.length()));
					numero = (int) ((Math.random() * 2) + 1);
					if (numero == 1) {
						caracter = Character.toUpperCase(caracter);
					}
					contrase�a = contrase�a + caracter;
				} else {

					numero = (int) ((Math.random() * 9) + 1);
					contrase�a = contrase�a + numero;

				}

			}
		}
		return contrase�a;
	}
}
