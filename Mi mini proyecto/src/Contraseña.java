import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Contraseña implements java.io.Serializable {
	// Atributos
	private String servir;
	private String contraseña;
	private TipoContraseña tipo;
	// Listado
	

	// Constructores
	public Contraseña() {

	}

	public Contraseña(String servir, TipoContraseña tipo, String contraseña) {
		this.servir = servir;
		this.contraseña = contraseña;
		this.tipo = tipo;
	}

	// Metodos
	
	public String print() {
		return "La contraseña es: " + this.contraseña + "\nCon motivo: " + this.servir;
	}

	// Metodos Getters/Setters
	public String getServir() {
		return servir;
	}

	public void setServir(String servir) {
		this.servir = servir;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public TipoContraseña getTipo() {
		return tipo;
	}

	public void setTipo(TipoContraseña tipo) {
		this.tipo = tipo;
	}

}
