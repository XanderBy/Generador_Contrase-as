import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MetodosGenerales {
	Map<String, Contraseña> listado = new HashMap<String, Contraseña>();

	public void guardarContraseña(Contraseña c, String contra) {
		listado.put(contra, c);
	}
	public  void guardarDatos() {
		Contraseña c= new Contraseña();
		try {
			FileOutputStream fos=new FileOutputStream("C:\\miproyecto\\guardar.data");
			try {
				
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				java.util.Iterator<String> it = listado.keySet().iterator();
				while(it.hasNext()){
				String key = it.next();
				
				Contraseña c1=new Contraseña(listado.get(key).getServir(), listado.get(key).getTipo(), key);
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
	public static String GenerarContraseñaLetras(TipoContraseña tipo) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		int numero = 0;
		String contraseña = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContraseña.corta) {
			for (int i = 0; i < 8; i++) {
				caracter = abecedario.charAt(r.nextInt(abecedario.length()));
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = Character.toUpperCase(caracter);
				}

				contraseña = contraseña + caracter;
			}
		} else {
			for (int i = 0; i < 14; i++) {
				caracter = abecedario.charAt(r.nextInt(abecedario.length()));
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = Character.toUpperCase(caracter);
				}

				contraseña = contraseña + caracter;
			}
		}
		return contraseña;
	}

	public static String GenerarContraseñaNumeros(TipoContraseña tipo) {
		String contraseña = "";
		int numero;
		if (tipo == TipoContraseña.corta) {
			for (int i = 0; i < 8; i++) {
				numero = (int) ((Math.random() * 9) + 1);
				contraseña = contraseña + numero;
			}

		} else {
			for (int i = 0; i < 14; i++) {
				numero = (int) ((Math.random() * 9) + 1);
				contraseña = contraseña + numero;
			}
		}
		return contraseña;
	}

	public static String GenerarContraseñaLetrasYNumeros(TipoContraseña tipo) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		int numero = 0;
		String contraseña = "";
		char caracter = ' ';
		Random r = new Random();
		if (tipo == TipoContraseña.corta) {
			for (int i = 0; i < 8; i++) {
				numero = (int) ((Math.random() * 2) + 1);
				if (numero == 1) {
					caracter = abecedario.charAt(r.nextInt(abecedario.length()));
					numero = (int) ((Math.random() * 2) + 1);
					if (numero == 1) {
						caracter = Character.toUpperCase(caracter);
					}
					contraseña = contraseña + caracter;
				} else {

					numero = (int) ((Math.random() * 9) + 1);
					contraseña = contraseña + numero;

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
					contraseña = contraseña + caracter;
				} else {

					numero = (int) ((Math.random() * 9) + 1);
					contraseña = contraseña + numero;

				}

			}
		}
		return contraseña;
	}
}
