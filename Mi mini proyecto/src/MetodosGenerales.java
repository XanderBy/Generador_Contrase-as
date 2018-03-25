import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MetodosGenerales {
	Map<String, Contrase�a> listado = new HashMap<String, Contrase�a>();

	public void guardarContrase�a(Contrase�a c, String contra) {
		listado.put(contra, c);
	}
	public  void guardarDatos() {
		Contrase�a c= new Contrase�a();
		try {
			FileOutputStream fos=new FileOutputStream("C:\\miproyecto\\guardar.data");
			try {
				
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				java.util.Iterator<String> it = listado.keySet().iterator();
				while(it.hasNext()){
				String key = it.next();
				
				Contrase�a c1=new Contrase�a(listado.get(key).getServir(), listado.get(key).getTipo(), key);
				oos.writeObject(c1);
				
				}
				if(oos !=null) {
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
	public void leerDatos() {
		
	}
	public static String GenerarContrase�aLetras(TipoContrase�a tipo) {
		String abecedario = "abcdefghijklmn�opqrstuvwxyz";
		int numero = 0;
		String contrase�a = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContrase�a.corta) {
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

	public static String GenerarContrase�aNumeros(TipoContrase�a tipo) {
		String contrase�a = "";
		int numero;
		if (tipo == TipoContrase�a.corta) {
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

	public static String GenerarContrase�aLetrasYNumeros(TipoContrase�a tipo) {
		String abecedario = "abcdefghijklmn�opqrstuvwxyz";
		int numero = 0;
		String contrase�a = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContrase�a.corta) {
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
