import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Contrase�a implements java.io.Serializable {
	// Atributos
	private String servir;
	private String contrase�a;
	private TipoContrase�a tipo;
	// Listado
	

	// Constructores
	public Contrase�a() {

	}

	public Contrase�a(String servir, TipoContrase�a tipo, String contrase�a) {
		this.servir = servir;
		this.contrase�a = contrase�a;
		this.tipo = tipo;
	}

	// Metodos
	
	public String print() {
		return "La contrase�a es: " + this.contrase�a + "\nCon motivo: " + this.servir;
	}

	// Metodos Getters/Setters
	public String getServir() {
		return servir;
	}

	public void setServir(String servir) {
		this.servir = servir;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public TipoContrase�a getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrase�a tipo) {
		this.tipo = tipo;
	}

}
