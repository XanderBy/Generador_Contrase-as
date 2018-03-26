

public class Contrasena implements java.io.Serializable {
	// Atributos
	private String servir;
	private String contrasena;
	private TipoContrasena tipo;
	

	// Constructores
	public Contrasena() {

	}

	public Contrasena(String servir, TipoContrasena tipo, String contrasena) {
		this.servir = servir;
		this.contrasena = contrasena;
		this.tipo = tipo;
	}

	// Metodos
	
	public String print() {
		return "La contraseña es: " + this.contrasena + "\nCon motivo: " + this.servir;
	}

	// Metodos Getters/Setters
	public String getServir() {
		return servir;
	}

	public void setServir(String servir) {
		this.servir = servir;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public TipoContrasena getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrasena tipo) {
		this.tipo = tipo;
	}

}
